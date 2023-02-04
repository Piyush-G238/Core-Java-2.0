package com.piyush.java.classes.advanced;

public class StaticDemo {
    static int num1 = 3;
    static int b;

    static {
        System.out.println("static block intialized");
        b = num1 * 10;
    }

    static void meth(int x) {
        System.out.println("x : " + x);
        System.out.println("num1 : " + num1);
        System.out.println("b : " + b);
    }

    public static void main(String[] args) {
        StaticDemo.meth(10);
    }
}
