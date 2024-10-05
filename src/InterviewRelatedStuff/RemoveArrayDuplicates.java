package InterviewRelatedStuff;

public class RemoveArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 4, 5};
        int[] newArr = removeDuplicates(arr);

        // Printing the array without duplicates
        System.out.print("Array without duplicates: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArr[index++] = arr[i];
            }
        }

        // Resize the array to remove extra zeros
        int[] result = new int[index];
        System.arraycopy(newArr, 0, result, 0, index);

        return result;
    }
}

