class Solution {
    public int count(int coins[], int sum) {
        // code here.
          Arrays.sort(coins);
        int[] dp = new int[sum + 1];
        dp[0] = 1;  

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[sum];

    }
}