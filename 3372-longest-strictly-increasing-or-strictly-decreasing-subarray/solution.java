class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlen = 1;
        int incrlen = 1;
        int decrlen = 1;
        if(nums.length < 2){
            return 1;
        }
        for(int  i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                decrlen +=1;
                incrlen = 1;
            } else if(nums[i] > nums[i - 1]){
                incrlen += 1;
                decrlen = 1;
            } else{
                incrlen = 1;
                decrlen = 1;
            }
            maxlen = Math.max(maxlen, Math.max(incrlen, decrlen));
        }
        return maxlen;
    }
}
