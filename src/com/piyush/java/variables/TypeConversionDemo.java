package com.piyush.java.variables;

public class TypeConversionDemo {
    public static void main(String[] args) {
        byte b;

        int i = 257;

        double d = 323.142;

//      this will throw an error as, these are incompatible types for conversion
//      b = i;

//      here, variable will be storing value 1 of type byte, which is 257 % 256 = 1
        b = (byte) i;

//      here, i will be storing value 323 of type int, and all the decimal points will be removed
        i = (int) d;
    }
}
