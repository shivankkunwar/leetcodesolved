class Solution {
    public int minDistance(String word1, String word2) {
        int dec=LCS(word1,word2);
        System.out.println(dec);
        int a=word1.length()-dec;
        int b=word2.length()-dec;
        return a+b;
    }
    public int LCS(String A,String B){
        int a=A.length();
        int b=B.length();
        int [][] arr=new int[a+1][b+1];
     for(int i=0; i<a+1; i++) arr[i][0] = 0;
        for(int j=0; j<b+1; j++) arr[0][j] = 0;
        
        for(int i=1;i<a+1;i++){
            for(int j=1;j<b+1;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    arr[i][j] = 1+arr[i -1][j -1] ;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }

        }
        return arr[a][b];

    }
}