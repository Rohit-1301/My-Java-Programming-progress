package graphs.algorithm.bellmanford;

import java.util.*;

public class shortse {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    // This function is used to print the shortest path from source to destination
    // its time complexity is worse than dijkstra because of the loop its time
    // complexity is O(V^2)
    // its get failed in negative weight cycle test case and it is passed in all
    // other test cases.it is better to not consider negative weight cycle
    public static void bellmanford(ArrayList<Edge> graph[], int V, int src) {
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        for (int j = 0; j < V; j++) {
            for (int k = 0; k < graph[j].size(); k++) {
                Edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                    System.out.println("Negative weight cycle found");
                    break;
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        bellmanford(graph, V, 0);
    }
}
