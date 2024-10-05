package Basics;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        double areaOfTriangle = 0.5 * (base * height);
        System.out.println("The area of the triangle is: " + areaOfTriangle);

    }
}
