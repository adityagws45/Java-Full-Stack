package com.collectionn;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Spring");
        languages.add("Java");   // duplicate allowed

        System.out.println("ArrayList: " + languages);
        System.out.println("Element at index 0: " + languages.get(0));
    }
}

/*
OUTPUT:
ArrayList: [Java, Spring, Java]
Element at index 0: Java
*/
