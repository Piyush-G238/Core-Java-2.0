package com.piyush.java.control.iteration;

public class ForEachMultiDimensionArray {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

//      After running loop:
//      resultant array will be: [[1,2,3,4,5], [2,4,6,8,10], [3,6,9,12,15]]

        for (int[] x : nums) {
            for (int e : x) {
                sum += e;
            }
        }

        System.out.println("The total sum is : " + sum);
    }
}
