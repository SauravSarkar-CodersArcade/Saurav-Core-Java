package InterviewRelatedStuff;
import java.util.Scanner;
public class RatInMaze {
    // Function to check if a given position is safe or not to move
    static boolean isPathSafe(int[][] arr, int x, int y, int n) {
        return x < n && y < n && arr[x][y] == 1;
    }
    // Recursive function to find the path for the rat in the maze
    static boolean ratInMaze(int[][] arr, int x, int y, int n, int[][] resultantArray) {
        // Base case: If the rat reaches the destination
        if (x == n - 1 && y == n - 1) {
            resultantArray[x][y] = 1; // Mark the destination in the resultant array
            return true;
        }
        // Check if the current position is safe to move
        if (isPathSafe(arr, x, y, n)) {
            resultantArray[x][y] = 1; // Mark the current position in the resultant array

            // Move right and check if the path is found
            if (ratInMaze(arr, x + 1, y, n, resultantArray)) {
                return true;
            }
            // Move down and check if the path is found
            if (ratInMaze(arr, x, y + 1, n, resultantArray)) {
                return true;
            }
            resultantArray[x][y] = 0; // Backtracking:
            // If no path is found, mark the current position as invalid
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        // Input the maze array values
        int[][] arr = new int[n][n];
        System.out.println("Enter the maze array values (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Dynamically allocate memory for the resultant array and initialize it to zeros
        int[][] resultantArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultantArray[i][j] = 0;
            }
        }
        // Call the rat in maze function to find a path in the maze
        if (ratInMaze(arr, 0, 0, n, resultantArray)) {
            // Print the resultant array representing the path of the rat in the maze
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No path exists to reach the destination.");
        }
    }
}

