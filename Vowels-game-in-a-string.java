// Problem :https://leetcode.com/problems/vowels-game-in-a-string/description/?envType=daily-question&envId=2025-09-12

// Brute Force Approach
class Solution {
    public boolean doesAliceWin(String s) {
        int count = 0;

        for(char ch : s.toCharArray()){
            if("aeiou".indexOf(ch) != -1) count++;
        }
        
        if(count < 1) return false;
        
        return true;
    }
}

// Better approach
class Solution {
    public boolean doesAliceWin(String s) {

        for(int i  = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        }
        
        return false;
    }
}
