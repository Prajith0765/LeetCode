class Solution {
     static int maxOr = 0;
        static int count =0;
    public int countMaxOrSubsets(int[] nums) {  
    

            maxOr = 0;
            count = 0;

            for(int num:nums){
                maxOr|= num;
            }

            dfs(nums, 0, 0);
            return count;
        }
        private static  void dfs(int [] nums,int index,int currentOr){
            if(index== nums.length){
                if(currentOr==maxOr){
                    count++;
                }
                return;
            }
            dfs(nums, index+1,currentOr|nums[index]);
            dfs(nums,index+1, currentOr);
        }


    
        
    
}
