class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder result = new StringBuilder();
        int[] arr = new int[n + 1];
        int index = 0;
        
        for(int i = 0; i <= n; i++){
            arr[index++] = i + 1;
            if(i == n || pattern.charAt(i) == 'I'){
                while(index > 0){
                    result.append(arr[--index]);
                }
            }
        }
        return result.toString();
    }
}
