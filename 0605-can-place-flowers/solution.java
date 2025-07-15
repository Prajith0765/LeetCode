class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean[] flag = new boolean[flowerbed.length];

        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                flag[i] = true;
            }
        }
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (!flag[i] && (i == 0 || !flag[i - 1]) && (i == flowerbed.length - 1 || !flag[i + 1])) {
                flag[i] = true;     
                n--;                
                i++;               
            }
        }

        return n <= 0;
    }
}
