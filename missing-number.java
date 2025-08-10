//Problem : https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=array
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s1 = 0;
        int s2 = 0;

        for(int i = 0 ; i <= n ; i++){
            s1+=i;
        }

        for(int i = 0 ; i < n ; i++){
            s2+=nums[i];
        }

        return s1-s2;
        
    }
}
