import java.util.*;
class Solution {
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int dp[][] = new int[text1.length()+1][text2.length()+1];
    //     for(int i=0;i<dp.length;i++){
    //         for(int j=0;j<dp[0].length;j++){
    //             if(i==0 || j==0){
    //                 dp[i][j] = 0;
    //             }
    //             else if(text1.charAt(i-1)==text2.charAt(j-1)){
    //                 dp[i][j] = dp[i-1][j-1]+1;
    //             }
    //             else{
    //                 dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
    //             }
    //         }
    //     }
    //     return dp[dp.length-1][dp[0].length-1];
    // }
    public int helper(int[][] dp, String s1,String s2,int i, int j){
        if(i==s1.length() || j==s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j] = 1 + helper(dp,s1,s2,i+1,j+1);
        return dp[i][j] = Math.max(helper(dp,s1,s2,i+1,j),helper(dp,s1,s2,i,j+1));
    }
    public int longestCommonSubsequence(String text1, String text2) {
            int dp[][] = new int[text1.length()][text2.length()];
            for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
            return helper(dp,text1,text2,0,0);
     }
}
public class lcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Solution s = new Solution();
        System.out.println(s.longestCommonSubsequence(s1, s2));
        sc.close();
    }
    
}
