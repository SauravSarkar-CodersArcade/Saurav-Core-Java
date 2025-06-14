package dp.climbingStairs;

import java.util.Arrays;

class MemSolution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    private int solve(int n, int[] dp) {
        if (n == 0 || n == 1) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
    }
    public static void main(String[] args) {
        int n = 4;

        MemSolution mem = new MemSolution();
        System.out.println("Memoization: " + mem.climbStairs(n));
    }
}
