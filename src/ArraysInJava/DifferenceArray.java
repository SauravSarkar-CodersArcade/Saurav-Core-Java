package ArraysInJava;
public class DifferenceArray {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n];
        int l = 1;
        int r = 3;
        int val = 10;
        diff[l] += val;
        if ((r+1) < n){
            diff[r+1] -= val;
        }
        int[] result = new int[n];
        result[0] = diff[0];
        for (int i=1; i<n; i++){
            result[i] = result[i-1] + diff[i];
        }
        for (int x : result){
            System.out.print(x + " ");
        }
    }
}
