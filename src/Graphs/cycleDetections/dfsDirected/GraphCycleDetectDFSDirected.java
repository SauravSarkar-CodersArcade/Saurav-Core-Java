package Graphs.cycleDetections.dfsDirected;

import java.util.*;

class GraphCycleDetectDFSDirected {

    // DFS helper to detect cycle
    private boolean dfsCheck(int node, List<List<Integer>> adj, int[] vis, int[] pathVis) {
        vis[node] = 1;
        pathVis[node] = 1;

        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                if (dfsCheck(it, adj, vis, pathVis))
                    return true;
            } else if (pathVis[it] == 1) {
                return true;  // Back edge found
            }
        }

        pathVis[node] = 0;  // Backtrack
        return false;
    }

    // Main function to detect cycle in a directed graph
    public boolean isCyclic(int V, List<List<Integer>> adj) {
        int[] vis = new int[V + 1];      // 1-based indexing
        int[] pathVis = new int[V + 1];  // Tracks path during DFS

        for (int i = 1; i <= V; i++) {
            if (vis[i] == 0) {
                if (dfsCheck(i, adj, vis, pathVis)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Driver code
    public static void main(String[] args) {
        int V = 10;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).addAll(Arrays.asList(3, 8));
        adj.get(3).addAll(Arrays.asList(4, 7));
        adj.get(4).add(5);
        adj.get(5).add(6);
        adj.get(7).add(5);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);  // This creates a cycle: 8 → 9 → 10 → 8

        GraphCycleDetectDFSDirected obj = new GraphCycleDetectDFSDirected();
        boolean ans = obj.isCyclic(V, adj);

        if (ans) {
            System.out.println("Cycle Detected.");
        } else {
            System.out.println("No Cycle Detected.");
        }
    }
}
