package Graph_theory.Edmonds_Karp;

import java.util.LinkedList;
import java.lang.Exception;

public class Edmonds_Karps {
    private static final int V =6;
    
    public boolean bfs(int rGraph[][], int s, int t, int parent[]) {
        //Create a visited array and mark all vertices as not visited
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

        //Create a queue, enqueue source vertex and mark source vertex as visited
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        //Standard BFS loop
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v = 0; v < V; v++) {
                if (!visited[v] && rGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        //If we reached the sunk in BFS starting from source, then return true, else false
        return visited[t] == true;
    }

    public int fordFulkerson(int graph[][], int s, int t) {
        int u, v;

        //Create a residual graph and fill the residual graph with given capacities 
        //in the original graph as residual capacities in residual graph

        //Residual graph where rGraph[i][j] indicates residual capacity of edge 
        //from i to j (if there is an edge)
        //If rGraph[i][j] is 0, then there is not

        int rGraph[][] = new int[V][V];
        for (u = 0; u < V; u++) {
            for (v = 0; v < V; v++) {
                rGraph[u][v] = graph[u][v];
            }
        }

        //This array is filled by BFS and to store path
        int parent[] = new int[V];
        int max_flow = 0; //There is no flow initally

        //Augment the flow while there is path from source to sink
        while(bfs(rGraph, s, t, parent)) {
            //Find minimum residual capacity of the edges along the path filled by BFS
            //Or we can say find the maximum flow through the path found
            int pathFlow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                pathFlow = Math.min(pathFlow, rGraph[u][v]);
            }

            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] -= pathFlow;
                rGraph[v][u] += pathFlow;
            }

            //Add path flow to overall flow
            max_flow += pathFlow;

        }

        return max_flow;

    }

        // Driver program to test above functions
        public static void main (String[] args) throws java.lang.Exception {
            // Example graph in adjancancy matrix
            int graph[][] =new int[][] { {0, 16, 13, 0, 0, 0},
                                         {0, 0, 10, 12, 0, 0},
                                         {0, 4, 0, 0, 14, 0},
                                         {0, 0, 9, 0, 0, 20},
                                         {0, 0, 0, 7, 0, 4},
                                         {0, 0, 0, 0, 0, 0}
                                       };
            Edmonds_Karps m = new Edmonds_Karps();
            System.out.println("The maximum possible flow is " +
                               m.fordFulkerson(graph, 0, 5));
        }

}
