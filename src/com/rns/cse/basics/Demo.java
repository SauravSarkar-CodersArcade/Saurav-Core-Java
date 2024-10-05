package com.rns.cse.basics;

public interface Demo {
    void function();
}
class ABC {
    public static void main(String[] args) {
        // Boiler plate code
        Demo obj = new Demo() {
            public void function() {
                System.out.println("Boilerplate-code..!!");
            }
        };
        obj.function();

        // Scala-inspired code in Functional Interface & Lambda Expressions : One Liner
        Demo obj1 = () -> System.out.println("Lambda Expression - Scala!!");
        obj1.function();
    }
}
