package Graphs;

import java.util.*;

public class GraphAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n -> Nodes (Vertices), m -> Edges
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Adjacency List Representation
        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize adjacency list with empty lists for each node
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Read edges and update adjacency list
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Undirected graph
        }

        // Printing the adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + ": ");
            for (int v : adjList.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
