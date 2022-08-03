class Solution {
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (dfs(board, arr, i, j, 0)) return true;
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int idx) {
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word[idx]||board[i][j]=='0'){
            return false;
        }
        if(idx==word.length-1){
            return true;
        }
        
        char temp=board[i][j];
        board[i][j]='0';
        boolean ans=dfs(board,word,i+1,j,idx+1)|| dfs(board,word,i-1,j,idx+1)||dfs(board,word,i,j+1,idx+1)||dfs(board,word,i,j-1,idx+1);
        board[i][j]=temp;
        return ans;
    }
}