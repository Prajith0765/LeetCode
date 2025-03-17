class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(int[] nums, List<Integer> curr, List<List<Integer>> result){

        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int num : nums){
            if(curr.contains(num)){
                continue;
            }
            curr.add(num);
            backTrack(nums, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
