import java.util.Arrays;

class Solution {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr); // Sorting to handle duplicates
        boolean[] visited = new boolean[arr.length];
        
        return backtrack(arr, visited);
    }

    private int backtrack(char[] arr, boolean[] visited) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue; // Skip already used characters
            
            // Skip duplicate characters in the same recursion depth
            if (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            count += 1 + backtrack(arr, visited); // Count current sequence and explore further
            visited[i] = false; // Backtrack
        }
        
        return count;
    }
}

