package Graphs.Algos.topoSort.topoSortBFSKahnsCycleDetection;

import java.util.*;

class TopologicalSortBFSKahnCycleDetection {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];

        // Step 1: Calculate indegree for each node
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        // Step 2: Push all nodes with indegree 0 into the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: Count nodes processed in topological sort
        int count = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        // If all nodes are processed, there is no cycle
        return count != V;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // C++ equivalent: adj[0] = {}, adj[1] = {2}, adj[2] = {3}, adj[3] = {4, 5}, adj[4] = {2}, adj[5] = {}
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);

        TopologicalSortBFSKahnCycleDetection obj = new TopologicalSortBFSKahnCycleDetection();
        boolean ans = obj.isCyclic(V, adj);

        if (ans)
            System.out.println("True");  // Cycle detected
        else
            System.out.println("False"); // No cycle
    }
}
