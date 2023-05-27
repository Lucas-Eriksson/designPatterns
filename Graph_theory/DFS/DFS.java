package Graph_theory.DFS;

import java.util.*;
public class DFS {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    //Creation of the graph
    public DFS(int V) {
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    //Adding an edge to the graph
    public void insertEdge(int src, int dst) {
        adj[src].add(dst);
    }

    public void DFSalgorithm(int vertex) {
        visited[vertex] = true; //Mark the current vertex as visited
        System.out.println(vertex + " ");

        Iterator <Integer> it = adj[vertex].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]){
                DFSalgorithm(n);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(8);

        graph.insertEdge(0, 1);    
        graph.insertEdge(0, 2);    
        graph.insertEdge(0, 3);    
        graph.insertEdge(1, 3);    
        graph.insertEdge(2, 4);  
        graph.insertEdge(3, 5);       
        graph.insertEdge(3, 6);    
        graph.insertEdge(4, 7);    
        graph.insertEdge(4, 5);    
        graph.insertEdge(5, 2);    
          
        System.out.println("Depth First Traversal for the graph is:");    
        graph.DFSalgorithm(0);    
    }
}
