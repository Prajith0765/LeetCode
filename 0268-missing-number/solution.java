class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int  i = 0;
        while(i < nums.length){
            if(nums[i] != i){
                return i;
            }
            i++;
        }
        return nums.length;
    }
}
