class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;
        int oddCount = 0;  // Count of subarrays with odd sum
        int evenCount = 1; // Count of subarrays with even sum (starting with the empty subarray)
        int result = 0;    // To store the final result
        int currentSum = 0; // To store the current sum as we iterate

        // Iterate through the array
        for (int num : arr) {
            currentSum += num;

            // If the current sum is odd, add the even subarrays count to the result
            if (currentSum % 2 != 0) {
                result += evenCount;
                oddCount++;
            } else {
                // If the current sum is even, add the odd subarrays count to the result
                result += oddCount;
                evenCount++;
            }

            // Keep the result within bounds of the MOD value
            result %= MOD;
        }

        return result;
    }
}
