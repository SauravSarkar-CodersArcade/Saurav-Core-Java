package InterviewRelatedStuff;

import java.util.Scanner;

public class SparseMatrix {
    static boolean isSparse(){
        int ctr = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println("Enter the value at index: [" + i + "]" + "[" + j + "] of the array: " );
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 0){
                    ctr++;
                }
            }
        }
        System.out.println("The matrix provided is: ");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("There are " + ctr + " zeroes in the matrix in a total of " + row*column + " elements.");

        return ctr > ((row * column) / 2);
    }

    public static void main(String[] args) {
        if (isSparse()){
            System.out.println("Therefore the given matrix is a Sparse Matrix.");
        }
        else {
            System.out.println("Therefore the given matrix is not a Sparse Matrix.");
        }
    }
}
