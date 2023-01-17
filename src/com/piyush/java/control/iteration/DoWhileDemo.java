package com.piyush.java.control.iteration;

public class DoWhileDemo {
    public static void main(String[] args) {
        int choice = 6;

        do {
            System.out.println("current choice is : "+ choice);
            choice++;
        }while(choice >= 1 && choice <= 5);
    }
}
