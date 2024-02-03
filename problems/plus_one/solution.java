class Solution {
    public int[] plusOne(int[] digits) {
        int s = digits.length;
        int i = s-1;
        while(i >=0){
            if(digits[i] == 9){
                digits[i] = 0;
                i--;
            }
            else{
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
    int[] ans =new int[s+1];
    ans[0] = 1;
    return ans;
    }
}