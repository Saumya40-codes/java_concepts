package solved_topic_questions;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Number_of_Provinces {
    public static void main(String[] args) {
        class Solution {

            private static void dfs(int nodes, ArrayList<ArrayList<Integer>> adjList, int[] visited){
                visited[nodes] = 1;

                for(int lt : adjList.get(nodes)){
                    if(visited[lt] == 0){
                        dfs(lt,adjList, visited);
                    }
                }
            }
            static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
                // code here

                // conversion to adj list as matrix given here

                ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();


                for(int i = 0 ;  i < V ; i++){
                    adjList.add(new ArrayList<Integer>());
                }

                for(int i = 0; i < V ; i++){
                    for(int j = 0 ; j < V ; j++){
                        if(adj.get(i).get(j)== 1 && i != j){
                            adjList.get(i).add(j);
                            adjList.get(j).add(i);
                        }
                    }
                }


                int[] arr = new int[V];
                int count = 0;

                for(int i =  0; i < V ; i++){
                    if(arr[i] == 0){
                        count++;
                        dfs(i, adjList, arr);
                    }
                }
                return count;
            }
        };
    }
}

// had to convert adj matrix to list, couldve done other way as well

// LC solution for same problem, different approach



/*
class Solution {
    private static void dfs(int node, int[][] adj, boolean[] visited){
        visited[node] = true;

        for(int neighbours = 0; neighbours < adj.length ; neighbours++){
            if(adj[node][neighbours] == 1 && !visited[neighbours]){
                dfs(neighbours,adj,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] arr = new boolean[isConnected.length];
        int num = 0;

        for(int i = 0 ; i < isConnected.length ; i++){
            if(!arr[i]){
                num++;
                dfs(i,isConnected,arr);
            }
        }
        return num;
    }
}
 */