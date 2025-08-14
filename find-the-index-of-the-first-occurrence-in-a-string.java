// Problem : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ; i <= haystack.length() - needle.length() ; i++){
            int count = 0;
            int k = i;
            for(int j = 0 ; j < needle.length() ; j++){
                if(haystack.charAt(k) == needle.charAt(j)){
                    count++;
                    k++;
                }else{
                    break;
                }
            }
            if(count == needle.length()){
                return i;
            }
        }

        return -1;
        
    }
}
