class Solution {
    public int findJudge(int n, int[][] trust) {
       int[] trusted=new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            trusted[trust[i][1]]++;
        }
        for(int i=1;i<n+1;i++)
        {
            if(trusted[i]==n-1)
            {
                boolean check=true;
                for(int j=0;j<trust.length;j++)
                {
                    if(trust[j][0]==i)check=false;
                }
                if(check)return i;
            }
        }
        return -1;
    }
}