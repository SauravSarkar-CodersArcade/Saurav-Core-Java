package ArraysInJava;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = {{1,2,3,4,5,6},
                               {4,5,6,7},
                               {7,8,9}};

        for (int i=0; i<jaggedArray.length; i++){ // rows : array
            for (int j=0; j<jaggedArray[i].length; j++){ // columns : array elements
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
