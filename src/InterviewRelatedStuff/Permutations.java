package InterviewRelatedStuff;

public class Permutations {

    public static void backtrack(String[] letters, String[][] ans, int index) {
        // Base case
        if (index >= letters.length) {
            ans[ans.length - 1] = letters.clone();
            return;
        }

        for (int i = index; i < letters.length; i++) {
            swap(letters, index, i);
            backtrack(letters, ans, index + 1);
            // Backtrack
            swap(letters, index, i);
        }
    }

    public static void swap(String[] letters, int i, int j) {
        String temp = letters[i];
        letters[i] = letters[j];
        letters[j] = temp;
    }

    public static String[][] permute(String[] letters) {
        int numPermutations = 1;
        for (int i = 2; i <= letters.length; i++) {
            numPermutations *= i;
        }

        String[][] ans = new String[numPermutations][letters.length];
        int index = 0;
        backtrack(letters, ans, index);
        return ans;
    }

    public static void printArray(String[][] arr) {
        for (String[] innerArr : arr) {
            System.out.print("[");
            for (String str : innerArr) {
                System.out.print("\"" + str + "\",");
            }
            System.out.print("], ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] input1 = {"a", "b", "c"};
        String[][] result1 = permute(input1);
        printArray(result1);
    }
}

