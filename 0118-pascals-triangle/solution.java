class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1 = new ArrayList<>();
        int num = 1;
        for(int i = 1; i <= numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++){
                num = (num * (i - j)) / j;
                temp.add(num);
            }
            l1.add(temp);
        }
        return l1;
    }
}
