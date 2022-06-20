class Solution {
    public boolean searchMatrix(int[][] matrix, int x) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
	    int j=m-1;
	    while(i>=0&&i<n&&j>=0&&j<m){
	        if(matrix[i][j]==x){
	            return true;
	        }
	        else if(matrix[i][j]>x){
	            j--;
	        }else{
	            i++;
	        }
	    }
	    return false;
    }
}