package com.piyush.java.control.jumping;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
//          when i % 2 == 0, continue statement skips the other line of code below it,
//          and reaches to increment/decrement statement
            if (i % 2 == 0)
                continue;
            System.out.println("");
        }
    }
}
