package InterviewRelatedStuff;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr) {
        // Find the maximum value
        int k = arr[0];
        for (int i = 0; i < arr.length; i++) {
            k = Math.max(k, arr[i]);
        }

        // Create a count array (0-9) with ten elements
        int[] count = new int[10];

        // Calculate the count of every element in the input array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Cumulative count calculation
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }

        // Create the output array of the same size as the input array
        int[] output = new int[arr.length];

        // Start from the right side of the array
        // Add the element by decrementing the element count from the count array and adding
        // the element at the index one less than in the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[--count[arr[i]]] = arr[i];
        }

        // Copy the output array back to the input array after sorting
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 6, 4, 3};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        countSort(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}

