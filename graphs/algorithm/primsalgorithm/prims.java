package graphs.algorithm.primsalgorithm;

import java.util.*;

public class prims {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));
    }

    public static class Pair implements Comparable<Pair> {
        int wt;
        int node;

        Pair(int wt, int node) {
            this.wt = wt;
            this.node = node;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.wt - p2.wt;
        }
    }

    public static void prims(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        pq.add(new Pair(0, src));
        boolean vist[] = new boolean[V];
        int ans = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vist[curr.node]) {
                vist[curr.node] = true;
                ans += curr.wt;
                    for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if (vist[e.dest] == false) {
                        pq.add(new Pair(e.wt, e.dest));
                    }
                }
            }
        }

        System.out.println("the minimum cost of mst is: " + ans);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        prims(graph, 1, V);
    }
}
