// Problem : https://leetcode.com/problems/set-intersection-size-at-least-two/?envType=daily-question&envId=2025-11-20

// #Brute Force
class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < intervals.length ; i++){
            int count = 0;
            for(int j :set){
                if(j >= intervals[i][0] && j <= intervals[i][1])
                    count++;
            }

            if(count < 1){
                set.add(intervals[i][1] - 1);
                set.add(intervals[i][1]);
            }
            else if(count == 1){
                if(set.contains(intervals[i][1])){
                    set.add(intervals[i][1] - 1);
                }
                set.add(intervals[i][1]);
            }   
        }

        return set.size();
    }
}
