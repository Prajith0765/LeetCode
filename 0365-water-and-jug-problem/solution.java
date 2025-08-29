class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        int l = gcd(x, y);
        if(x + y < target) return false;

        return target % l == 0;
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
