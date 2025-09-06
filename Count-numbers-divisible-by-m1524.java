// Problem: https://www.geeksforgeeks.org/problems/count-numbers-divisible-by-m1524/1?itm_source=geeksforgeeks
class Solution {
    static int countDivisibles(int A, int B, int M){
        // code here
        int count = 0;
        for(int i = A ; i <= B ; i++){
            if(i % M == 0){
                count++;
            }
        }
        return count;
    }
}
