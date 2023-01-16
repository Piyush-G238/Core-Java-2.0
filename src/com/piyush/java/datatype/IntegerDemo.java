package com.piyush.java.datatype;

public class IntegerDemo {
    public static void main(String[] args) {
//      variable lightSpeed is of type int
        int lightSpeed = 186000;

//      variables - days, second and distance are of type long
        long days, seconds, distance;

//      storing days with value 1000
        days = 1000;

//      seconds will store 86400000
        seconds = days * 24 * 60 * 60;

//      distance will store 16070400000000, this value will be out of the range of int type
        distance = lightSpeed * seconds;
    }
}
