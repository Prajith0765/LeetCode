class Solution {
    public boolean checkPowersOfThree(int n) {
        int power = 1;
        while(power <= n){
            power = power * 3;
        }

        while(n > 0 && power > 0){
            if(n >= power){
                n = n - power;
            }
            power = power / 3;
        }
        return n == 0 ? true: false;
    }
}
