class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for(int i=0; i<len; i++) {
            if(i == len-1-i)
                sum += mat[i][i];
            else
                sum += mat[i][i] + mat[i][len-1-i];
        }
        return sum;
    }
}