package Graph_theory.Dijkstras;

import java.util.*;

public class DPQ {
    //member variables of this class
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;

    //Number of vertices
    private int V;
    List<List<Node>> adj;

    //Constructor of this class
    public DPQ(int V) {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<>(V, new Node());
    }

    //Method 1, Dijkstras algorithm
    public void dijkstra(List<List<Node>> adj, int src) {
        this.adj = adj;

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        //Add source node to the priotiry queue
        pq.add(new Node(src, 0));

        //Distance to the source is 0
        dist[src] = 0;

        while (settled.size() != V) {

            //Terminating condition check when the PQ is empty, return
            if (pq.isEmpty()) {
                return;
            }

            //removing the minimum distance node from the PQ
            int u = pq.remove().node;

            //Adding the node whose distance is finalized
            if (settled.contains(u)) {
                //continue keyword skips execution for following check
                continue;
            }
            //We don't have to call e_neighbours(u) if u is already present in the settled set
            settled.add(u);
            e_Neighbours(u);
        }
    }

    //Method 2, to proces all the neighbours of the passed node
    private void e_Neighbours(int u) {
        int edgeDistance = -1;
        int newDistance = -1;

        //All the neighbours of v
        for (int i = 0; i < adj.get(u).size(); i++) {
            Node v = adj.get(u).get(i);

            //If current node hasn't already been processed
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                //If new distance is cheaper in cost
                if (newDistance < dist[v.node]) {
                    dist[v.node] = newDistance;
                }

                //Add the current node to the queue
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }

    public int[] getDist() {
        return dist;
    }

}
