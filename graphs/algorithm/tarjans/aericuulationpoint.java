package graphs.algorithm.tarjans;

import java.util.ArrayList;

public class aericuulationpoint {
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
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));

    }

    public static void dfs(ArrayList<Edge> graph[], boolean visited[], int dt[], int lowdt[], int curr, int time,
            int par,boolean[] ap) {
        visited[curr] = true;
        dt[curr] = lowdt[curr] = ++time;
        int children=0;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh=e.dest;
            if (neigh==par)
                continue;
            else if (!visited[e.dest]) {
                dfs(graph, visited, dt, lowdt, e.dest, time, curr,ap);
                lowdt[curr] = Math.min(lowdt[curr], lowdt[e.dest]);
               if(dt[curr]<=lowdt[neigh] && par!=-1){
                   ap[curr]=true;
                  
               }
               children++;
            } else {
                lowdt[curr] = Math.min(lowdt[curr], dt[e.dest]);
            }
        }
        if(children>1 && par==-1){
            ap[curr]=true;
        }
       
    }

    public static void tarjans(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V];
        int time = 0;
        int dt[] = new int[V];
        int lowdt[] = new int[V];
        boolean ap[]=new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(graph, visited, dt, lowdt, i, time, -1,ap);
            }
        }
        for(int i=0;i<V;i++){
            if(ap[i]==true){
                System.out.println("Articulation point is : "+i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        System.out.println("The bridges in the graph is: ");
        tarjans(graph, V);
    }
}
