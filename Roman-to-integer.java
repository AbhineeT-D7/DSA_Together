// Problem : https://leetcode.com/problems/roman-to-integer/submissions/1786045410/

// 1st Attempt : Self
// T.C. :- 2ms
class Solution {
    public int returnVal(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        char prev = s.charAt(0);
        int num = 0;
        num += returnVal(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++){
            char curr = s.charAt(i);
            num += returnVal(s.charAt(i));
            if(prev == 'I' && (curr == 'V' || curr == 'X')){
                num-=2;
            }
            if(prev == 'X' && (curr == 'L' || curr == 'C')){
                num-=20;
            }
            if(prev == 'C' && (curr == 'D' || curr == 'M')){
                num-=200;
            }
            prev = curr;
        }

        return num;
        
    }
}

// 2nd Attempt : Help to optimise by ChatGPT
// T.C. :- 3ms

class Solution {
    public int returnVal(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        char prev = s.charAt(0);
        int num = 0;
        num += returnVal(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++){
            int curr = returnVal(s.charAt(i));
            if (i > 0 && curr > returnVal(s.charAt(i - 1))) {
                num += curr - 2 * returnVal(s.charAt(i - 1));
            } else {
                num += curr;
            }
        }

        return num;
        
    }
}
