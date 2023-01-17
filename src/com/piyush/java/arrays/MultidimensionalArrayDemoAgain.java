package com.piyush.java.arrays;

public class MultidimensionalArrayDemoAgain {
    public static void main(String[] args) {
//      this is a valid syntax in arrays
        int[][] twoD = new int[4][];

//      setting size of each array manually.
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

//      this will look like this:
//      twoD = [ [a1] , [a1, b1] , [a1, b1, c1] , [a1, b1, c1, d1] ]

        int i = 0;
        int j = 0;
        int k = 0;

//      setting values on different arrays
        for (i = 0; i < twoD.length; i++) {
            for (j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

//      this will look like this:
//      twoD[][] = [ [0], [1,2], [3,4,5], [6,7,8,9] ]
    }
}
