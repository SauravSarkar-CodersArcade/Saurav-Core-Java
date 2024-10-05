package InterviewRelatedStuff;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static int fibUsingRec(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fibUsingRec(n-1) + fibUsingRec(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci Series: ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series for the first " + n + " elements is: ");
        for (int i=0; i<n; i++){
            System.out.print(fibUsingRec(i)+ " ");
        }
    }
}
