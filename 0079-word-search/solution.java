class Solution {
    private boolean helper(char[][] arr, String word, int i, int j, int idx, int row, int col, int[][] visited) {
        if (i < 0 || j < 0 || i >= row || j >= col || visited[i][j] == 1)
            return false;
        if (word.charAt(idx) != arr[i][j])
            return false;
        if (idx == word.length() - 1)
            return true;

        visited[i][j] = 1;
        if (helper(arr, word, i, j + 1, idx + 1, row, col, visited) ||
            helper(arr, word, i + 1, j, idx + 1, row, col, visited) ||
            helper(arr, word, i - 1, j, idx + 1, row, col, visited) ||
            helper(arr, word, i, j - 1, idx + 1, row, col, visited))
            return true;
        
        visited[i][j] = 0;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int[][] visited = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (helper(board, word, i, j, 0, row, col, visited))
                    return true;
            }
        }
        return false;
    }
}
