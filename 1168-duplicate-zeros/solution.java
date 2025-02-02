class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int n=arr.length;
        int i=n-1;
        int j=n+count-1;
        while(i>=0){
            if(j<n){
                arr[j]=arr[i];
            }
            j--;
            if(arr[i]==0){
                if(j<n){
                arr[j]=0;
                }
                j--;
            }
            i--;
        }

    }
}    
