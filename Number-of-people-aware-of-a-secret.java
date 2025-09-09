// Problem : https://leetcode.com/problems/number-of-people-aware-of-a-secret/?envType=daily-question&envId=2025-09-09

class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int mod = 1_000_000_007;
        long[] dp = new long[n + 2]; // dp[i] = people who learn secret on day i
        long[] share = new long[n + 2]; // Difference array to track sharers

        dp[1] = 1;
        share[1 + delay] = 1; // Start sharing after delay
        share[1 + forget] = (share[1 + forget] - 1 + mod) % mod; // Stop sharing after forget

        long currentSharers = 0;

        for (int day = 2; day <= n; day++) {
            // Update number of current sharers using difference array
            currentSharers = (currentSharers + share[day]) % mod;

            // These are new people learning the secret
            dp[day] = currentSharers;

            // Those people will start sharing after 'delay' and stop after 'forget'
            if (day + delay <= n)
                share[day + delay] = (share[day + delay] + dp[day]) % mod;

            if (day + forget <= n)
                share[day + forget] = (share[day + forget] - dp[day] + mod) % mod;
        }

        // Total people who still remember the secret
        long result = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            result = (result + dp[day]) % mod;
        }

        return (int) result;
    }
}
