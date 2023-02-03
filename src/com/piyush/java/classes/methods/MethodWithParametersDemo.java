package com.piyush.java.classes.methods;

class Box1 {
    double width, depth, height;

    double calcVol() {
        return width * height * depth;
    }

    void setDimension(int w, int d, int h) {
        width = w;
        depth = d;
        height = h;
    }
}

public class MethodWithParametersDemo {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        myBox1.setDimension(10, 20, 15);
        double volume = myBox1.calcVol();
        System.out.println("volume of this box is : " + volume);
    }
}
