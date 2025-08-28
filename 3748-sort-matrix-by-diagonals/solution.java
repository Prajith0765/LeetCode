class Solution {
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = grid.length;
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                int key = row - col;

                map.putIfAbsent(key, new ArrayList<>());

                map.get(key).add(grid[row][col]);
            }
        }

        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            int key = entry.getKey();
            ArrayList<Integer> list = entry.getValue();

            if(key >= 0){
                list.sort(Collections.reverseOrder());
            }
            if(key < 0){
                Collections.sort(list);
            }
        }

         Map<Integer, Integer> indexMap = new HashMap<>();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int key = row - col;
                int idx = indexMap.getOrDefault(key, 0);
                grid[row][col] = map.get(key).get(idx);
                indexMap.put(key, idx + 1);
            }
        }

        return grid;
    }
}
