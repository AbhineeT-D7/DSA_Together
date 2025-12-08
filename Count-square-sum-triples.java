// Problem : https://leetcode.com/problems/count-square-sum-triples/?envType=daily-question&envId=2025-12-08
class Solution {
    public int countTriples(int n) {
       
        int count = 0;

        for(double a = 1 ; a <= n ; a++){
            for(double b = a ; b <= n ; b++){
                double newNum = Math.sqrt(a*a + b*b);
                double temp = Math.floor(newNum);
                if(temp == newNum && temp <= n) count++;
            }
        }

        return 2*count;
        
    }
}
