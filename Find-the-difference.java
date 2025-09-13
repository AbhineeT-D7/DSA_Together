// Problem : https://leetcode.com/problems/find-the-difference/?envType=problem-list-v2&envId=sorting

class Solution {
    private int sum(String s , int i){
        if(i == s.length()) return 0;
        return s.charAt(i) + sum(s , i+1);
    }
    public char findTheDifference(String s, String t) {

        int sumOfs = sum(s , 0);
        int sumOft = sum(t , 0);

        return (char)(sumOft - sumOfs);
    }
}
