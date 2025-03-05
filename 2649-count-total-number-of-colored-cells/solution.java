class Solution {
    public long coloredCells(int n) {
        long result = 0;

        for(int i = 1; i <= n; i++){
            if(i == 1){
                result = 1;
            } else {
                result += 4 *(i - 1);
            }
        }
        return result;
    }
}
