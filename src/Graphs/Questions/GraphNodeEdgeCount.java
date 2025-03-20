package Graphs.Questions;

import java.util.*;

public class GraphNodeEdgeCount {

    static int countNodes(List<List<Integer>> adjList) {
        return adjList.size();
    }

    static int countEdges(List<List<Integer>> adjList) {
        int edges = 0;
        for (List<Integer> neighbors : adjList) {
            edges += neighbors.size();
        }
        // Since it's an undirected graph, each edge is counted twice
        return edges / 2;
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        
        // Manually adding adjacency list representation
        adjList.add(Arrays.asList(1, 2));       // Node 0
        adjList.add(Arrays.asList(0, 2, 3));    // Node 1
        adjList.add(Arrays.asList(0, 1, 4));    // Node 2
        adjList.add(Arrays.asList(1, 4));       // Node 3
        adjList.add(Arrays.asList(2, 3));       // Node 4

        int nodes = countNodes(adjList);
        int edges = countEdges(adjList);

        System.out.println("Number of nodes: " + nodes);
        System.out.println("Number of edges: " + edges);
    }
}
