// Problem : https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int n = s.length();
        int i = n-1;
        int count = 0;

        while( i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        
        return count;
    }
}
