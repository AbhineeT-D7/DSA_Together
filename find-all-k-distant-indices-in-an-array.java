// Problem:- https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/?envType=daily-question&envId=2025-06-24
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int temp = 0 ; temp < nums.length; temp++){
            if(nums[temp] == key){
                for(int i = arr.size() ; i < nums.length ; i++){
                    if(Math.abs(i-temp) <= k){
                        arr.add(i);
                    }
                }
            }
        }

        for(int i  = 0 ; i < arr.size()-1 ; i++){
            if(arr.get(i) == arr.get(i+1)){
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }
}
