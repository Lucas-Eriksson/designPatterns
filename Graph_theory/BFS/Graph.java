package Graph_theory.BFS;

import java.io.*;
import java.util.*;

public class Graph {

  private int V; //no. vertices
  private LinkedList<Integer> adj[]; //Adjacency list

  public Graph(int v) {
    this.V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < adj.length; i++) {
      adj[i] = new LinkedList();
    }
  }

  public void addEdge(int src, int dst) {
    adj[src].add(dst);
  }

  //Print BFS traversal from a given start node
  public void BFS(int start) {
    //Mark all the vertices as not visited (sets false by default)
    boolean visited[] = new boolean[V];

    //Create a queue for BFS
    LinkedList<Integer> queue = new LinkedList<Integer>();

    //Mark the current node as visited and enqueue it
    visited[start] = true;
    queue.add(start);

    while (queue.size() != 0) {
      //Dequeue a vertex from queue and print it
      start = queue.poll();
      System.out.println(start + " ");

      //Get all adjacent vertices of the dequeued vertex start
      //If an adjacent vertex has not been visited, mark it visited and place in queue
      Iterator<Integer> it = adj[start].listIterator();
      while (it.hasNext()) {
        int n = it.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String[] args) {
    Graph g = new Graph(6);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);
    g.addEdge(3, 5);
    g.addEdge(1, 4);

    System.out.println(
      "Following is Breadth First Traversal " + "(starting from vertex 2)"
    );

    g.BFS(2);
  }
}
