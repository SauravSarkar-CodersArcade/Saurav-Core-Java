package com.rns.cse.basics;

public class BoxingAutoBoxing {
    public static void main(String[] args) {
        int num = 8;
        Integer num1 = new Integer(num); // Boxing -> Primitive to Object
        System.out.println(num1);
        Integer num2 = num; // Auto-Boxing
        System.out.println(num2);
        // Again from the object if we need the integer value
        int num3 = num2.intValue(); // unboxing -> Object to Primitive
        System.out.println(num3);
        int num4 = num2; // Auto-Unboxing
        System.out.println(num4);
        String str = "12";
        Integer num_Str = Integer.parseInt(str);
        System.out.println(num_Str*2);
    }
}
