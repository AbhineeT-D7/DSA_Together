// Problem : https://leetcode.com/problems/binary-search/
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        if(target == nums[n/2]){
            return n/2;
        }
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
        
    }
}
