package graphs.algorithm.kosarajus;

import java.util.*;

public class ssc {
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
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    public static void topological(ArrayList<Edge> graph[], boolean visited[], int curr, Stack<Integer> stack) {
        visited[curr] = true;
        for (int i = 0; i > graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topological(graph, visited, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void kosarajus(ArrayList<Edge> graph[], int V) {
        // step1 create a stack of vertices
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topological(graph, visited, i, stack);
            }
        }
        // step 2 reverse the graph
        ArrayList<Edge> graphs[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
            graphs[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                graphs[e.dest].add(new Edge(e.dest, e.src));
            }
        }
        // step 3 do dfs on the reversed graph
        int ssc=0;
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (visited[curr] == false) {
                dfs(graph, curr, visited);
                System.out.println();
                ssc++;
            }
            
        }
        System.out.println("The number of strongly connected components is " + ssc);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        kosarajus(graph, V);
    }
}
