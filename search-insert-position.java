//Problem : https://leetcode.com/problems/search-insert-position
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target <= nums[0]) return 0;
        int i = 1;
        while(i < nums.length){
            if(target > nums[i-1]){
                if(target > nums[i]) i++;
                else break;
            }
            else if (target == nums[i-1]) return i-1;
        }
        
        return i;
    }
}
