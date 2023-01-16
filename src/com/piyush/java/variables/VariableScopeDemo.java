package com.piyush.java.variables;

public class VariableScopeDemo {
    public static void main(String[] args) {
//      here, x is the local variable of main method
        int x = 10;

        if (x == 10) {
//          here, y is the local variable of if block
            int y = 20;

//          here, x is accessible
            System.out.println("x = " + x);
            System.out.println("y = " + y);

//          Now, x will become 20
            x = y * 2;
        }

//      variable y will not be resolved, as scope of y was within the if block
//      y=100;

        System.out.println("x = " + x);
    }
}
