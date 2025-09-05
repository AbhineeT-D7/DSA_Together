// Problem : https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while(j > i){
            if(Math.min(height[i] , height[j]) * (j-i) > max){
                max = Math.min(height[i] , height[j]) * (j-i);
            }

            if(height[i] > height[j]){
                j--;
            }else i++;
        }

        return max;
        
    }
}
