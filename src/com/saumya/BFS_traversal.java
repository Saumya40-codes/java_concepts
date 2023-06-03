package com.saumya;

import java.util.*;
public class BFS_traversal {
    class Solution {
        // Function to return Breadth First Traversal of given graph.
        public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            boolean[] visited = new boolean[V];
            visited[0] = true;

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);

            ArrayList<Integer> bfs = new ArrayList<>();

            while(!queue.isEmpty()){
                int node = queue.poll();
                bfs.add(node);

                for(int it: adj.get(node)){
                    if(visited[it] == false){
                        visited[it] = true;
                        queue.offer(it);
                    }
                }
            }
            return bfs;
        }
    }
}
