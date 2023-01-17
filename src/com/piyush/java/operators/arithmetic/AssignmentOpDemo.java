package com.piyush.java.operators.arithmetic;

public class AssignmentOpDemo {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2, num3 = 3;

//      this expression is equal to, num1 = num1 + 5
//      so, num1 will store 6
        num1 += 5;

//      this expression is equal to, num2 = num2 * 4
//      so, num2 will store 8
        num2 *= 4;

//      this expression is equal to, num3 = num3 + num1 + num2
//      so, num3 will store 17
        num3 += num1 + num2;

//      Now, num3 = num3 % 6, which will store value 5
        num3 %= 6;

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num3 = "+num3);
    }
}
