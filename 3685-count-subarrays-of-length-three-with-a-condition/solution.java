class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        int first = nums[0];
        int second = nums[1];

        for(int i = 2; i < nums.length; i++){
            int third = nums[i];

            if((first + third) * 2 == second){
                count++;
            }

            first = second;
            second = third;
        }
        return count;
    }
}
