class Solution {
    public int lastStoneWeight(int[] stones) {
       
        int num = stones.length;
        while(num > 1){
             Arrays.sort(stones);
            stones[num - 2] = stones[num - 1] - stones[num - 2];
            num--;
        }
        return stones[0];
    }
}
