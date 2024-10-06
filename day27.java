import java.util.*;

public class day27 {
   
    public static int shortestPath(int V, List<List<Integer>> adjList, int start, int end) {
      
        int[] distance = new int[V];
        Arrays.fill(distance, -1); 
        distance[start] = 0; 
    
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
        
            for (int neighbor : adjList.get(node)) {
               
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[node] + 1; 
                    queue.offer(neighbor); 
                   
                    if (neighbor == end) {
                        return distance[neighbor];
                    }
                }
            }
        }
        
        return -1;
    }
    
    public static List<List<Integer>> createGraph(int V, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        
      
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
       
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        return adjList;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = { {0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4} };
        int start = 0;
        int end = 4;
    
        List<List<Integer>> graph = createGraph(V, edges);
    
        int shortestPathLength = shortestPath(V, graph, start, end);
    
        System.out.println("The shortest path length is: " + shortestPathLength);
    }
}
