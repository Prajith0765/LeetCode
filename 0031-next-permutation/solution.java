class Solution {
    public void nextPermutation(int[] nums) {
        int num1 = -1;
        int num2 = -1;

        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                num1 = i;
                break;
            }
        }
        if(num1 == -1){
            reverse(nums,0);
        }

        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[num1]){
                    num2=i;
                    break;
                }
            }
            swap(nums, num1, num2);
            reverse(nums, num1+1);
        }

    }

    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

