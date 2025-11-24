// Problem : https://leetcode.com/problems/maximize-expression-of-three-elements/

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int largest =  Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int n : nums){
            if(n > largest){
                sLargest = largest;
                largest = n;
            }else if(n > sLargest){
                sLargest = n;
            }
            smallest = Math.min(smallest , n);
        }

        return largest+sLargest-smallest;
        
    }
}
