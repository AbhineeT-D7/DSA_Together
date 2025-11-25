// Problem : https://leetcode.com/problems/smallest-integer-divisible-by-k/?envType=daily-question&envId=2025-11-25

class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0) return -1;
        int n = 0;
        int count = 1;

        for( ; count <= k ; count++){
            n = ((n*10) + 1) % k;
            if(n == 0 || n == k) return count;
        }
        
        return -1;
    }
}
