package com.ignek.core.java.oops;

interface interface1{
    default void display(){
        System.out.println("from oops.interface1");
    }
}

interface interface2{
    default void display(){
        System.out.println("from oops.interface2");
    }
}

class DiamondProblemSolution implements interface1, interface2{
    @Override
    public void display() {
        interface1.super.display();
        interface2.super.display();
        System.out.println("from class");
    }
}

public class DiamondProblem{
    public static void main(String[] args) {
        DiamondProblemSolution obj1 = new DiamondProblemSolution();
        obj1.display();
    }
}
