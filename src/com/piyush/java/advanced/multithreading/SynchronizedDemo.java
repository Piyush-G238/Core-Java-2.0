package com.piyush.java.advanced.multithreading;

class Resource{
    void unSynchronizedMessage(String msg){
        System.out.print("[ ");
        System.out.print(msg);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(" ]");
        }
    }

    synchronized void synchronizedMessage(String msg){
        System.out.print("[ "+msg);
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.print(" ]");
        }
    }
}

class PrintTask implements Runnable{
    Resource resource;
    Thread t;
    String msg;
    public PrintTask(String msg){
        resource = new Resource();
        t=new Thread(this);
        this.msg = msg;
    }
    @Override
    public void run() {
        resource.synchronizedMessage(this.msg);
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        PrintTask t1 = new PrintTask("hello");
        PrintTask t2 = new PrintTask("synchronized");
        PrintTask t3 = new PrintTask("world");

        t1.t.setPriority(Thread.MAX_PRIORITY);
        t2.t.setPriority(Thread.NORM_PRIORITY);
        t3.t.setPriority(Thread.MIN_PRIORITY);

        t1.t.start();
        t2.t.start();
        t3.t.start();

        t1.t.join();
        t2.t.join();
        t3.t.join();
    }
}
//message without synchronization
//[ synchronized[ world[ hello ] ] ]

//message with synchronization
//[ hello[ synchronized[ world ] ] ]