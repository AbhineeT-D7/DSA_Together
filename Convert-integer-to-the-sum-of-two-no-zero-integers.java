// Problem : https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/?envType=daily-question&envId=2025-09-08

class Solution {
    private boolean containsZero(int temp2){
        while(temp2 > 0){
            if(temp2 % 10 == 0){
                return false;
            }
            temp2/=10;
        } 
        return true;   
    }
  
    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        for(int i = 1 ; i < n ; i++){
            if(containsZero(i) && containsZero(n-i)){
                arr[0] = i;
                arr[1] = n - i;
                break;
            }
        }
        return arr;
    }
}
