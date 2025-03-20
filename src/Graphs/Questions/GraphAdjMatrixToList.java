package Graphs.Questions;

import java.util.*;

public class GraphAdjMatrixToList {

    static List<List<Integer>> convertToAdjList(int[][] adjMatrix, int V) {
        List<List<Integer>> adjList = new ArrayList<>();
        
        // Initialize empty lists for each vertex
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Convert adjacency matrix to adjacency list
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adjMatrix[i][j] == 1) {
                    adjList.get(i).add(j);
                }
            }
        }
        return adjList;
    }

    static void printAdjList(List<List<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] adjMatrix = {
                {0, 1, 1, 0, 0},
                {1, 0, 1, 1, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };

        List<List<Integer>> adjList = convertToAdjList(adjMatrix, V);

        System.out.println("Adjacency List Representation:");
        printAdjList(adjList);
    }
}
