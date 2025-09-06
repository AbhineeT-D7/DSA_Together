//https://leetcode.com/problems/power-of-three/
class Solution {
    public boolean isPowerOfThree(int n) { 
        if(n % 2 == 0) return false;
        while(n%3 == 0){
            n/=3;
        }
        if(n==1) return true;
         
        return false;
    
    }
}
