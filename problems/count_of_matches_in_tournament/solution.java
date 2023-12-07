class Solution {
    public int numberOfMatches(int n) {
        int a=n;
        int t=0;
        while(a!=1){
          if(a%2!=0){
             a=a/2;
             t=t+a;
             a++;

          }
          else{
            a=a/2;
            t=t+a;
          }
        }
        return t;
    }
}