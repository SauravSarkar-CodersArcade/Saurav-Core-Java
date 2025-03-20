public class KadaneAlgorithm {
    public static int KadaneAlgo(int[] arr){
        int cmax = arr[0];
        int gmax = arr[0];
        for (int i=1; i<arr.length; i++){
            cmax = Math.max(arr[i], cmax + arr[i]);
            gmax = Math.max(cmax, gmax);
        }
        return gmax;
    }
    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        int maxSum = KadaneAlgo(arr);
        System.out.println("MaxSum is: " + maxSum);
    }
}
