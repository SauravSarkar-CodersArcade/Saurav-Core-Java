package com.rns.cse.basics;

public class GenericsDemo {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(26);
        integerPrinter.print();
        FloatPrinter floatPrinter = new FloatPrinter(2.34f);
        floatPrinter.print();
        DoublePrinter doublePrinter = new DoublePrinter(22.55);
        doublePrinter.print();
        GenericPrinter<Float> fPrinter = new GenericPrinter<>(20.22f);
        fPrinter.print();
        GenericPrinter<Double> dPrinter = new GenericPrinter<>(22.44);
        dPrinter.print();
        GenericPrinter<Character> cPrinter = new GenericPrinter<>('A');
        cPrinter.print();
    }
}
