class Solution {
    public int climbStairs(int n) {
        // if n == 1, [[1]]
        // if n == 2, [[1+1], [2]]
        // if n == 3, [[1+1+1], [1+2], [2+1]]   <- order matters

        // memoization
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return memoize(n, memo);
    }

    private int memoize(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }

        if (n == 1) {
            memo[n] = 1;
        } else if (n == 2) {
            memo[n] = 2;
        } else {
            memo[n] = memoize(n-1, memo) + memoize(n-2, memo);
        }

        return memo[n];
    }

    // LC Solution w/ DP Approach
    // public int climbStairs(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     int[] dp = new int[n + 1];
    //     dp[1] = 1;
    //     dp[2] = 2;
    //     for (int i = 3; i <= n; i++) {
    //         dp[i] = dp[i - 1] + dp[i - 2];
    //     }
    //     return dp[n];
    // }
}