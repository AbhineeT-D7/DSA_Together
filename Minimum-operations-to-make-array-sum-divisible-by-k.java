// Problem : https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/submissions/1842442053/?envType=daily-question&envId=2025-11-29

class Solution {
    public int minOperations(int[] nums, int k) {

        int sum = 0;
        for(int n : nums){
            sum+=n;
        }

        return sum%k;
        
    }
}
