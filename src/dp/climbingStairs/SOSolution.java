package dp.climbingStairs;

class SOSolution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        int prev2 = 1;
        int prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int n = 4;

        SOSolution space = new SOSolution();
        System.out.println("Space Optimization: " + space.climbStairs(n));
    }
}
