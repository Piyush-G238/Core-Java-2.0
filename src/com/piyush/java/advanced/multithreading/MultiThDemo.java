package com.piyush.java.advanced.multithreading;

public class MultiThDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("current name of thread is : "+thread.getName());
        thread.setName("myThread");

        try{
            System.out.println("current name of thread is : "+ thread.getName());
            for (int i=0; i<5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
