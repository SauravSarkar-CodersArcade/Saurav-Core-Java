package com.rns.cse.basics;

public class GenericPrinter <T>{
    T thingToPrint;
    public GenericPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    void print(){
        System.out.println(thingToPrint);
    }
}
