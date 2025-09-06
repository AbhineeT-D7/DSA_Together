// Problem : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
class Solution {
    public boolean check(int[] nums) {
        int k = 0;
        int temp = 0;
        int count = 0;
        int n = nums.length;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] < nums[i-1]){
                k = n - i;
                count++;
            }
        }

        if(count == 0) return true;
        else if(count > 1) return false;
        else if(count == 1){
            for(int i = 0; i < k ; i++){
                temp = nums[n-1];
                for(int j = n-1 ; j > 0 ; j--){
                    nums[j] = nums[j-1];
                }
                nums[0] = temp;
            }
        }

        count = 0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] < nums[i-1]){
                count++;
            }
        }

        if(count == 0) return true;
        else  return false;
        
    }

}
