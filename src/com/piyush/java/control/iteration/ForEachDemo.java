package com.piyush.java.control.iteration;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        System.out.println("Sum of array elements is : " + sum);

    }
}
