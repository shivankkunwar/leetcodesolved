class Solution {
       public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        
        
        for(int i = 0 ; i <rows;i++)
        {
            if(board[i][0] == 'O') boundary(board,i,0);
            if(board[i][cols-1] == 'O') boundary(board,i,cols-1);
        }
        
        for(int j = 0 ; j <cols;j++)
        {
            if(board[0][j] == 'O') boundary(board,0,j);
            if(board[rows-1][j] == 'O') boundary(board,rows-1,j);
        }
        for(int i = 0 ; i< rows; i ++)
        {
            for(int j = 0 ; j < cols;j++)
            {
                if(board[i][j] == 'O') 
                {
                    board[i][j] ='X';
                }
                else if(board[i][j] == '*') 
                {
                    board[i][j] = 'O';
                }
            }
        }
        
        
        
    }
    
    
    void boundary(char[][] board , int i,int j )
    {
        if(i>=0 && i< board.length && j >= 0 && j< board[0].length && board[i]             [j] == 'O')
        {
             board[i][j] = '*';
    
            boundary(board,i-1,j);
       
        
            boundary(board,i+1,j);
        
       
            boundary(board,i,j+1);
        
       
            boundary(board,i,j-1);
        
        
        return ;
    }
}
}