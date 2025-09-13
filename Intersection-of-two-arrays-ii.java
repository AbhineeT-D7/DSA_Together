// Problem : https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=problem-list-v2&envId=sorting

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){
            return intersect(nums2 , nums1);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> commEl = new ArrayList<>();

        // Collecting common elements
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                commEl.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else j++;
        }

        int[] result = new int[commEl.size()];
        int k = 0;
        for (int num : commEl) {
            result[k++] = num;
        }

        return result;
    }
}
