package Graphs;

import java.util.*;

class GraphDFS {
    private void dfs(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> ans) {
        visited[node] = true;
        ans.add(node);

        // Traverse all the neighbors
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited, ans);
            }
        }
    }

    public List<Integer> dfsGraph(int V, List<List<Integer>> adjList) {
        boolean[] visited = new boolean[V + 1]; // Visited array
        List<Integer> ans = new ArrayList<>();

        int start = 1; // Assuming DFS starts from node 1
        dfs(start, adjList, visited, ans);

        return ans;
    }
}

public class DFSGraph {
    public static void main(String[] args) {
        int V = 10; // Number of nodes
        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i <= V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Example Graph Edges
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 7);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 2, 6);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 3, 6);
        addEdge(adjList, 5, 3);
        addEdge(adjList, 7, 8);
        addEdge(adjList, 7, 10);
        addEdge(adjList, 8, 9);

        // DFS Traversal
        GraphDFS obj = new GraphDFS();
        List<Integer> ans = obj.dfsGraph(V, adjList);

        // Print DFS result
        printDFS(ans);
    }

    // Method to add an edge to the adjacency list
    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Since the graph is undirected
    }

    // Method to print DFS traversal
    public static void printDFS(List<Integer> ans) {
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
