// Problem : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1790128506/?envType=problem-list-v2&envId=array

// APPROACH #1 : Brute Force : Using HASHSET
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!set.contains(i+1)){
                arr.add(i+1);
            }
        }

        return arr;
    }

}

// APPROACH #2: Better : Making a boolean array to mark index as read.
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean arr[] = new boolean[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i] - 1] = true;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == false){
                result.add(i+1);
            }
        }

        return result;
        
    }
}



// APPROACH #3 : Optimum : Converting index value to the negative in same array to reduce space complexity 
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    
        for(int i = 0 ; i < nums.length ; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                arr.add(i+1);
            }
        }
        return arr;
    }
}
