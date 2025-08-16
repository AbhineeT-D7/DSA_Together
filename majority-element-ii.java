// Problrem : https://leetcode.com/problems/majority-element-ii/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(Integer.MIN_VALUE);
        int count = 0;
        int temp = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(temp == nums[i]){
                count++;
            }
            if(count > (nums.length/3) && temp != arr.get(arr.size()-1)){
                    arr.add(temp);
                }
            if(temp != nums[i]){
                temp = nums[i];
                i--;
                count = 0;
            }
        }
        arr.remove(0);
        return arr;
    }
}
