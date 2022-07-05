class Solution {
    public int minDistance(String x, String y) {
        return EditDisM(x,y,x.length(),y.length());
    }
    public static int EditDisM(String s,String s1,int m,int n){
        int [][]storage=new int[m+1][n+1];
        for (int i = 0; i <=n; i++) {
            storage[0][i]=i;
        }
        for (int i = 0; i <=m ; i++) {
            storage[i][0]=i;
        }
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n ; j++) {
                if (s.charAt(i-1)==s1.charAt(j-1)){
                    storage[i][j]=storage[i-1][j-1];
                }
                else {
                    int op1=storage[i-1][j];
                    int op2=storage[i][j-1];
                    int op3=storage[i-1][j-1];
                    storage[i][j]=1+Math.min(op1,Math.min(op2,op3));
                }
            }
        }
        return storage[m][n];
    }
}