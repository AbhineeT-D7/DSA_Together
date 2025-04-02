//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1?page=1
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd = 1;
        int i = a;
        int j = b;
        if(a<b){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        while(b > 1){
            if(a%b == 0){
                gcd=b;
                break;
            }else{
                int temp = a;
                a=b;
                b=temp%b;
            }
        }
        
        int lcm = (i*j)/gcd;
        
        return new int[] {lcm , gcd};
    }    
}
