class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [][] ans= new int [n][m];
        
        int [][] dir= new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        Queue<Integer> q= new LinkedList<>();
        
        for( int i=0;i<n;i++)
        {
            for( int j=0;j<m;j++){
                
                if(mat[i][j]==0){
                        
                        q.add(i*m+j);
                        
                }else{

                ans[i][j]=-1;
                }
            
            }
        }
        int level=0;
        if(q.size()==0)return ans;
        
        while(!q.isEmpty()){
            
            int sz=q.size();
            while(sz-->0){
                int curr=q.poll();
                int row=curr/m;
                int col=curr%m;
                
                for( int i=0;i<dir.length;i++){
                    int r=row+dir[i][0];
                    int c=col+dir[i][1];
                    
                    if(r>=0&&r<n&&c<m&&c>=0&&ans[r][c]==-1){

                        q.add(r*m+c);
                        ans[r][c]=level+1;
                    }
                }
                
                    
            }
            level++;
        }
        
        return ans;
    }
   
}