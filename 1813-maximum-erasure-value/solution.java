class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        int left = 0;
        int currsum = 0;
        int maxsum = 0;

        for(int right = 0; right < nums.length; right++){
            while(hset.contains(nums[right])){
                hset.remove(nums[left]);
                currsum -= nums[left];
                left++;
            }

            hset.add(nums[right]);
            currsum += nums[right];

            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }
}
