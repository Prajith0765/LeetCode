class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2)
           return 1;
        int inc = 1;
        int dec = 1;
        
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > nums[i-1])
               inc = dec+1;
            else if(nums[i] < nums[i-1])
               dec = inc + 1;
        }

        int res = Math.max(inc,dec);
        return res;
    }
}
