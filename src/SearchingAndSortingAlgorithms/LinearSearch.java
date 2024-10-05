package SearchingAndSortingAlgorithms;

public class LinearSearch {
    private int linearSearch(int[] numbers, int key){
        for (int i=0; i<numbers.length; i++){
            if (key ==  numbers[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {90, 56, 43, 1, 5, 7, 100};
        int key = 1;
        int index = new LinearSearch().linearSearch(numbers, key);
        System.out.println("Index of Key: " + " is at " + index);
        System.out.println("Position of Key: " + " is at " + (index+1));
    }
}
