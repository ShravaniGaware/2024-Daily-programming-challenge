mport java.util.*;

class Graph {
    private final int V;
    private final List<List<Integer>> adj;
    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    private boolean isCyclicUtil(int v, boolean[] visited, int parent) {
        visited[v] = true;

       
        for (Integer i : adj.get(v)) {

            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v)) {
                    return true;
                }
            }
          
            else if (i != parent) {
                return true;
            }
        }

        return false;
    }

    
    public boolean isCyclic() {
        
        boolean[] visited = new boolean[V];

     
        for (int i = 0; i < V; i++) {
            if (!visited[i]) { 
                if (isCyclicUtil(i, visited, -1)) {
                    return true;
                }
            }
        }

        return false;
    }
}

public class day26{
    public static void main(String[] args) {
      
        int V = 5;
        int E = 5;
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 0 } };

        Graph graph = new Graph(V);

        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }

     
        if (graph.isCyclic()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
