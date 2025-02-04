class Solution {
    public boolean find132pattern(int[] nums) {
        	int n = nums.length;
	        if (Objects.isNull(nums) || n < 3) return false;
	        int second = Integer.MIN_VALUE;
	        int k = n;
	        for(int i = n - 1 ; i >= 0 ; i--){
	            if(nums[i] < second) {
	            	return true;
	            }
	            while (k < n && nums[i] > nums[k]) {
	            	second = nums[k++];
	            }
	            nums[--k] = nums[i];
	        }
	        return false;
    }
}
