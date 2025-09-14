// Problem : https://leetcode.com/problems/relative-ranks/?envType=problem-list-v2&envId=sorting

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort the indices based on the score values in descending order
        // if score[b] - score[a] > 0, that means score[b] > score[a], and b should come before a — this gives you descending order.
        Arrays.sort(indices, (a, b) -> score[b] - score[a]);


        String res[] = new String[n];

        for(int i = 0 ; i < n ; i++ ){
            int idx = indices[i];
            switch(i){
                case 0 : 
                    res[idx] = "Gold Medal";
                    break;
                case 1 : 
                    res[idx] = "Silver Medal";
                    break;
                case 2 :
                    res[idx] = "Bronze Medal";
                    break;
                default :
                    int pos = i+1;
                    res[idx] = String.valueOf(pos);
                    break;         
            }
        }

        return res;
        
    }
}
