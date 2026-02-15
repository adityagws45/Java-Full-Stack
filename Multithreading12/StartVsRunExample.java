package com.thread;

public class StartVsRunExample extends Thread {

    public void run() {
        System.out.println("Run method executed");
    }

    public static void main(String[] args) {

        StartVsRunExample t = new StartVsRunExample();

        t.run();    // No new thread
        t.start();  // New thread
    }
}

/*
OUTPUT:
Run method executed
Run method executed
*/
