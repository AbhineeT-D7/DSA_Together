// Problem : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/?envType=daily-question&envId=2025-09-07

class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        for(int i = 1 ; i <= n/2 ; i++){
            arr[i-1] = i;
            arr[n-i] = -i;
        }
        
        if(n%2 != 0) arr[n/2] = 0;

        return arr;
    }
}
