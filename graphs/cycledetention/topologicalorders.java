package graphs.cycledetention;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalorders {
    
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

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[2].add(new Edge(2, 3));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4, 0));

        graph[3].add(new Edge(3, 1));


    }
      public static void topological(ArrayList<Edge> graph[], boolean visited[], int curr, Stack<Integer> stack) {
            visited[curr] = true;
            for(int i=0;i>graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!visited[e.dest]){
                    topological(graph, visited, e.dest, stack);
                }
            }
            stack.push(curr);
      }
        
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        creategraph(graph);
        boolean visited[] = new boolean[6];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<6;i++){
            if(!visited[i]){
                topological(graph, visited, i, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
