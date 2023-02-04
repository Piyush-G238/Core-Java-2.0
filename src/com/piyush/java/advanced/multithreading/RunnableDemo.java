package com.piyush.java.advanced.multithreading;

class MyTask implements Runnable{

    Thread t;

    public MyTask(){
        t = new Thread(this, "myTask");
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        MyTask task = new MyTask();
        task.t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName()+" "+i);
            Thread.sleep(500);
        }

    }
}
