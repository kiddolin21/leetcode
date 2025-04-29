public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            if(!isValidBlock(board,i,i,0,8)) return false;
            if(!isValidBlock(board,0,8,i,i)) return false;
        }
        for(int i = 0;i<9;i+=3)
            for(int j = 0;j<9;j+=3)
                if(!isValidBlock(board,j,j+2,i,i+2)) return false;
        return true;
    }
    
    public boolean isValidBlock(char[][] board,int rs,int re,int cs,int ce) {
        int a[] = new int[10];
        for(int i = rs;i<=re;i++)
            for(int j = cs;j<=ce;j++) {
                if(board[i][j]!='.'){
                    if(a[board[i][j]-'0']==1) return false;
                    else a[board[i][j]-'0']=1;
                }
            }
        return true;
    }
}
