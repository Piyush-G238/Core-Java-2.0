package com.piyush.java.classes.constructors;

class MyStack{
    int[] array;
    int top;

    public MyStack(){
        array = new int[10];
        top = -1;
    }

    public void push(int e){
        if (top >= array.length-1){
            System.out.println("stack is full");
            return;
        }
        array[top++] = e;
    }

    public int pop(){
        if (top < 0){
            System.out.println("stack is empty");
            return -1;
        }
        int e = array[top];
        array[top--]=0;
        return e;
    }
}
public class StackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        int e = stack.pop();
        System.out.println(e);
    }
}
