//https://leetcode.com/problems/third-maximum-number/
class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        for(int i = 1 ; i < n ; i++){
            int current = nums[i];
            int j = i - 1 ;
            while(j >= 0 && current < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            
            nums[j+1] = current;
        }
       
        int temp = 0;
        for(int i = n-1 ; i >= 1 ; i--){
            if(nums[i-1] != nums[i]) temp++;

            if(temp == 2) return nums[i-1];
        }

        return nums[n-1];
    }
}
