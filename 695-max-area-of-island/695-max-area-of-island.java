class Solution {
    
    public int dfs(int i,int j,int m,int n,int[][] mat){
        if(i<0 || j<0 || i>=m || j>=n || mat[i][j]==0){
            return 0;
        }
        mat[i][j]=0;
        return 1+ dfs(i+1,j,m,n,mat) + dfs(i-1,j,m,n,mat) + dfs(i,j+1,m,n,mat)+ dfs(i,j-1,m,n,mat);
    }
    
    public int maxAreaOfIsland(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        int area=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    area= Math.max(area,dfs(i,j,m,n,mat));
                }
            }
        }
        return area;
    }
}