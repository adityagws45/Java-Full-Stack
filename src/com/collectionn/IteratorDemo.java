package com.collectionn;

import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

/*
OUTPUT:
Java
Spring
*/