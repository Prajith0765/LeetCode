class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while(n != 0){
            int r = n % 10;
            n = n / 10;
            sum += r;
            mul *= r;
        }
        return(mul - sum);
    }
}
