// problem : https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty()) return 0;
        int i = 0;
        int n = s.length();
        int sign = 1;
        long val = 0;

        while(i < n && s.charAt(i) == ' ') i++;
        if(i == n) return 0;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+') i++;
        
        while(i < n && Character.isDigit(s.charAt(i))){
            val = val*10 + (s.charAt(i) - '0');
            if(sign == 1 && val > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && (val*sign) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign*val);

    }
}
