//方法1，前缀和+贪心，不断维护最小的前缀和，
class Solution {
    public int maxSubArray(int[] nums) {
        int[] s = new int[nums.length+1];
        int min = 0,x=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            s[i+1] = nums[i]+s[i];
            x = Math.max(x,s[i+1]-min);
            min = Math.min(min,s[i+1]);
        }
        return x;
    }
}
//方法二动态规划
class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = nums[0];
        int ans = dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],0)+nums[i];
            ans = Math.max(ans,dp[i]);
        }       
        return ans; 
    }
}
