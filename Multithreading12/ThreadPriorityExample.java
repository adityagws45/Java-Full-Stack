package com.thread;

public class ThreadPriorityExample extends Thread {

    public void run() {
        System.out.println(
                "Thread Priority: " + Thread.currentThread().getPriority()
        );
    }

    public static void main(String[] args) {
        ThreadPriorityExample t = new ThreadPriorityExample();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
}

/*
OUTPUT:
Thread Priority: 10
*/
