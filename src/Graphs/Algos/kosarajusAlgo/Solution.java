package Graphs.Algos.kosarajusAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Solution {
    private void dfs1(int node, boolean[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) {
                dfs1(nbr, visited, stack, adj);
            }
        }
        stack.push(node);
    }

    private void dfs2(int node, boolean[] visited, ArrayList<ArrayList<Integer>> transpose) {
        visited[node] = true;
        for (int nbr : transpose.get(node)) {
            if (!visited[nbr]) {
                dfs2(nbr, visited, transpose);
            }
        }
    }

    // Function to find number of strongly connected components in the graph.
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        // Step 1: Fill order stack via DFS
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs1(i, visited, stack, adj);
            }
        }

        // Step 2: Transpose the graph
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            transpose.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                transpose.get(it).add(i);
            }
        }

        // Step 3: DFS on transpose in stack order
        Arrays.fill(visited, false);
        int sccCount = 0;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                sccCount++;
                dfs2(node, visited, transpose);
            }
        }

        return sccCount;
    }
    public static void main(String[] args) {
        int V = 6;  // number of vertices

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example Graph:
        // 0 → 1 → 2 → 0 form one SCC
        // 1 → 3 → 4 → 5 → 3 form another SCC

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(5).add(3);

        Solution solution = new Solution();
        int sccCount = solution.kosaraju(adj);
        System.out.println("Number of Strongly Connected Components: " + sccCount);
    }
}

