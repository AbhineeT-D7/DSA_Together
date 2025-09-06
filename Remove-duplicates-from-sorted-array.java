//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 1;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(nums[0]);
        for( int i = 0 ; i < n - 1;){
           int j = i+1;
            if(nums[i] != nums[j]){
                arr.add(nums[j]);
                k++;    
            }

            i++;
        }

        for(int j = 0 ; j < k ; j++){
            nums[j] = arr.get(j);
        }
        return k;
    }
}
