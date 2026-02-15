package com.thread;

public class SleepExample {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

/*
OUTPUT:
1
2
3
(Each number printed after 1 second delay)
*/
