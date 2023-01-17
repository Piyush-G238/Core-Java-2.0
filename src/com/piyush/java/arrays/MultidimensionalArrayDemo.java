package com.piyush.java.arrays;

public class MultidimensionalArrayDemo {
    public static void main(String[] args) {
//      creating an array of type int which will contain 4 array and each array will have size of 5 elements
//      twoD = { {}, {}, {}, {} };
        int twoD[][] = new int[4][5];

        int i = 0;
        int j = 0;
        int k = 0;

//      initializing array elements by nested for loops
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

//      elements will be initialized as follows:
        /*
        twoD[0][0]=0;
        twoD[0][1]=1;
        twoD[0][2]=2;
        twoD[0][3]=3;
        twoD[0][4]=4; and so on
        */

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }

    }
}
