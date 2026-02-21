package com.collectionn;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Java");
        hashMap.put(1, "Spring");
        hashMap.put(2, "Hibernate");

        System.out.println("HashMap: " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");

        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");

        System.out.println("TreeMap: " + treeMap);
    }
}

/*
OUTPUT:
HashMap: {1=Spring, 2=Hibernate, 3=Java}
LinkedHashMap: {1=A, 2=B}
TreeMap: {1=A, 2=B, 3=C}
*/