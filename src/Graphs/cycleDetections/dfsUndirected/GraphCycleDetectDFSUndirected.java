package Graphs.cycleDetections.dfsUndirected;

import java.util.*;

class GraphCycleDetectDFSUndirected {

    // DFS method to detect cycle
    private boolean dfs(int node, int parent, int[] vis, List<List<Integer>> adjList) {
        vis[node] = 1;

        for (int adjacentNode : adjList.get(node)) {
            if (vis[adjacentNode] == 0) {
                if (dfs(adjacentNode, node, vis, adjList)) {
                    return true;
                }
            } else if (adjacentNode != parent) {
                // If already visited and not parent, cycle exists
                return true;
            }
        }

        return false;
    }

    // Function to check cycle in all components
    public boolean detectCycle(int V, List<List<Integer>> adjList) {
        int[] vis = new int[V + 1];  // 1-based indexing

        for (int i = 1; i <= V; i++) {
            if (vis[i] == 0) {
                if (dfs(i, -1, vis, adjList)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {
        int V = 7;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(1).addAll(Arrays.asList(2, 3));
        adjList.get(2).addAll(Arrays.asList(1, 5));
        adjList.get(3).addAll(Arrays.asList(1, 4, 6));
        adjList.get(4).add(3);
        adjList.get(5).addAll(Arrays.asList(2, 7));
        adjList.get(6).addAll(Arrays.asList(3, 7));
        adjList.get(7).addAll(Arrays.asList(5, 6));

        GraphCycleDetectDFSUndirected obj = new GraphCycleDetectDFSUndirected();
        boolean ans = obj.detectCycle(V, adjList);

        if (ans) {
            System.out.println("Cycle is detected.");
        } else {
            System.out.println("Cycle is not detected.");
        }
    }
}
