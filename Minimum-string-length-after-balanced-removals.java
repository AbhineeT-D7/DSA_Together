// Problem : https://leetcode.com/problems/minimum-string-length-after-balanced-removals/description/

class Solution {
    public int minLengthAfterRemovals(String s) {
        int i = 0;
        int j = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'a') i++;
            else if(ch == 'b') j++;
        }

        return Math.abs(i-j);
        
    }
}
