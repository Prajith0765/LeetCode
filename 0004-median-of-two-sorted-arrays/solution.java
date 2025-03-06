class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        for(int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
        }
        for(int i = 0 ; i < nums2.length; i++){
            arr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(arr);
        double result;
        if (n % 2 != 0) {
            result = arr[n / 2];
        } else {
            result = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
        return result;
    }
}
