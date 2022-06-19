import java.util.*;
class Main
{
    static int result(String s1,int[][] dp, int i, int j){
        if(i>s1.length() || j<0){
            return 0;
        }
        if(i==j) return dp[i][j]=1;
        if(s1.charAt(i)==s1.charAt(j) && i+1==j){
            return dp[i][j]=2;
        } 
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s1.charAt(j)){
            return dp[i][j] = result(s1,dp,i+1,j-1)+2;
        }
        return dp[i][j] = Math.max(result(s1,dp,i+1,j),result(s1,dp,i,j-1));
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int[][] dp = new int[s1.length()][s1.length()];
		for(int[] i : dp){
		    Arrays.fill(i,-1);
		}
		System.out.println(result(s1,dp,0,s1.length()-1));
		for(int[] i : dp){
		    System.out.println(Arrays.toString(i));
		}
        sc.close();
	}
}