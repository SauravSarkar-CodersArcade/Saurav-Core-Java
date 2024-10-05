package InterviewRelatedStuff;

import java.util.Scanner;

public class SortArray {
    public static void sortArray(int[] arr) {
        int count0 = 0; // Count of 0s
        int count1 = 0; // Count of 1s
        int count2 = 0; // Count of 2s

        // Count the number of 0s, 1s, and 2s in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Overwrite the original array with the sorted elements
        int index = 0;

        // First, add the 0s
        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }

        // Next, add the 1s
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }

        // Finally, add the 2s
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array (0, 1, or 2):");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the sortArray function
        sortArray(arr);

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

