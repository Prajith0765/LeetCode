class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int maxlen = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int a = arr[i];
                int b = arr[j];
                int len = 2;

                while(set.contains(a + b)){
                    int c = a + b;
                    a = b;
                    b = c;
                    len++;
                }

                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen == 2 ? 0 : maxlen;
    }
}
