class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[2][prices.length][3];
        for(int[][] row : dp)
            for(int[] row2 : row)
                Arrays.fill(row2,-1);
        return helper(prices,1,0,2,dp);
    }
    public int helper(int prices[],int canBuy,int currDay,int transCount,int dp[][][]){
        if(currDay>=prices.length||transCount==0){
            return 0;
        }
        if(dp[canBuy][currDay][transCount]!=-1){
            return dp[canBuy][currDay][transCount];
        }
        int ans=0;
        if(canBuy==1){
            int idle=helper(prices,canBuy,currDay+1,transCount,dp);
            int buy=-prices[currDay]+helper(prices,canBuy-1,currDay+1,transCount,dp);
            ans=Math.max(idle,buy);
        }else{
            int idle=helper(prices,canBuy,currDay+1,transCount,dp);
            int sell=prices[currDay]+helper(prices,canBuy+1,currDay+1,transCount-1,dp);
            ans=Math.max(idle,sell);
        }
        return dp[canBuy][currDay][transCount]=ans;
    }
}