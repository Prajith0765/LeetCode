class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operation = 0;
        for(int i = 1; i < n; i++){
            if(nums[i - 1] >= nums[i]){
                int r = nums[i - 1] + 1;
                int d = r - nums[i];
                operation += d;
                nums[i] = r;
            }
            else {
                continue;
            }
        }

        return operation;
    }
}
