package com.piyush.java.advanced.multithreading;

class Data{
    int entity;
    boolean inserted = false;

    public synchronized void produce(int n) throws InterruptedException {
        while (inserted){
            wait();
        }
        this.entity = n;
        System.out.println("produce : "+entity);
        inserted = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while(!inserted){
            wait();
        }
        System.out.println("consume : "+entity);
        inserted = false;
        notify();
    }
}
class Producer implements Runnable{
    Data data;
    Thread t;

    public Producer(Data d){
        this.data = d;
        this.t = new Thread(this);
    }
    @Override
    public void run() {
        int i=0;
        while (i < 6){
            try {
                data.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class Consumer implements Runnable{
    Data data;
    Thread t;
    public Consumer(Data data){
        this.data = data;
        this.t = new Thread(this);
    }
    @Override
    public void run() {
        int i=0;
        while (i < 6){
            try {
                data.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class InterThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.t.start();
        c.t.start();
    }
}
