// Problem : https://leetcode.com/problems/1-bit-and-2-bit-characters/?envType=daily-question&envId=2025-11-18
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int LastEle = -1;
        for(int i = 0 ; i < bits.length ; ){
            if(bits[i] == 1){
                LastEle = (bits[i]*10) + bits[i+1];
                i+=2;
            }else{
                LastEle = bits[i];
                i++;
            }
        }

        if(LastEle == 0) return true;
        else return false;
    }
}
