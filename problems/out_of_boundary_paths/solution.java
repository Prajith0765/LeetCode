class Solution {
    int move = 0;
    final int mod = 1000000007;
    int[][][] dp;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return path(m, n, maxMove, startRow, startColumn, move);
    }
    private int path(int m, int n, int maxMove, int i, int j, int move){

        if(i < 0 || i >= m || j < 0 || j >= n){
            return 1;
        }
        if(move == maxMove){
            return 0;
        }
        if(dp[i][j][move] != -1){
            return dp[i][j][move];
        }
        int count = 0;
        count = (count + path(m, n, maxMove, i + 1, j, move + 1)) % mod;
        count = (count + path(m, n, maxMove, i - 1, j, move + 1)) % mod;
        count = (count + path(m, n, maxMove, i, j + 1, move + 1)) % mod;
        count = (count + path(m, n, maxMove, i, j - 1, move + 1)) % mod;

        return dp[i][j][move] = count % mod;
    }
}