class Solution {
    public int longestPalindromeSubseq(String s) {
        // Reverse the input string to find the longest palindromic subsequence
        StringBuilder strb = new StringBuilder(s);
        String str = strb.reverse().toString();

        // Get the lengths of the original and reversed strings
        int n = s.length();
        int m = str.length();

        // Create a 2D array dp to store the dynamic programming results
        int[][] dp = new int[n + 1][m + 1];

        // Base case: Initialize the first row and column to 0
        for (int j = 0; j <= m; j++) dp[0][j] = 0;
        for (int i = 0; i <= n; i++) dp[i][0] = 0;

        // Dynamic Programming: Fill the dp array using the LCS approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == str.charAt(j - 1)) {
                    // If characters match, add 1 to the diagonal value
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // If characters do not match, take the maximum of the top and left values
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Return the length of the longest palindromic subsequence
        return dp[n][m];
    }
}

