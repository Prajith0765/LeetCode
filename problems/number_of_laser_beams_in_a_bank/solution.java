class Solution {
    public int numberOfBeams(String[] bank) {
        int curr = 0, prev = 0, total = 0, count = 0;
        for(int i = 0; i < bank.length; i++){
            for(int j = 0; j < bank[i].length(); j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
                if(count !=0){
                    prev = curr;
                    curr = count;
                    count = 0;
                    if(curr !=0 && prev !=0){
                        total += curr * prev;
                        prev = 0;
                    }

                }
        }
        return total;
    }
}