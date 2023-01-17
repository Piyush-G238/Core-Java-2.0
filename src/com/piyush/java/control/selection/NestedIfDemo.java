package com.piyush.java.control.selection;

public class NestedIfDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 22;
        int k = 98;
        int a = 15, b = 20, c = 35, d = 44;

//      As, i==10, this if block will be accepted
        if (i == 10) {
//          since, j>22, this if will not be executed
            if (j < 20)
                a = b;
//          since, k<100, this if will not be executed
            if (k > 100)
                c = d;
//          As none of condition is satisfied, so this else block will be executed
            else
                a = c;
        } else
            a = d;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
    }
}
