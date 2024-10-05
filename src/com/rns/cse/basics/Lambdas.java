package com.rns.cse.basics;
public class Lambdas {
    public static void main(String[] args) {
        // Way 1
        Cat myCat = new Cat();
        myCat.print();
        // Way 2
        printThing(myCat);
        // Lambda Example
        // Way 3
        printThing(
                () ->{
            System.out.println("Meow");
        }
        );
        // Way 4 in one line
        printThing(() -> System.out.println("Meow"));
        // Way 5 by storing as a variable/reference
        Printable lambdaPrintable = () -> System.out.println("Meow");
        printThing(lambdaPrintable);
    }
    static void printThing(Printable thing){
        thing.print();
    }
}
