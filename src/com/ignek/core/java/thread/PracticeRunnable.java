package com.ignek.core.java.thread;

class BackgroundWork implements Runnable{
    @Override
    public void run() {
        System.out.println("This code is run in threads");
    }
}

public class PracticeRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new BackgroundWork());
        thread1.start();
        System.out.println("This code is run in main method");
        System.out.println("This code is run in main method");
    }
}
