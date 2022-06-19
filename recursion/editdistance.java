import java.util.*;
class Solution{
    public int editDistance(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]= j;
                }
                else if(j==0){
                    dp[i][j] = i;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Solution s = new Solution();
        System.out.println(s.editDistance(s1, s2));
        sc.close();
    }
    
}
