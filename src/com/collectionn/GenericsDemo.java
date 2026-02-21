package com.collectionn;

import java.util.*;

public class GenericsDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");

        System.out.println(list);
    }
}

/*
OUTPUT:
[Java, Spring]
*/