package com.ignek.core.java.oops;

class AreaCalculator{
    double floorArea(double length, double width){
        return length * width;
    }

    double wallArea(double height, double width){
        return height * width;
    }

    double plotArea(double length, double width){
        return length * width;
    }
}

public class AreaCalMethods {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Floor Area: " + areaCalculator.floorArea(10, 12));
        System.out.println("Wall Area: " + areaCalculator.wallArea(8, 15));
        System.out.println("Plot Area: " + areaCalculator.plotArea(40, 50));
    }
}
