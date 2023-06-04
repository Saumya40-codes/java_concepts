package solved_topic_questions;

public class Number_of_islands_BFS_DFS {
    class Pair{
        int first;
        int second;

        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    class Solution {

        private static void dfs(int ro, int co, int[][] vis, char[][] grid){
            vis[ro][co] = 1;
            int n = grid.length;
            int m = grid[0].length;


            for(int delRow = -1 ; delRow <= 1; delRow++){
                for(int delCol = -1; delCol <= 1 ; delCol++){
                    int nrow = ro + delRow;
                    int ncol = co + delCol;

                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0){
                        vis[nrow][ncol] = 1;
                        dfs(nrow,ncol,vis,grid);
                    }
                }
            }
        }


        // Function to find the number of islands.
        public int numIslands(char[][] grid) {
            // Code here
            int n = grid.length;
            int m = grid[0].length;

            int[][] visited = new int[n][m];
            int count = 0;

            for(int row = 0 ; row < n ; row++){
                for(int col = 0; col < m ; col ++){
                    if(visited[row][col] == 0 && grid[row][col] == '1'){
                        count++;
                        dfs(row,col,visited,grid);
                    }
                }
            }
            return count;
        }
    }
}
// bfs implementation

/*
class Pair{
    int first;
    int second;

    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    // Function to find the number of islands.

    private static void bfs(int ro, int co, int[][] vis, char[][] grid){
        vis[ro][co] = 1;
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(ro,co));
        int n = grid.length;
        int m = grid[0].length;
        

        while(!queue.isEmpty()){
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();

        for(int delRow = -1 ; delRow <= 1; delRow++){
            for(int delCol = -1; delCol <= 1 ; delCol++){
                int nrow = row + delRow;
                int ncol = col + delCol;

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0){
                    vis[nrow][ncol] = 1;
                    queue.add(new Pair(nrow,ncol));
                }
            }
        }
        }
    }




    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        int count = 0;

        for(int row = 0 ; row < n ; row++){
            for(int col = 0; col < m ; col ++){
                if(visited[row][col] == 0 && grid[row][col] == '1'){
                    count++;
                    bfs(row,col,visited,grid);
                }
            }
        }
        return count;
    }
}
 */