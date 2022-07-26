class Solution {
    boolean isPos(char grid[][], int x, int y) {
        for (int i = 0; i < 9; i++) {
            if (i != y && grid[x][i] == grid[x][y]) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != x && grid[i][y] == grid[x][y]) {
                return false;
            }
        }
        int rs = x - x % 3;
        int cs = y - y % 3;
        for (int i = rs; i < rs + 3; i++) {
            for (int j = cs; j < cs + 3; j++) {
                if (i != x && j != y && grid[i][j] == grid[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i  = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                if(board[i][j] != '.' && !isPos(board,i,j)) return false;
            }
        }
        return true;
    }
}