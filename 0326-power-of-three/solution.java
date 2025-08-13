public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        long val = 1;
        while (val < n) {
            val *= 3;
        }
        return val == n;
    }
}

