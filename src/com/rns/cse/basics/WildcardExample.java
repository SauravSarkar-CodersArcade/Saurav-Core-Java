package com.rns.cse.basics;
import java.util.ArrayList;
import java.util.List;
public class WildcardExample {
    // Method to print elements of a List using wildcards
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        System.out.println("Printing Integer List:");
        printList(integerList);

        System.out.println("Printing String List:");
        printList(stringList);
    }
}

