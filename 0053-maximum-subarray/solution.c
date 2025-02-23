int max(int a, int b) {
    return (a > b) ? a : b;
}
int maxSubArray(int* nums, int numsSize) {
    int l=0, r=0;
    int res = -99999;
    int sum = 0;
    while (r < numsSize) {
        while (sum < 0) {
            sum -= nums[l];
            l++;
        }
        sum += nums[r];
        res = max(res, sum);
        r++;
    }
    return res;
}
