package com.collectionn;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // duplicate ignored

        System.out.println("HashSet: " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(5);

        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);

        System.out.println("TreeSet: " + treeSet);
    }
}

/*
OUTPUT:
HashSet: [10, 20]
LinkedHashSet: [10, 20, 5]
TreeSet: [10, 20, 30]
*/