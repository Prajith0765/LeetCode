class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        long max = 0;
        long maxDiff = 0;
        for(int num : nums){
            ans = Math.max(ans, maxDiff * num);
            max = Math.max(max, num);
            maxDiff = Math.max(maxDiff, max - num);
        }
        return ans;
    }
}
