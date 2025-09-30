// Problem : https://leetcode.com/problems/search-in-rotated-sorted-array/?envType=problem-list-v2&envId=array

class Solution {
    private int getIdx(int i , int j , int[] nums , int target){
        int mid = i + (j - i) / 2;
        if(nums[mid] == target) return mid;
        if(mid == i && nums[mid] != target) return -1;

        int val1 = getIdx(i , mid , nums , target);
        if(val1 != -1) return val1;
        else{
            int val2 = getIdx(mid+1 , j , nums , target);
            return val2;        
        }
    }
    public int search(int[] nums, int target) {
        if(nums[0] == target) return 0;
        if(nums[nums.length - 1] == target) return nums.length - 1;

        return getIdx(0 , nums.length - 1 ,nums , target);
    }
}
