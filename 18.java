// Better Approach : https://leetcode.com/problems/product-of-array-except-self/submissions/1597084350/
// Time Complexity : O(n)  || Space Complexity : O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] pre = new int[n]; //Prefix Array
        int[] suff = new int [n]; //Suffix Array
        pre[0] = 1;
        suff[n-1] = 1;

        for(int i = 1; i < n ; i++){
            pre[i] = pre[i-1]*nums[i-1];
        }
        for(int j = n-2 ; j >= 0 ; j--){
            suff[j] = suff[j+1]*nums[j+1];
        }
        //USING PREFIX ARRAY AS A RESULT ARRAY
        for(int i=0 ; i < n ; i++){
            pre[i] = pre[i]*suff[i];
        }
        return pre;
    }
}

// Optimum Approach : 
// Time Complexity : O(n)  || Space Complexity : O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int[n]; 
        
        res[0] = 1;
        

        for(int i = 1; i < n ; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int temp = 1;
        for(int i = n-1 ; i >= 0 ; i--){
            res[i] *= temp;
            temp = temp * nums[i];
        }
        return res;
    }
}
