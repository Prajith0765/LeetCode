class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int Islands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    Islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return Islands;
    }

    private void dfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '0';    // Mark as Visited
        dfs(grid, i + 1, j); // Down
        dfs(grid, i - 1, j); // UP
        dfs(grid, i, j + 1); // Right
        dfs(grid, i, j - 1); // Left
    }
}
