class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(m,n,0,0,dp);
    }
    public int helper(int m,int n,int i,int j,int[][]dp){
        if(i==(m-1)&&j==(n-1)){
            return 1;
        }
        if(i>=m||j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            return dp[i][j]=helper(m,n,i+1,j,dp)+helper(m,n,i,j+1,dp);
        } 
    }
}