package com.piyush.java.control.iteration;

public class ForDemo {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 5;
        if (num < 2)
            isPrime = false;
        else
            isPrime = true;

//      this loop will at-most run sqrt(n) times
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
