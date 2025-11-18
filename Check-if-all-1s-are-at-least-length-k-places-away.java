// Problem : https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/?envType=daily-question&envId=2025-11-17
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int pIdx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                if(pIdx != -1){
                    if((i-pIdx-1) < k) return false;
                }
                pIdx = i;
            }    
        }
        
        return true;
        
    }
}
