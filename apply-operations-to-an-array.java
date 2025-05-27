//Problem : https://leetcode.com/problems/apply-operations-to-an-array/?envType=daily-question&envId=2025-03-01
class Solution {
    public int[] applyOperations(int[] nums) {
        int temp[] = new int[nums.length];
        int index = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                temp[index++] = nums[i];
            }
        }
        return temp;
        
    }
}
