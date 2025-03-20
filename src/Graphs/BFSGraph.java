package Graphs;
import java.util.*;
class GraphBFS {
    public List<Integer> bfsGraph(int V, List<List<Integer>> adjList) {
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V + 1]; // Visited array
        Queue<Integer> q = new LinkedList<>();

        // Start BFS from node 1
        visited[1] = true;
        q.add(1);

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            // Traverse all its neighbors
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return bfs;
    }
}

public class BFSGraph {
    public static void main(String[] args) {
        int V = 5; // Number of nodes
        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i <= V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Adding edges (Undirected Graph)
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 4, 3);
        addEdge(adjList, 5, 3);
        addEdge(adjList, 4, 3);
        addEdge(adjList, 2, 5);

        // BFS Traversal
        GraphBFS obj = new GraphBFS();
        List<Integer> ans = obj.bfsGraph(V, adjList);

        // Print BFS result
        printBFS(ans);
    }

    // Method to add an edge to the adjacency list
    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Since the graph is undirected
    }

    // Method to print BFS traversal
    public static void printBFS(List<Integer> ans) {
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
