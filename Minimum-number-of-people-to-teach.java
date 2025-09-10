// Problem : https://leetcode.com/problems/minimum-number-of-people-to-teach/?envType=daily-question&envId=2025-09-10

public class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        // Step 1: Convert languages of each user to a Set for fast lookup
        List<HashSet<Integer>> userLanguages = new ArrayList<>();
        for (int i = 0; i < languages.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < languages[i].length; j++) {
                set.add(languages[i][j]);
            }
            userLanguages.add(set);
        }

        // Step 2: Find all users who can't communicate with their friends
        HashSet<Integer> needToTeach = new HashSet<>();

        for (int i = 0; i < friendships.length; i++) {
            int u = friendships[i][0] - 1;  // user index (0-based)
            int v = friendships[i][1] - 1;

            boolean canTalk = false;

            // Check if user u and v share a language
            for (int lang : userLanguages.get(u)) {
                if (userLanguages.get(v).contains(lang)) {
                    canTalk = true;
                    break;
                }
            }

            // If they can't talk, add both users to the set
            if (!canTalk) {
                needToTeach.add(u);
                needToTeach.add(v);
            }
        }

        // Step 3: Count how many users in needToTeach know each language
        int[] languageCount = new int[n + 1];  // index 1 to n

        for (int user : needToTeach) {
            for (int lang : userLanguages.get(user)) {
                languageCount[lang]++;
            }
        }

        // Step 4: Find the language that is already known by most of these users
        int maxKnown = 0;
        for (int i = 1; i <= n; i++) {
            if (languageCount[i] > maxKnown) {
                maxKnown = languageCount[i];
            }
        }

        /* Step 5: Minimum people to teach = total in needToTeach - those who already 
        know best language*/
        return needToTeach.size() - maxKnown;
    }
}
