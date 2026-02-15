package com.thread;

public class ThreadClassExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread running using Thread class");
    }

    public static void main(String[] args) {
        ThreadClassExample t1 = new ThreadClassExample();
        t1.start();
    }
}

/*
OUTPUT:
Thread running using Thread class
*/
