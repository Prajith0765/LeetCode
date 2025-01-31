class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int res = 0;
        for(int  i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                res += 1;
            }else{
                max = Math.max(max, res); 
                res = 0;
            }
        }
        return Math.max(max, res); 
    }
}
