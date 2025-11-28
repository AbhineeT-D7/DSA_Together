// Problem : https://leetcode.com/problems/reverse-bits/
// Optimized :
class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int bit = n & 1;          
            result = (result << 1) | bit;  
            n >>= 1;                  
        }

        return result;
    }
}

//BruteForce : 

class Solution {
    public int reverseBits(int n) {
        String bits = Integer.toBinaryString(n);
        long res = 0;

        StringBuilder sb = new StringBuilder();
        sb.append(bits);
        if(bits.length() < 32){
            for(int i = 0; i < 32-bits.length(); i++ ){
                sb.insert(0 , '0');
            }
        }

        bits = sb.toString();

        for(int i = bits.length()-1 ; i >= 0 ; i--){
            res = res * 2 + (bits.charAt(i) - '0');
        }

        return (int)res;
        
    }
}
