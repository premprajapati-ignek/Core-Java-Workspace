package com.ignek.core.java.thread;

class BackgroundProcess extends Thread{
    public void run(){
        System.out.println("this code is run in thread");
        System.out.println("this code is run in thread");
        System.out.println("this code is run in thread");
    }
}


public class PracticeThread {
    public static void main(String[] args) {
        BackgroundProcess process1 = new BackgroundProcess();
        process1.start();
        System.out.println("this code is run in main method");
    }
}


