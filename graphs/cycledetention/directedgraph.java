package graphs.cycledetention;

import java.util.*;

public class directedgraph {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));

    }

    public static boolean cycle(ArrayList<Edge> graph[], boolean visited[], int curr, boolean[] rec) {
        visited[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest] == true) {
                return true;
            } else if (rec[e.dest] == false) {
                if (cycle(graph, visited, e.dest, rec) == true) {
                    return true;
                }
            }

        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                boolean iscycle = cycle(graph, vis, 0, rec);
                if (iscycle == true) {
                    System.out.println("cycle is detected");
                    break;
                } else {
                    System.out.println("cycle is not detected");
                    break;
                }
            }
        }

    }
}
