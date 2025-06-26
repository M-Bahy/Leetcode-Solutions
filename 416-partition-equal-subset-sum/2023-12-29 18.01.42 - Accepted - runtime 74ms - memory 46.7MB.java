class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int number : nums) sum += number;
        if(sum%2 != 0) return false;
        return subsetSum(nums,sum/2);

    }
    private boolean subsetSum(int[] nums, int target) {
    int n = nums.length;
    boolean[][] dp = new boolean[n + 1][target + 1];

    // Initialize the first column as true (empty subset is always possible)
    for (int i = 0; i <= n; i++) {
        dp[i][0] = true;
    }

    // Fill the dp array
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= target; j++) {
            if (nums[i - 1] <= j) {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    return dp[n][target];
}
}