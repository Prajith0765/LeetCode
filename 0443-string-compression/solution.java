class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n == 0) return 0;
        int w = 0;
        int r = 0;
        while(r < n){
            char x = chars[r];
            int cnt = 0;
            while(r < n && chars[r] == x){
                r++;
                cnt++;
            }
            chars[w++] = x;
            if(cnt > 1){
                for(char d : Integer.toString(cnt).toCharArray()){
                    chars[w++] = d;
                }
            }
        }
        return w;
    }
}
