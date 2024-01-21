class Solution {
    public int rob(int[] nums) {
        int[] arr = new int[nums.length + 1];
        arr[0] = 0;
        arr[1] = nums[0];
        for(int i = 2; i <= nums.length; i++){
            int skipped = arr[i - 1];
            int robbed = nums[i - 1] + arr[i - 2];
            arr[i] = Math.max(skipped, robbed); 
        }
        int maxvalue = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxvalue = Math.max(maxvalue, arr[i]);
        }
        return maxvalue;
    }
}