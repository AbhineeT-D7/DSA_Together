//Problem:- https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n+m];
        int i = 0;
        int j = 0;
        int curr = 0;
        while(curr < (m+n)){
            if(i < n && j < m){
                if(nums1[i] <= nums2[j]){
                    arr[curr] = nums1[i];
                    i++;
                }else{
                    arr[curr] = nums2[j];
                    j++;
                }
            }else break;
            curr++;
        }
        if(i<n){
            while(i < n){
                arr[curr] = nums1[i];
                i++;
                curr++;
            }
        }
        if(j < m){
            while(j < m){
                arr[curr] = nums2[j];
                j++;
                curr++;
            }
        }

        if((m+n)%2 != 0){
            return arr[(m+n)/2];
        }else{
            double mid = arr[arr.length / 2] + arr[((m+n)/2)-1];
            return mid/2;
        }
    }
}
