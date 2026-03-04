package ArraysInJava;

public class JumpSearch {

    public static void main(String[] args) {
        // Your specific sorted array
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56};
        
        // The number we want to find
        int target = 23; 

        int result = jumpSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }

    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        
        // The optimal jump size is the square root of the array's length
        // For an array of length 9, our step size will be 3.
        int step = (int) Math.sqrt(n);
        int prev = 0;

        // 1. Jump forward in blocks until we pass the target or hit the end
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            
            // If our previous pointer jumps past the array, the target isn't here
            if (prev >= n) {
                return -1;
            }
        }

        // 2. Do a simple linear search within the identified block
        while (arr[prev] < target) {
            prev++;
            
            // If we hit the end of the block or array without finding it
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // 3. If we found the exact match, return the index
        if (arr[prev] == target) {
            return prev;
        }

        return -1;
    }
}