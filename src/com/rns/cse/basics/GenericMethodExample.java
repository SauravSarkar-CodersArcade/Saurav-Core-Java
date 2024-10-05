package com.rns.cse.basics;

public class GenericMethodExample {
    // Generic method to compare two objects of the same type
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        Integer maxInt = findMax(10, 20);
        System.out.println("Max Integer: " + maxInt);

        String maxString = findMax("Apple", "Banana");
        System.out.println("Max String: " + maxString);
    }
}

