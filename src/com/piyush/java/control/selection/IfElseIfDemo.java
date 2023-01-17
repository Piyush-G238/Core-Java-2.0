package com.piyush.java.control.selection;

public class IfElseIfDemo {
    public static void main(String[] args) {
        int monthNumber = 4;
        String season;

//      since monthNumber is 4, this if will not be executed
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2)
            season = "winter";
//      since monthNumber is 4, this else if will be executed and season will be assigned with value "spring"
        else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5)
            season = "spring";
//      since, previous if was executed, this else if block is skipped
        else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8)
            season = "summer";
//      this else will be skipped
        else
            season = "Autumn";

        System.out.println("April is the season of : " + season);
    }
}
