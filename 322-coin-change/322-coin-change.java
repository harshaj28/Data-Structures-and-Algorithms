class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            for (int j=0;j<amount+1;j++){
                dp[i][j]=-1;
            }
        }
        int ans=helper(amount,coins,0,new HashMap<>(),dp);
        
        if(ans==10001){
            return -1;
        }
        return ans;
    }
    public int helper(int amount,int[]coins,int ci,HashMap<String,Integer> map,int[][]dp){
        if(amount==0){
            return 0;
        }
        if(ci==coins.length){
            return 10001;
        }
        // String currKey=Integer.toString(amount)+"-"+Integer.toString(ci);
        // if(map.containsKey(currKey)){
        //     return map.get(currKey);
        // }
        
        if(dp[ci][amount]!=-1){
            return dp[ci][amount];
        }
        int curAmount=coins[ci];
        int take=10001;
        if(curAmount<=amount){
            take=1+helper(amount-curAmount,coins,ci,map,dp);
        }
        int notTake=helper(amount,coins,ci+1,map,dp);
        // map.put(currKey,Math.min(take,notTake));
        dp[ci][amount]=Math.min(take,notTake);
        return Math.min(take,notTake);
    }
}