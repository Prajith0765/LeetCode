class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int  i = 0; i < sentences.length; i++){
            String[] arr = sentences[i].split(" ");
            if(arr.length > count){
                count = arr.length;
            } else{
                count = count;
            }
        }
        return count;
    }
}
