class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int maxArea = 0;
        int maxDig = 0;

        for(int i = 0; i < n; i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int currDig = l * l + w * w;

            if(currDig > maxDig || currDig == maxDig && l * w > maxArea){
                maxDig = currDig;
                maxArea = l * w;
            }
        }

        return maxArea;
    }
}
