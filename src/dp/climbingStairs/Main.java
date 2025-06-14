package dp.climbingStairs;

public class Main {
    public static void main(String[] args) {
        int n = 4;

        RecSolution rec = new RecSolution();
        System.out.println("Recursion: " + rec.climbStairs(n));

        MemSolution mem = new MemSolution();
        System.out.println("Memoization: " + mem.climbStairs(n));

        TabSolution tab = new TabSolution();
        System.out.println("Tabulation: " + tab.climbStairs(n));

        SOSolution space = new SOSolution();
        System.out.println("Space Optimization: " + space.climbStairs(n));
    }
}
