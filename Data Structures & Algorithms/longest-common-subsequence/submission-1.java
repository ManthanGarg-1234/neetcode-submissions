class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        int idx1 = text1.length() - 1;
        int idx2 = text2.length() - 1;
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return lcs(text1, text2, idx1, idx2, dp);
    }
    public int lcs(String text1, String text2, int idx1, int idx2, int[][] dp) {
        // No characters left in either string
        if (idx1 < 0 || idx2 < 0)
            return 0;
        if (text1.charAt(idx1) == text2.charAt(idx2)) {
            return dp[idx1][idx2] = 1 + lcs(text1, text2, idx1 - 1, idx2 - 1, dp);
        }
        if (dp[idx1][idx2] != -1)
            return dp[idx1][idx2];
        return dp[idx1][idx2] = Math.max(
                lcs(text1, text2, idx1 - 1, idx2, dp), lcs(text1, text2, idx1, idx2 - 1, dp));
    }
}
