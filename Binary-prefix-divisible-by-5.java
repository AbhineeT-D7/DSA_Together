// Problem : https://leetcode.com/problems/binary-prefix-divisible-by-5/?envType=daily-question&envId=2025-11-24

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> res = new ArrayList<>();

        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            sum = ((sum * 2) + nums[i]) % 5;
            res.add(sum == 0);
        }

        return res;

    }
}
