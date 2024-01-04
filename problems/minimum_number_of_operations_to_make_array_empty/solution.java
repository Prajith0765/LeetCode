class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int r = 0;
        int s = 0;
        while(s < nums.length){
            int c = s;
            while(c < nums.length && nums[c] == nums[s]){
                c++;
            }
            int count = c-s;
            if(count == 1){
                return -1;
            }
            r += count/3;
            if(count % 3 != 0){
                r++;
            }
            s = c;
        }
        return r;
    }
}