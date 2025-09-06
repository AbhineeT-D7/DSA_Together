//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
 class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        int r = 0; //Repeating no.
        int m = 0; //Missing no.
        int temp = 0;
        int n = arr.length;
        
        int[] hs = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            temp = arr[i] ; 
            if(hs[temp-1] == temp){
                r = temp;
            }else{
                hs[temp-1] = temp;
            }
            
        }
        
        for(int i = 0 ; i < n ; i++){
            if(hs[i] == 0){
                m = i+1;
            }
        }
        
        
        ar.add(0 , r);
        ar.add(1 , m);
        
        return ar;
    }
}
