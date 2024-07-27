package graphs.traversalofgrsph.breadthfirstsearch;

import java.util.*;

public class bfs {

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

    public static void bfss(ArrayList<Edge> graph[], int V,boolean visited[],int start) {
        Queue<Integer> q = new LinkedList<>();
       
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visited[curr] == false) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void bfsallpath(ArrayList<Edge> graph[], int V,boolean visited[],int curr,int target,String  path) {
            if(curr==target){
                System.out.println(path);
                return;
            }
            Queue<Integer> q = new LinkedList<>();
       
            q.add(curr);
            while (!q.isEmpty()) {
                 curr = q.remove();
                if (visited[curr] == false) {
                    System.out.print(path + " ");
                    visited[curr] = true;
                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                        bfsallpath(graph, V,visited,e.dest,target,path+e.dest+" ");
                        visited[curr] = false;
                    }
                }
            }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                bfss(graph, V,visited,i);
            }
        }
       bfsallpath(graph, V, visited, 0, 5, "0 ");
    }
}
