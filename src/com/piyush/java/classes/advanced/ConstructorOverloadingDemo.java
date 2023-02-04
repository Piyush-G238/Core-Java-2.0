package com.piyush.java.classes.advanced;

class Box {
    double width, depth, height;

    public Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public Box(Box box){
        this.width = box.width;
        this.depth = box.depth;
        this.height = box.height;
    }

    public Box() {
        this.depth = this.width = this.height = -1;
    }

    public Box(double len) {
        this.depth = this.width = this.height = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(4.56);
        Box box3 = new Box(5.55,7.89,10.64);
        Box box4 = new Box(box2);

        System.out.println(box2 == box4);

        double vol1 = box1.volume();
        double vol2 = box2.volume();
        double vol3 = box3.volume();

        System.out.println("volume of box1 : "+vol1);
        System.out.println("volume of box2 : "+vol2);
        System.out.println("volume of box3 : "+vol3);
    }
}
