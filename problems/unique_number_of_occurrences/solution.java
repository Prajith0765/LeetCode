class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        HashMap<Integer,Integer> unique = new HashMap<>();

        for(int v:arr){
            count.put(v,count.getOrDefault(v,0)+1);
        }

        for(int v : count.values()){
            if(unique.containsKey(v))
                return false;
            unique.put(v,1);
        }

        return true;
    }
}