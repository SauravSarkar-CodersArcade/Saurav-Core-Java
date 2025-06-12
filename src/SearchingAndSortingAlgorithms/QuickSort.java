package SearchingAndSortingAlgorithms;
public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for (int i=s+1; i<=e; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        // Place the pivot at it's correct index or position
        int pivotIndex = s + count;
        swap(arr, pivotIndex, s);
        // Let's manage the left & right part of the pivot
        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr, int s, int e){
        // Base Case
        if(s >= e){
            return;
        }
        // Find pivot for partition
        int p = partition(arr,s,e);
        // Sort the left part
        quickSort(arr,s,p-1);
        // Sort the right part
        quickSort(arr,p+1,e);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,8,7,6};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
