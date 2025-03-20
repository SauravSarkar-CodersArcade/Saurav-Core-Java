package Greedy;
import java.util.PriorityQueue;
class MinCostOfConnectingRopes {
    public long minCost(long[] arr) {
        // Min-Heap (Priority Queue)
        PriorityQueue<Long> pq = new PriorityQueue<>();

        // Insert all elements into the priority queue
        for (long num : arr) {
            pq.add(num);
        }

        long cost = 0;

        // While more than one rope remains
        while (pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();

            long mergedLength = first + second;
            cost += mergedLength;

            pq.add(mergedLength);
        }
        return cost;
    }

    public static void main(String[] args) {
        MinCostOfConnectingRopes sol = new MinCostOfConnectingRopes();
        long[] arr = {4, 3, 2, 6}; // Example input
        System.out.println("Minimum Cost: " + sol.minCost(arr));
    }
}

