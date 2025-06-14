package dp.climbingStairs;

class RecSolution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {
        int n = 4;

        RecSolution rec = new RecSolution();
        System.out.println("Recursion: " + rec.climbStairs(n));
    }
}
