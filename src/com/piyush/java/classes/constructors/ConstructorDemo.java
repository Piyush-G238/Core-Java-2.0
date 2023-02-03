package com.piyush.java.classes.constructors;

class Box{
    double width, depth, height;

    public Box(){
        width = depth = height = 10;
    }

    public Box(double width, double height, double depth){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    double volume(){
        width *= 2.56;
        return width * depth * height;
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box(3,6,9);
        double vol1 = myBox1.volume();
        double vol2 = myBox2.volume();

        System.out.println("volume1 : "+vol1);
        System.out.println("volume2 : "+vol2);
    }
}
