package com.piyush.java.control.selection;

public class SwitchDemo {
    public static void main(String[] args) {
        int monthNumber = 4;

        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                System.out.println("match found");
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "bogus month";
                System.out.println("No match found");
        }
        System.out.println("April is the month of : " + season);
    }
}
