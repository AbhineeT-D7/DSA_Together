// Problem : https://leetcode.com/problems/divide-two-integers/?envType=problem-list-v2&envId=math

// This code gives time complexity of 1ms And if we use "/" operator it becomes 0ms.

/**
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
        }
    return (dividend / devisor);    
**/

class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while (a >= b) {
            long temp = b;
            int multiple = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            result += multiple;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }

        return result;
    }
}
