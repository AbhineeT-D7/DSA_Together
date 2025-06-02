//Problem:https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        int carry = 0;

        sum = digits[digits.length-1] + 1;
        arr.add(sum%10);
        carry=sum/10;

        for(int i = (digits.length-2) ; i >= 0 ; i--){
            sum = digits[i] + carry;
            arr.add(sum%10);
            carry=sum/10;
        }

        if(carry!=0) arr.add(carry);

        int[] finalAns = new int[arr.size()];
        int j = arr.size()-1;
        for(int i = 0 ; i < arr.size() ; i++){
            finalAns[i] = arr.get(j);
            j--;
        }
        return finalAns;
    }
}
