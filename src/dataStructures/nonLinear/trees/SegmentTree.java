package dataStructures.nonLinear.trees;

import java.util.Scanner;

public class SegmentTree {
    private static final int MAX_SIZE = 100005; // Maximum size of the array
    private static int[] a = new int[MAX_SIZE]; // Input array
    private static int[] seg = new int[4 * MAX_SIZE]; // Segment tree

    // Function to build the segment tree
    private static void build(int ind, int low, int high) {
        if (low == high) {
            seg[ind] = a[low]; // Leaf node will have a single element
            return;
        }
        int mid = (low + high) / 2;
        build(2 * ind + 1, low, mid); // Build left child
        build(2 * ind + 2, mid + 1, high); // Build right child
        seg[ind] = Math.max(seg[2 * ind + 1], seg[2 * ind + 2]); // Store the maximum value
    }

    // Function to query the maximum in a given range [l, r]
    private static int query(int ind, int low, int high, int l, int r) {
        if (low >= l && high <= r) { // Total overlap
            return seg[ind];
        }
        if (high < l || low > r) { // No overlap
            return Integer.MIN_VALUE; // Return minimum possible value for max query
        }
        int mid = (low + high) / 2; // Partial overlap
        int left = query(2 * ind + 1, low, mid, l, r); // Query left child
        int right = query(2 * ind + 2, mid + 1, high, l, r); // Query right child
        return Math.max(left, right); // Return the maximum of both children
    }

    // Main function to demonstrate the segment tree functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); // Size of the input array

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Input array elements
        }

        build(0, 0, n - 1); // Build the segment tree

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt(); // Number of queries

        while (q-- > 0) {
            System.out.print("Enter range [l r]: ");
            int l = sc.nextInt(); // Start of the range (0-based index)
            int r = sc.nextInt(); // End of the range (0-based index)

            // Adjust indices for 0-based indexing
            int result = query(0, 0, n - 1, l, r);
            System.out.println("Maximum in range [" + l + ", " + r + "] is: " + result);
        }

        sc.close();
    }
}
