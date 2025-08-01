class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = 0;

        for(int i = 1; i < arrays.size(); i++){
            List<Integer> curr = arrays.get(i);

            int localMin = curr.get(0);
            int localMax = curr.get(curr.size() - 1);
            result = Math.max(result, Math.max(globalMax - localMin, localMax - globalMin));

            globalMin = Math.min(localMin, globalMin);
            globalMax = Math.max(localMax, globalMax);
        }

        return result;
    }
}
