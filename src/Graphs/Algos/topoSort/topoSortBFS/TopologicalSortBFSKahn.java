package Graphs.Algos.topoSort.topoSortBFS;

import java.util.*;

class TopologicalSortBFSKahn {
    public List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];

        // Step 1: Calculate indegrees of all nodes
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        // Step 2: Add all nodes with indegree 0 to the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: BFS
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            // Decrease indegree of adjacent nodes
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        return topo;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Same edges as C++ version
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        TopologicalSortBFSKahn obj = new TopologicalSortBFSKahn();
        List<Integer> ans = obj.topoSort(V, adj);

        for (int node : ans) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
