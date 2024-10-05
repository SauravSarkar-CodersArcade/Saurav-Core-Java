package InterviewRelatedStuff;

public class NQueenProblem {
    private static final int EMPTY = 0;
    private static final int QUEEN = 1;

    public static void solveNQueens(int n) {
        int[][] board = new int[n][n];
        if (solve(board, 0)) {
            printSolution(board);
        } else {
            System.out.println("No solution exists for N = " + n);
        }
    }

    private static boolean solve(int[][] board, int col) {
        // Base case: All queens are placed successfully
        if (col >= board.length) {
            return true;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = QUEEN;

                if (solve(board, col + 1)) {
                    return true;
                }

                // Backtracking: If the queen placement doesn't lead to a solution, remove it and try the next row
                board[row][col] = EMPTY;
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;

        // Check if there is a queen in the same row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == QUEEN) {
                return false;
            }
        }

        // Check if there is a queen in the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }

        // Check if there is a queen in the lower left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }

        return true;
    }

    private static void printSolution(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == QUEEN) {
                    System.out.print("Q ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8; // Size of the chessboard
        solveNQueens(n);
    }
}
