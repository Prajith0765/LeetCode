class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for(int i = arr.length - 1; i >= 0; i--){
            result.append(arr[i] + " ");
        }
        return result.toString().trim();
    }
}
