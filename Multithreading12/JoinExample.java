package com.thread;

public class JoinExample extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        JoinExample t = new JoinExample();
        t.start();
        t.join();

        System.out.println("Main thread executed");
    }
}

/*
OUTPUT:
Child Thread 1
Child Thread 2
Child Thread 3
Main thread executed
*/
