class Solution {
    private boolean helper(long mid, int[] ranks, int cars){
        int count = 0;

        for(int rank : ranks){
            count += Math.sqrt(mid/rank);

            if(count >= cars) return true;
        }
        return false;
    }

    public long repairCars(int[] ranks, int cars) {
        long l = 1, r = ranks[0];
        for(int rank : ranks){
            r = Math.max(r, rank);
        }
        r = r * cars * cars;
        long ans = r;

        while(l <= r){
            long mid = l + (r - l) / 2;

            if(helper(mid, ranks, cars)){
                ans = mid;
                r = mid - 1;
            } else{
                l = mid + 1;
            }
        }
        return ans;
    }
}
