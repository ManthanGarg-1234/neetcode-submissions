class Solution {
    public int maxCoins(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        list.add(1);
        list.add(0, 1);
        int[][] dp = new int[list.size()][list.size()];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return solve(list, 1, list.size() - 2, dp);
    }

    public static int solve(ArrayList<Integer> list, int i, int j, int[][] dp) {
        if (i > j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        int max = Integer.MIN_VALUE;
        for (int ind = i; ind <= j; ind++) {
            int coins = list.get(i - 1) * list.get(ind) * list.get(j + 1)
                    + solve(list, i, ind - 1, dp) + solve(list, ind + 1, j, dp);
            max = Math.max(max, coins);
        }
        return dp[i][j] = max;
    }
}
