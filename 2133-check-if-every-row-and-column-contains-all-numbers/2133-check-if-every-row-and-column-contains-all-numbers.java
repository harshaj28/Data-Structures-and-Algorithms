class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> map=new HashSet<>();
            HashSet<Integer> map2=new HashSet<>();
            for(int j=0;j<n;j++){
                    map.add(matrix[j][i]);
                    map2.add(matrix[i][j]);
            }
            if(map.size()!=n||map2.size()!=n){
                return false;
            }
        }
        return true;
    }
}