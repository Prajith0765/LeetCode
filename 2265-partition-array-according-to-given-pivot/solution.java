class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> great = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                less.add(nums[i]);
            } else if(nums[i] == pivot){
                equal.add(nums[i]);
            } else{
                great.add(nums[i]);
            }
        }
        List<Integer> combined = new ArrayList<>();
        combined.addAll(less);
        combined.addAll(equal);
        combined.addAll(great);
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = combined.get(i);
        }
        return result;
    }
}
