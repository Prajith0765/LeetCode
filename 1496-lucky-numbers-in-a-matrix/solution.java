class Solution {
    public List<Integer> luckyNumbers(int[][] arr) 
    {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> list = new ArrayList<>();
        List<Integer> col_max = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            int max =Integer.MIN_VALUE;
            for(int j =0;j<m;j++)
            {
                max = max < arr[j][i] ? arr[j][i] : max;
            }
            col_max.add(max);
        }
        for(int i =0;i<m;i++)
        {
            int min=Integer.MAX_VALUE;
            int ind = -1;
            for(int j =0;j<n;j++)
            {
                if(arr[i][j]<min)
                {
                    min = arr[i][j];
                    ind =j;
                }
            }
            if(col_max.get(ind) == min)
            {
                list.add(min);
            }
        }
        return list;        
    }
}
