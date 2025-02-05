class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
      
        if (k < 0 || k >= tickets.length) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < tickets.length; ++i) {
            // Case 1: Person k, or each of those in front, will contribute min(tickets[k], tickets[i]) seconds.
            // Case 2: Each behind person k will contribute min(tickets[k] - 1, tickets[i]) seconds.
            // The reason is that we don't care about the extra time for people who want more tickets than person k.
            ans += Math.min(tickets[k] - (i > k ? 1 : 0), tickets[i]);
        }

        return ans;
    }
}
