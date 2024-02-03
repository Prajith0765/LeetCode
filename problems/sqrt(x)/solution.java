class Solution {
    public int mySqrt(int x) {
        int first = 1; 
        int last = x;
        if(x == 0){
            return x;
        }
        while(first <= last){
            int mid = first + (last - first) / 2;
            if(mid == x / mid){
                return mid;
            }
            if(mid > x / mid){
                last = mid - 1;
            }
            if(mid < x / mid){
                first = mid + 1;
            }
        }
        return last;
    }
}