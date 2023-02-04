package com.piyush.java.advanced.multithreading;

public class IsAliveDemo implements Runnable{
    Thread t;
    String name;
    long duration;
    public IsAliveDemo(String name, long duration){
        this.name = name;
        this.duration = duration;
        t = new Thread(this,this.name);
    }
    public static void main(String[] args) throws InterruptedException {
        IsAliveDemo t1 = new IsAliveDemo("t1",1000);
        IsAliveDemo t2 = new IsAliveDemo("t2",2000);
        IsAliveDemo t3 = new IsAliveDemo("t3",5000);

        t1.t.start();
        t2.t.start();
        t3.t.start();

        System.out.println(t1.t.isAlive());
        System.out.println(t2.t.isAlive());
        System.out.println(t3.t.isAlive());

        t1.t.join(2000);
        t2.t.join();
        t3.t.join();

        System.out.println(t1.t.isAlive());
        System.out.println(t2.t.isAlive());
        System.out.println(t3.t.isAlive());
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.t.getName()+" "+i);
            try {
                Thread.sleep(this.duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(t.getName()+" exiting");
    }
}
