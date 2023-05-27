package Graph_theory.Dijkstras;

import java.util.*;

public class Main {
    public static void main(String arg[])
    {
 
        int V = 5;
        int source = 0;
 
        // Adjacency list representation of the
        // connected edges by declaring List class object
        // Declaring object of type List<Node>
        List<List<Node> > adj
            = new ArrayList<List<Node> >();
 
        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }
 
        // Inputs for the GFG(dpq) graph
        adj.get(0).add(new Node(1, 9));
        adj.get(0).add(new Node(2, 6));
        adj.get(0).add(new Node(3, 5));
        adj.get(0).add(new Node(4, 3));
 
        adj.get(2).add(new Node(1, 2));
        adj.get(2).add(new Node(3, 4));
 
        // Calculating the single source shortest path
        DPQ dpq = new DPQ(V);
        dpq.dijkstra(adj, source);
 
        // Printing the shortest path to all the nodes
        // from the source node
        System.out.println("The shorted path from node :");
 
        int [] dist = dpq.getDist();
        for (int i = 0; i < dist.length; i++)
            System.out.println(source + " to " + i + " is "
                               + dist[i]);
    }
}
