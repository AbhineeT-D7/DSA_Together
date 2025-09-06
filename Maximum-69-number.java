//Problem : https://leetcode.com/problems/maximum-69-number/
class Solution {
    public int maximum69Number (int num) {
        int temp = 0;
        int res = num;
        int temp2 = num;
        int[] arr = new int[4];
        
        int k = 3;
        while(temp2>0){
            arr[k] = temp2%10;
            temp2/=10;
            k--;
        }

        for(int i = 0 ; i<4 ; i++){
            if(arr[i] == 6) arr[i] = 9;
            else if(arr[i] == 9) arr[i] = 6;

            for(int j = 0;j<4;j++){
                temp = (temp*10) + arr[j];
            }
            if(temp > res){
                res = temp;
            }

            if(arr[i] == 6) arr[i] = 9;

            else if (arr[i] == 9) arr[i] = 6;
            
            temp = 0;
        }

        return res;
        
    }
}
