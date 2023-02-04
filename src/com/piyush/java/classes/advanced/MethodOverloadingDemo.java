package com.piyush.java.classes.advanced;

class MyClass{
    void test(){
        System.out.println("no parameter");
    }
    void test(int a){
        System.out.println("one parameter of int type");
    }
    void test(int a, int b){
        System.out.println("two parameters and both are of int type");
    }
    void test(double a){
        System.out.println("one parameter of type double");
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.test();
        obj.test(10);
        obj.test(10,20);
        obj.test(5.85);
    }
}
