class Solution {
    public int[] closestPrimes(int left, int right) {
        if(left == 1) left++;
        boolean [] visited= new boolean [right + 1];
        for(int i = 2; i * i <= right; i++)
        {
            if(!visited[i])
            {
                for(int j = i * i; j <= right; j += i)
                {
                    visited[j] = true;
                }
            }
        }
        int last = -1;
        int min = Integer.MAX_VALUE;
        int ans [] = {-1, -1};
        for(int num = left; num <= right; num++)
        {
            if(!visited[num])
            {
                if(last != -1)
                {
                    if(min > num - last)
                    {
                        min = num - last;
                        ans[0] = last;
                        ans[1] = num;
                    }
                }
                last = num;
            }
        }
        return ans;
    }
}
