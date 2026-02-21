package com.collectionn;

import java.util.*;

class Student1 {

    int marks;

    Student1(int marks) {
        this.marks = marks;
    }

    public String toString() {
        return String.valueOf(marks);
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Student1> list = new ArrayList<>();
        list.add(new Student1(70));
        list.add(new Student1(90));
        list.add(new Student1(80));

        Comparator<Student1> comp = (s1, s2) -> s2.marks - s1.marks;

        Collections.sort(list, comp);

        System.out.println("Sorted in descending order: " + list);
    }
}

/*
OUTPUT:
Sorted in descending order: [90, 80, 70]
*/