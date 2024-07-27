package graphs.cycledetention;
import java.util.*;
public class undirectedgraph {
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

        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 3));

        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 0));
        

    }
    public static boolean printcycledetect(ArrayList<Edge> graph[], int curr,boolean[] vis,int path) {
       vis[curr]=true;
       for(int i=0;i<graph[curr].size();i++){
           Edge e=graph[curr].get(i);
            if(vis[e.dest]==true && path!=e.dest){
                return true;
            }
           else if(vis[e.dest]==false){
               if(printcycledetect(graph,e.dest,vis,curr)){
                   return true;
               }
           }

       }
       return false;
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(printcycledetect(graph,i,vis,-1)){
                    System.out.println("Cycle detected");
                    break;
                }
                else{
                    System.out.println("cycle is not detected");
                    break;
                }
            }
        }
    }
}
