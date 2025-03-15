class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueNum = new HashSet<>();

        for(int i = 0; i < digits.length; i++){
            for(int j = 0; j < digits.length; j++){
                for(int k = 0; k < digits.length; k++){
                    if(i != j && j != k && i != k){
                        int num = digits[i] * 100 + digits[j] * 10 +
                                  digits[k];

                        if(digits[i] != 0 && num % 2 == 0){
                            uniqueNum.add(num);
                        }
                    }
                }
            }
        }
        return uniqueNum.size();
    }
}
