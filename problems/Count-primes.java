// Problem : https://leetcode.com/problems/count-primes/

// Good for n < 10^6.

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        int temp = 0;
        if(n <= 1){
            return 0;
        }else{
            for(int i = 2 ; i < n ; i++){
                for(int j = 2 ; j * j <= i ; j++){
                    if(i % j == 0 ){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    temp++;
                }
                count=0;
            }
        }

      
        return temp;
         
    }
}
