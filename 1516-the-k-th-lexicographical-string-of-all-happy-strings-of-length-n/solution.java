class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        backTrack("", n, list);
        return (k > list.size()) ? "" : list.get(k - 1);
    }

    public void backTrack(String str, int n, List lst){

        if(str.length() == n){
            lst.add(str);
            return;
        }

        for(char ch : new char[]{'a', 'b', 'c'}){
            if(str.isEmpty() || str.charAt(str.length() - 1) != ch){
                backTrack(str + ch, n, lst);
            }
        }
        return;
    }
}
