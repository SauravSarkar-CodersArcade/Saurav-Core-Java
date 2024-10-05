package Basics;

import java.util.Scanner;

public class PrintingOddAndEven {
    public static void main(String[] args) {
        /*
        Take the user input of the range of numbers 'n'
        Print in the given format :
        1 is ODD
        2 is EVEN
        3 is ODD
        ........
        n is ODD/EVEN
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if (i % 2 == 0){
                System.out.println(i + " is EVEN");
            }
            else{
                System.out.println(i + " is ODD");
            }
        }

    }
}
