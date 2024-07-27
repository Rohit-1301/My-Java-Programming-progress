package graphs.traversalofgrsph.depthfirstsearch;

import java.util.ArrayList;

public class allpath {
    
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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));
        graph[5].add(new Edge(5, 4));

        graph[6].add(new Edge(6, 5));
    }
    public static void dfsallpath(ArrayList<Edge> graph[], boolean visited[],int curr,int target,String path) {
        if(curr==target){
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                visited[curr] = true;
                dfsallpath(graph,  visited,e.dest,target,path+e.dest+" ");
                visited[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        // boolean visited[] = new b.out.println();
        // dfstwo(graph, 0, visited);oolean[V];
        // dfs(graph, V, visited, 0);
        // System
        dfsallpath(graph, new boolean[V], 0, 5, "0 ");
    }
}
