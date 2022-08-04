class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] votes= new int [n+1];
        int []voted=new int[n+1];
        for( int i=0;i<trust.length;i++){
            votes[trust[i][1]]++;
            voted[trust[i][0]]++;
        }
        for( int i=1;i<=n;i++){
            if(votes[i]==n-1&&voted[i]==0)return i;
        }
        return -1;
    }
}