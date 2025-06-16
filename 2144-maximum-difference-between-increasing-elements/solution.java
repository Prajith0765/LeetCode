class Solution {
    public int maximumDifference(int[] nums) {
        int minval = nums[0];
        int maxdiff = -1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > minval){
                maxdiff = Math.max(maxdiff, nums[i] - minval);
            } else{
                minval = nums[i];
            }
        }
        return maxdiff;
    }
}
