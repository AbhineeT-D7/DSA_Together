// Problem : https://leetcode.com/problems/successful-pairs-of-spells-and-potions/?envType=daily-question&envId=2025-10-08

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        // int result[] = new int[spells.length];
        int m = spells.length;
        int n = potions.length;

        for(int i = 0 ; i < m ; i++){
            long required = (success + spells[i] - 1) / spells[i];
            int low = 0 , high = n;
            while(low < high){
                int mid = (low + high) >>> 1; // Much Faster
                // int mid = low + (high-low) / 2; // Little Slow
                if(potions[mid] < required){
                    low = mid+1;
                }else{
                    high = mid;
                }
            }
            spells[i] = n - low;
        }
        return spells;   
    }
}
