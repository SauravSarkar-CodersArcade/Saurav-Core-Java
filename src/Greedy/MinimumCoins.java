package Greedy;

import java.util.*;

public class MinimumCoins {
    
    static void findMinimumCoins(List<Integer> coins, int V) {
        List<Integer> result = new ArrayList<>();
        
        // Traverse the sorted coins array from the largest to the smallest
        for (int i = coins.size() - 1; i >= 0; i--) {
            while (V >= coins.get(i)) {
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }

        // Output the selected coins
        System.out.print("Coins selected: ");
        for (int coin : result) {
            System.out.print(coin + " ");
        }
        System.out.println();
        
        // Output the minimum number of coins
        System.out.println("Minimum number of coins: " + result.size());
    }

    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 500, 2000);
        int V = 91;
        findMinimumCoins(coins, V);
    }
}
