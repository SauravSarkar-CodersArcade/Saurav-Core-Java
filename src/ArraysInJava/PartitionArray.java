package ArraysInJava;

public class PartitionArray {
    public static void main(String[] args) {

        int[] arr = {3, 8, 5, 12, 7, 6};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] % 2 == 0)
                left++;

            while (arr[right] % 2 != 0)
                right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}