class Solution {
    public int findTheWinner(int n, int k) {
        int[] arr = new int[n];
        int size = n;
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        int index = 0;
        while(n > 1){
            index = (index + k -1) % n; 
            for(int i = index; i < n - 1; i++){
                arr[i] = arr[i+1];
            }
            n--;
        }
        return arr[0];
    }
}
