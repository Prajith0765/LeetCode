class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(int i = 0; i < tasks.length; i++){
            count[tasks[i] - 'A']++;
        }
        Arrays.sort(count);
        int maxfreq = count[25];
        int idle = (maxfreq - 1) * n;
        for(int i = 24; i >= 0; i--){
            idle -= Math.min(maxfreq-1, count[i]);
        }
        idle = Math.max(0, idle);
        int result = tasks.length + idle;
        return result;
    }
}
