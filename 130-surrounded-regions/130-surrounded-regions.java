class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        Queue<Integer> q= new LinkedList<>();
         for( int i=0;i<m;i++){
            if(board[i][0]=='O')q.add(i*n);
            if(board[i][n-1]=='O')q.add(i*n+(n-1));
        }
        for( int i=0;i<n;i++){
            if(board[0][i]=='O')q.add(i);
            if(board[m-1][i]=='O')q.add((m-1)*n+(i));
        }
        int[][] dir=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
            int curr=q.poll();
            
            int row=curr/n;
            int column=curr%n;
            board[row][column]='B';
            for( int i=0;i<dir.length;i++){
                int nr=row+dir[i][0];
                int nc=column+dir[i][1];
                if(nr>=0&&nr<m&&nc>=0&&nc<n&&board[nr][nc]=='O'&&board[nr][nc]!='B'){
                    q.add(nr*n+nc);
                    board[nr][nc]='B';
                }
            }
            }
          
        }
        
        for( int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='B')board[i][j]='O';
            }
        }
       
    }
}