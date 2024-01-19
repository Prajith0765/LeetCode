class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] arr = new int[rows][columns];

        for(int col = 0; col < columns; col++){
            arr[0][col] = matrix[0][col];
        }

        for(int row = 1; row < rows; row++){
            for(int col = 0; col < columns; col++){

            int topleft = Integer.MAX_VALUE;
            int top = arr[row-1][col];
            int topright = Integer.MAX_VALUE;
            
             if(col-1 >= 0){
                topleft = arr[row-1][col-1];
             }

             if(col+1 < columns){
                 topright = arr[row-1][col+1];
             }

             int math = Math.min(topleft, top);
             arr[row][col] = matrix[row][col] + Math.min(math, topright);

             }
        }

        int minsum = Integer.MAX_VALUE;
        for(int col = 0; col < columns; col++){
            minsum = Math.min(minsum, arr[rows-1][col]);
        }
        return minsum;
    }
}