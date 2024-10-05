package ArraysInJava;

public class MDArray {
    public static void main(String[] args) {
        int[][] mdArray = {{1,2,3,4},
                           {4,5,6,7},
                           {7,8,9,0}};

        for (int i=0; i<3; i++){ // rows
            for (int j=0; j<4; j++){ // columns
                System.out.print(mdArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
