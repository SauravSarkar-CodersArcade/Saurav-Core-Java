package InterviewRelatedStuff;

import java.util.Scanner;

public class NQueens {
    // Function to check if placing a queen at position (x, y) is safe
    static boolean isSafe(int[][] arr, int x, int y, int n) {
        // Checking for queens in the same column
        for (int row = 0; row < x; row++) {
            if (arr[row][y] == 1) {
                return false;
            }
        }

        // Checking for queens in the upper-left diagonal
        int row = x;
        int col = y;
        while (row >= 0 && col >= 0) {
            if (arr[row][col] == 1) {
                return false;
            }
            row--;
            col--;
        }

        // Checking for queens in the upper-right diagonal
        row = x;
        col = y;
        while (row >= 0 && col < n) {
            if (arr[row][col] == 1) {
                return false;
            }
            row--;
            col++;
        }

        // If all checks pass, the position is safe for the queen
        return true;
    }

    // Function to solve the N-Queens problem using backtracking
    static boolean solveNQueens(int[][] arr, int x, int n) {
        // Base case: All queens are placed, return true
        if (x >= n) {
            return true;
        }

        // Try placing the queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(arr, x, col, n)) {
                arr[x][col] = 1;  // Place the queen

                // Recursively solve for the next row
                if (solveNQueens(arr, x + 1, n)) {
                    return true;
                }

                arr[x][col] = 0;  // Backtrack if the current placement doesn't work
            }
        }

        // If no safe position is found in this row, backtrack
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Create a 2D array to represent the chessboard
        int[][] arr = new int[n][n];

        // Attempt to solve the N-Queens problem
        if (solveNQueens(arr, 0, n)) {
            // Print the solution if it exists
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Can't place the queens in this chessboard less tha 4x4.");
        }

        // Close the scanner
        scanner.close();
    }
}
