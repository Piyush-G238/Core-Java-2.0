package com.piyush.java.operators.arithmetic;

public class IncrementDemo {
    public static void main(String[] args) {
//      initial values
//      num1 = 1
//      num2 = 2
        int num1 = 1, num2 = 2;

        int num3, num4;

//      Now, num2 will be incremented first, num2 = num2 + 1 = 3
//      then, num3 can use value of num2 to store, so num3 = 3

        num3 = ++num2;

//      Now, num1 original value will be used to store data in variable num4
//      so, num4 will store 1, and then num1 will be incremented by 1
//      so, num1 becomes 2

        num4 = num1++;

        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
        System.out.println("num3 : "+num3);
        System.out.println("num4 : "+num4);
    }
}
