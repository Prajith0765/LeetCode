class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int  n = queries.length;
        int[] result = new int[n];
        Map<Integer, Integer> ballToColor = new HashMap<>(); // Map to track ball to color mappings
        Map<Integer, Integer> colorCount = new HashMap<>(); // Map to count occurrences of each color
        for(int i = 0; i < n; i++){
            int ball = queries[i][0];// Ball number from query
            int color = queries[i][1]; // Color assigned to the ball
            // If the ball has a previously assigned color
            if(ballToColor.containsKey(ball)){
                int oldColor = ballToColor.get(ball); // Get the old color assigned to the ball
                int count = colorCount.get(oldColor) - 1; // Decrease the count of the old color in the colorCount map
            
                if(count == 0){ // If the count becomes zero, remove the color from the colorCount map
                    colorCount.remove(oldColor);
                } else{
                    colorCount.put(oldColor, count);
                }
            }

            ballToColor.put(ball, color); // Assign the new color to the ball
             // Increase the count of the new color in the colorCount map
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            // Store the current number of distinct colors in the result array
            result[i] = colorCount.size();
        }
        return result;
    }
}
