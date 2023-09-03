class Solution {
    public void solve(char[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;
        for(int r = 0;r<ROWS;r++){
            for(int c = 0;c<COLS;c++){
                if(board[r][c]=='O'&&((r==0||r==ROWS-1)||(c==0||c==COLS-1))){
                    dfs(board,r,c);
                }
            }
        }
        
        for(int r = 0;r<ROWS;r++){
            for(int c = 0;c<COLS;c++){
                if(board[r][c]=='O'){
                    board[r][c] = 'X';
                }
            }
        }
        
        for(int r = 0;r<ROWS;r++){
            for(int c = 0;c<COLS;c++){
                if(board[r][c]=='T'){
                    board[r][c]='O';
                }
            }
        }
        
    }
    
    public void dfs(char[][] board,int r, int c){
        if(r<0||c<0||r==board.length||c==board[0].length||board[r][c]!='O'){
            return ;
        }
        board[r][c] = 'T';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);
    }
}