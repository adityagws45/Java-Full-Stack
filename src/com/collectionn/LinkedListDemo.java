package com.collectionn;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.add(1, 15); // insert at index 1

        System.out.println("LinkedList: " + numbers);
    }
}

/*
OUTPUT:
LinkedList: [10, 15, 20, 30]
*/