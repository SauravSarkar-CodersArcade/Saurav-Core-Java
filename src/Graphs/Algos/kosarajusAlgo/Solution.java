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
}
