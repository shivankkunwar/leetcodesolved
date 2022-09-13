class Solution {
    int [][]dir= new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        Queue<Integer> q= new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        for( int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]==2){
                q.add(i*m+j); 
               } 
            }
        }
        boolean flag=true;
       
        int minutes=0;
        while(!q.isEmpty()){
            
            int sz=q.size();
            minutes++;
            flag=false;
            while(sz-->0){
                
                int curr=q.poll();
                int row=curr/m;
                int col=curr%m;
                for(int i=0;i<dir.length;i++){
                    int r=row+dir[i][0];
                    int c=col+dir[i][1];
                    
                    if(r>=0&&r<n&&c>=0&&c<m&&grid[r][c]==1){
                        grid[r][c]=2;
                        q.add(r*m+c);
                        
                    }
                }
                
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)return -1;
            }
            
        }
       if(flag)return 0;
        return minutes-1;
        
    }
}