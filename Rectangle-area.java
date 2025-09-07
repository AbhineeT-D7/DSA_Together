// Problem : https://leetcode.com/problems/rectangle-area/

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int l1 = ax2-ax1;
        int b1 = ay2-ay1;

        int l2 = bx2-bx1;
        int b2 = by2-by1;

        int totalArea = l1*b1 + l2*b2;
        int repArea = 0;

        // Finding Intersection points
        // Left-Bottom corner
        int leftInter = Math.max(ax1 , bx1);
        int lowInter = Math.max(ay1 , by1);
        // Right-Top corner 
        int rightInter = Math.min(ax2 , bx2);
        int topInter = Math.min(ay2 , by2);

        // Checking for intersection
        if(leftInter < rightInter && lowInter < topInter){
            repArea = (rightInter - leftInter) * (topInter - lowInter);
        }

        return totalArea - repArea;   
    }
}
