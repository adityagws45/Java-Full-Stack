package com.thread;

public class YieldExample extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }

    public static void main(String[] args) {

        YieldExample t = new YieldExample();
        t.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread");
        }
    }
}

/*
POSSIBLE OUTPUT (Order may vary):
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
*/
