package InterviewRelatedStuff;

public class MaxMinArray {
    static int[] maxMinArr(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] result = maxMinArr(arr);
        int max = result[0];
        int min = result[1];
        System.out.println("The max value in the array is: " + max);
        System.out.println("The min value in the array is: " + min);
    }
}
