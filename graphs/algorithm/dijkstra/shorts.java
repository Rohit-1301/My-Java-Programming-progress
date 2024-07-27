package graphs.algorithm.dijkstra;
import java.util.*;
public class shorts {
        static class Edge {
            int src;
            int dest;
            int wt;
            Edge(int src, int dest,int wt) {
                this.src = src;
                this.dest = dest;
                this.wt=wt;
            }
        }
        public static void creategraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));

            graph[1].add(new Edge(1, 3, 7));
            graph[1].add(new Edge(1, 2, 1));

            graph[2].add(new Edge(2, 4, 3));

            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));
        }
        public static class Pair implements Comparable<Pair>{
            int wt;
            int node;
            Pair(int wt,int node){
                this.wt=wt;
                this.node=node;
            }
            @Override
            public int compareTo(Pair p2){
                return this.wt-p2.wt;
            }
        }
        // This function is a greedy algorithm. It finds the shortest path from src to all other vertices.
        //And its complexity is O(E+ElogV)
        //its get failed in the testcase where wt is negative.
        public static void dijkstra(ArrayList<Edge> graph[],int src,int V){
            PriorityQueue<Pair> pq=new PriorityQueue<Pair>();
            int dist[]=new int[V];
           for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
            boolean visited[]=new boolean[V];
            pq.add(new Pair(0,0));
            while(!pq.isEmpty()){
                Pair p=pq.remove();
                 if(!visited[p.node]){
                    visited[p.node]=true;
                   for(int i=0;i<graph[p.node].size();i++){
                    Edge e=graph[p.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[v]>dist[u]+e.wt){
                        dist[v]=dist[u]+e.wt;
                        pq.add(new Pair(dist[v],v));
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
       dijkstra(graph, 0, V);

    }
}
