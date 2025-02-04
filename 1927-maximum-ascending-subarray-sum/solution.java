class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum = nums[0];
        int cursum = nums[0];

        for(int  i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                cursum += nums[i];
            } else{
                maxsum = Math.max(maxsum, cursum);
                cursum = nums[i];
            }
        }
        return Math.max(maxsum, cursum);
    }
}
