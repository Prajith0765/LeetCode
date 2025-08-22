class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int startRow = n - 1, endRow = 0;
        int startCol = m - 1, endCol = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    
                    startRow = Math.min(startRow, i);
                    endRow = Math.max(endRow, i);

                    startCol = Math.min(startCol, j);
                    endCol = Math.max(endCol, j);
                }
            }
        }

        int height = endRow - startRow + 1;
        int breadth = endCol - startCol + 1;

        return height * breadth;
    }
}
