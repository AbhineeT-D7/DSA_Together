// Problem : https://leetcode.com/problems/majority-element/?envType=problem-list-v2&envId=array
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        

        for(int i = 0 ; i < n/2 ; i++){
            int count = 1;
            for(int  j = i+1 ; j>n ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }

        return nums[(n/2)];
    }
}
