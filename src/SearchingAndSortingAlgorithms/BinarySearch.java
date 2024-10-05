package SearchingAndSortingAlgorithms;
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int key = 3;
        binarySearch(a,key);
    }
    public static void binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length-1;
        int mid = (low+high)/2;
        while (low<=high){
            if(a[mid]==key){
                System.out.println("Element is at " + mid + " index position.");
                break;
            }
            else if (a[mid] < key){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
            mid = (low+high)/2;
        }
        if (low>high){
            System.out.println("Element not found");
        }
    }
}
