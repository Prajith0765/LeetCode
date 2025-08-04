class Solution {
    public int totalFruit(int[] fruits) {
        int maxLength = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            // Add the current element to the map
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If the map contains more than 2 distinct elements, shrink the window
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
