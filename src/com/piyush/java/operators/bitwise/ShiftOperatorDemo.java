package com.piyush.java.operators.bitwise;

public class ShiftOperatorDemo {
    public static void main(String[] args) {
        int i = 2;

//      initial value of variable operand is 12
        int operand1 = 12;

//      Now, below statement is equivalent to, operand = operand << i
//      It means that program will be left shift all the bits of operand by i times
//      For the first time, operand will become 24 (12 * 2)
//      For the second time, operand will become 48 (24 * 2)

        operand1 <<= i;

        System.out.println("value of operand1 becomes : " + operand1);

        int operand2 = -8;

//      Now, below statement is equivalent to, operand = operand >> i
//      It means that program will be right shift all the bits of operand by i times
//      For the first time, operand will become -4 (-8 / 2)
//      For the second time, operand will become -2 (-4 / 2)
        operand2 >>= i;

        System.out.println("value of operand2 becomes : " + operand2);
    }
}
