//Problem : https://leetcode.com/problems/count-elements-with-maximum-frequency/?envType=daily-question&envId=2025-09-22

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[100];

        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i]-1]++;
        } 

        int max = Arrays.stream(arr).max().getAsInt();

        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(max == arr[i]) {
                count+=arr[i];
            }
        }

        return count;
    }
}
