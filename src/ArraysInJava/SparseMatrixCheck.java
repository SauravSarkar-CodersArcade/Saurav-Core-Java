package ArraysInJava;

public class SparseMatrixCheck {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 0, 3},
                {0, 0, 0},
                {4, 0, 0}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int zeroCount = 0;
        int nonZeroCount = 0;

        // Traverse matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0)
                    zeroCount++;
                else
                    nonZeroCount++;
            }
        }

        System.out.println("Zero Count: " + zeroCount);
        System.out.println("Non Zero Count: " + nonZeroCount);

        if (zeroCount > nonZeroCount)
            System.out.println("It is a Sparse Matrix");
        else
            System.out.println("It is NOT a Sparse Matrix");
    }
}