class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        int help[] = new int[1001];
        for(int arr[] : items1)
            help[arr[0]] = arr[1];
        
        for(int arr[] : items2)
            if(help[arr[0]] != 0)
                help[arr[0]] += arr[1];
            else
                help[arr[0]] = arr[1];
        for(int i = 0; i < 1001; i++)
            if(help[i] != 0){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(help[i]);
                ans.add(list);
            }
        return ans;
    }
}
