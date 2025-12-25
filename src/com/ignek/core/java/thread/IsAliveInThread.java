package com.ignek.core.java.thread;

public class IsAliveInThread extends Thread {
    public static int amount=0;
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.start();

        while (thread1.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println("Main method " + amount);
        amount++;
    }

    @Override
    public void run() {
        amount++;
        System.out.println("Run method " + amount);
    }
}
