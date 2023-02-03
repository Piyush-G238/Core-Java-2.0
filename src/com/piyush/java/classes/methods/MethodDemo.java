package com.piyush.java.classes.methods;

class Box {
    double width, height, depth;

    double calcVolume() {
        return width * height * depth;
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.depth = 15;
        myBox.width = 10;
        myBox.height = 20;

        double volume = myBox.calcVolume();

        System.out.println("volume of current box is : " + volume);
    }
}
