class Solution {
    public int maximumLength(int[] nums) {
        int count1 = 0, count2 = 0;
        for(int num : nums){
            if(num % 2 == 0) count1++;
            else count2++;
        } 
        
        int odd = 0, even = 0;
        for(int num : nums){
            if(num % 2 == 0){
                even = Math.max(even, odd+1);
            } else{
                odd = Math.max(odd, even+1);
            }
        }

        return Math.max(Math.max(count1, count2), Math.max(odd, even));
    }
}
