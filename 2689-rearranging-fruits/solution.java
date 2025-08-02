public class Solution 
{
    public long minCost(int[] basket1, int[] basket2) 
    {
        int n = basket1.length;
        HashMap<Integer, Integer> count = new HashMap<>();
        int globalMin = Integer.MAX_VALUE;

        // Step 1: Count items and track global min
        for (int x : basket1) 
        {
            count.merge(x, 1, Integer::sum);
            globalMin = Math.min(globalMin, x);
        }

        for (int x : basket2) 
        {
            count.merge(x, -1, Integer::sum);
            globalMin = Math.min(globalMin, x);
        }

        long total = 0;

        // Step 2: Check if balancing is possible
        for (int v : count.values()) 
        {
            if ((v & 1) != 0)
            {
                return -1; // odd count? not possible
            } 
            total += Math.abs(v);
        }

        // Step 3: Build swap list
        int m = (int)(total / 2);
        int[] im = new int[m];
        int idx = 0;
        for (Map.Entry<Integer, Integer> e : count.entrySet()) 
        {
            int num = e.getKey();
            int v = e.getValue() / 2;
            for (int i = 0; i < Math.abs(v); i++) 
            {
                im[idx++] = num;
            }
        }

        // Step 4: Sort swap list
        Arrays.sort(im);

        // Step 5: Greedily choose cheapest swaps
        long ans = 0;
        long doubleMin = 2L * globalMin;
        for (int i = 0; i < m / 2; i++) 
        {
            ans += Math.min(im[i], doubleMin);
        }

        // Step 6: Return result
        return ans;
    }
}
