package com.collectionn;

import java.util.*;

public class CollectionVsCollectionsDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}

/*
OUTPUT:
Sorted List: [1, 2, 3]
*/