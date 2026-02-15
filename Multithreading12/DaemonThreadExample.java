package com.thread;

public class DaemonThreadExample extends Thread {

    public void run() {
        System.out.println("Daemon thread running");
    }

    public static void main(String[] args) {
        DaemonThreadExample t = new DaemonThreadExample();
        t.setDaemon(true);
        t.start();
    }
}

/*
OUTPUT:
Daemon thread running
(Note: Daemon thread stops when main thread ends)
*/
