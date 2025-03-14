class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = getMax(candies);
        int result = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long childCount = 0;

            for(int candy : candies){
                childCount += candy / mid;
            }

            if(childCount >= k){
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private int getMax(int[] candies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        return max;
    }
}
