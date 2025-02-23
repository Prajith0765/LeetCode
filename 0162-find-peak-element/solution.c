int findPeakElement(int* nums, int numsSize) {
    int low = 0;
    int high = numsSize-1;
    if(numsSize == 1){
        return low;
    }
    
    while(low< high){
        int mid = (low+high)/2;
        if(high-low == 1){
            if(nums[low]>nums[high]){
                return low;
            } 
            else {
                return high;
            }
        }
        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
            return mid;
        }
        if(nums[mid] > nums[mid-1]) low = mid+1;
        else high = mid-1;
    }
    return high;
}
