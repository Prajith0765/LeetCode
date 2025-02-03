class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;
        
        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Update the second largest
                max1 = num;  // Update the largest
            } else if (num > max2) {
                max2 = num; // Update the second largest
            }
        }
        
        // Calculate the maximum product
        return (max1 - 1) * (max2 - 1);
        
    }
}
