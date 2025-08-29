class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();
        
        for(int[] arr : intervals){
            
            if(list.isEmpty() || list.get(list.size() - 1)[1] < arr[0]){
                list.add(arr);
            } else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], arr[1]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
