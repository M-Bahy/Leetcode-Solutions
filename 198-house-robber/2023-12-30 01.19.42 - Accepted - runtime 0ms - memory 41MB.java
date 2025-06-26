class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        int [] dp = new int[size];
        dp[0]=nums[0];
        if(size >1){
            dp[1]= Math.max(nums[1], nums[0]);
        }
        for (int i =2;i<size;i++){
            int take = nums[i] + dp[i-2];
            int leave = dp[i-1];
            dp[i] = Math.max(take, leave);
        }
        return dp[size-1];
    }
}