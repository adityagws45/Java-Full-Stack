package com.collectionn;

import java.util.*;

class Student implements Comparable<Student> {

    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    public String toString() {
        return String.valueOf(marks);
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(70));
        list.add(new Student(90));
        list.add(new Student(80));

        Collections.sort(list);

        System.out.println("Sorted by marks: " + list);
    }
}

/*
OUTPUT:
Sorted by marks: [70, 80, 90]
*/