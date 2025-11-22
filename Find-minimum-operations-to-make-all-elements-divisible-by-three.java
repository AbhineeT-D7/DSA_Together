// Problem : https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/?envType=daily-question&envId=2025-11-22

class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0;
        for(int n : nums){
            if(n % 3 != 0){
                op++;
            }
        }
        return op;
        
    }
}
