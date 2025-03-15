class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        for (var i : nums)
            list.add(Integer.toString(i));

        Collections.sort(list, (a, b) -> (a + b).compareTo(b + a));
        StringBuilder sb = new StringBuilder();

        for (int i = list.size() - 1; i >= 0; i--)
            sb.append(list.get(i));

        if (sb.charAt(0) == '0')
            return "0";

        return sb.toString();
    }
}
