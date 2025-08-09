class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
         // If a number is a power of two, it should have only one bit set to 1.
        // We can use bitwise AND operation to check if it's true.
        return(n & (n - 1)) == 0;
    }
}
