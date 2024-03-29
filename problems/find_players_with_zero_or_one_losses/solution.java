class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        Map<Integer, Integer> losers = new HashMap<>();
        for(int[] match : matches){
            losers.put(match[1], losers.getOrDefault(match[1], 0) + 1);
        } 
        for(int[] match : matches){
            if(!losers.containsKey(match[0])){
                winners.add(match[0]);
            }
        }
        List<Integer> winnerList = new ArrayList<>(winners);
        List<Integer> loserList = new ArrayList<>();
        for(int loser : losers.keySet()){
            if(losers.get(loser) == 1){
                loserList.add(loser);
            }
        }
        Collections.sort(winnerList);
        Collections.sort(loserList);
        List<List<Integer>> result = new ArrayList<>();
        result.add(winnerList);
        result.add(loserList);
        return result;
    }
}