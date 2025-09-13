// Problem : https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/?envType=daily-question&envId=2025-09-13

// BRUTE_FORCE SOLUTION
class Solution{
    private int countFreq(char ch , String s){
         int count = 0;
         for(int i = 0 ; i < s.length() ; i++){
             if(ch == s.charAt(i)){
                 count++;
             }
         }

         return count;
     }
     public int maxFreqSum(String s) {
         int maxV = 0;
         int maxC = 0;

         for(int i = 0 ; i < s.length() ; i++){
             int count = 0;
             char ch = s.charAt(i);

             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                 maxV = Math.max(countFreq(ch , s) , maxV);
             }else{
                 maxC = Math.max(countFreq(ch , s) , maxC);
             }
         }

         return maxV+maxC;
     }
}


// OPTIMUM SOLUTION

class Solution {
    public int maxFreqSum(String s){
        int maxV = 0;
        int maxC = 0;

        int alphabets[] = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            alphabets[ch - 'a']++;
        }

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxV = Math.max(alphabets[ch - 'a'] , maxV);
            }else{
                maxC = Math.max(alphabets[ch - 'a'] , maxC);
            }
        }

        return maxV+maxC;
    }
}
