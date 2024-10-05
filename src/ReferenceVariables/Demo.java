package ReferenceVariables;

public class Demo {
    public static void main(String[] args) {
        char[][] dotMat = {{'.','.','.','.','.','.'},
                           {'.','.'},
                           {'.'},
                           {'/','/','/'}};

        for (char[] c : dotMat){
            for (char d : c){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
