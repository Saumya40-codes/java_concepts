package com.saumya;

import java.util.*;

public class DFS_traversal {
    class Solution {

        private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, ArrayList<Integer> list){
            visited[node] = 1;
            list.add(node);

            for(int it : adj.get(node)){
                if((visited[it] == 0)){
                    dfs(it,adj,visited,list);
                }
            }
        }
        // Function to return a list containing the DFS traversal of the graph.
        public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            int[] arr = new int[V+1];
            int start = 0; // 0-based index
            ArrayList<Integer> ls = new ArrayList<>();
            dfs(start,adj,arr,ls);
            return ls;
        }
    }
}
// TC : O(N) + O( sum of all degrees) = O(N) + O(2 * Edges)
// SC ~= O(N)
