// Problem : https://leetcode.com/problems/rotate-array/
class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int n = nums.length;
        int[] temp = new int[k];
        int[] temp2 = new int[n-k];
        int j = 0;
        for(int i = n-k ; i < nums.length ; i++){
            
            temp[j] = nums[i];
            j++;
        }
    
        for(int i = 0 ; i < n-k ; i++){
            temp2[i] = nums[i];
        }
        j = 0;
        for(int i = 0 ; i < n ; i++){
            if(i < k) nums[i] = temp[i];
            else {
                nums[i] = temp2[j];
                j++;
            }
        }
        
    }
}
