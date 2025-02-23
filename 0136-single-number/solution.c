int singleNumber(int* nums, int numsSize) {
    int uniqueNum = 0;
    for(int i = 0; i < numsSize; i++){
        uniqueNum = uniqueNum ^ nums[i];
    } 
    return uniqueNum;
}
