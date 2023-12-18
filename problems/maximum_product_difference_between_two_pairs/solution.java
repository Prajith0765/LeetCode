class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int num1= nums[nums.length-1]* nums[nums.length-2];
        int num2= nums[0] * nums[1];
        return num1-num2;
    }
}