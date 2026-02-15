package com.thread;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread running using Runnable interface");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample());
        t1.start();
    }
}

/*
OUTPUT:
Thread running using Runnable interface
*/
