package com.piyush.java.classes;

//this class defines a new data type called BOX, it will be used to create objects of type BOX
class Box{
    double width, height, depth;
}
public class ClassDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 10.55;
        myBox.depth = 21.65;
        myBox.height = 38.98;

        double volume = Math.round(myBox.depth * myBox.height * myBox.width);

        System.out.println("volume of current box is :"+ volume);
    }
}
