class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<Integer> q=new LinkedList<>();
        int ans[][]= new int [n][m];
        for(int i=0;i<n;i++ )
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    
                    q.add(i*m+j);
                    ans[i][j]=0;
                }else{
                    ans[i][j]=-1;
                }
            }
        int level=0;
        int [][]dir= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        
        while(!q.isEmpty()){
            
            int sz=q.size();
            
            while(sz-- >0){
                
                int curr=q.poll();
                int r=curr/m;
                int c=curr%m;
                
                for(int k=0;k<dir.length;k++){
                    int nr=r+dir[k][0];
                    int nc=c+dir[k][1];
                    
                    if(nr>=0 && nc>=0 && nc<m && nr<n&&ans[nr][nc]==-1){
                            q.add(nr*m+nc);
                            ans[nr][nc]=level+1;
                    }
                    
                    
                    
                    
                }
                
            }
            
           level++; 
        }
        return ans;
    }
   
}