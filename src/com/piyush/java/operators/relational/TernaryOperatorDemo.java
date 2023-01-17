package com.piyush.java.operators.relational;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
//      initial value of i is 10
        int i = 10;

//      Now, condition will be checked whether i less than 0 or not,
//      if i < 0 then -i is assigned to k else i will be assigned to k
//      We know that 10 > 0, so k is assigned with value i (10)
        int k = (i < 0) ? -i : i;

        System.out.println("Absolute value of i is : " + k);

//      Now value of i is -10
        i = -10;

//      Now, condition will be checked whether i less than 0 or not,
//      if i < 0 then -i is assigned to k else i will be assigned to k
//      We know that -10 < 0, so k is assigned with value -i (-(-10)) = 10
        k = (i < 0) ? -i : i;

        System.out.println("Absolute value of i is : " + k);
    }
}
