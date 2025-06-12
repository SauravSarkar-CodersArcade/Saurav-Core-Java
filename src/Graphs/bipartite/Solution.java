package Graphs.bipartite;

import java.util.*;

class Solution {

    private boolean dfs(int node, int col, int[] color, ArrayList<ArrayList<Integer>> adj) {
        color[node] = col;

        for (int it : adj.get(node)) {
            if (color[it] == -1) {
                if (!dfs(it, 1 - col, color, adj)) return false;
            } else if (color[it] == col) {
                return false;
            }
        }

        return true;
    }

    public boolean isBipartite(int V, int[][] edges) {
        // Step 1: Convert edge list to adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // Undirected graph
        }

        // Step 2: Prepare color array and apply DFS
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!dfs(i, 0, color, adj)) return false;
            }
        }

        return true;
    }

    // For testing
    public static void main(String[] args) {
        Solution obj = new Solution();
        int V = 4;
        int[][] edges = {
            {0, 2},
            {0, 3},
            {1, 3},
            {2, 3}
        };
        boolean ans = obj.isBipartite(V, edges);
        System.out.println(ans ? "1" : "0");  // Output: 0 (not bipartite)
    }
}
