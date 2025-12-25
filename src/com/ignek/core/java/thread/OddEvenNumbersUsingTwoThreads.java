package com.ignek.core.java.thread;

class OddEven extends Thread{
    int start;
    int end;

    OddEven(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (i % 2 == 0){
                System.out.println(i + "is odd");
            } else {
                System.out.println(i + "is even");
            }
        }
    }
}

public class OddEvenNumbersUsingTwoThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new OddEven(1, 10));
        Thread thread2 = new Thread(new OddEven(11, 20));

        thread1.start();
        thread2.start();
    }
}
