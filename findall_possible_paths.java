import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int[][] a = new int[m][n];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            a[i][j] = sc.nextInt();
	        }
	    }
	    int[][] dp = new int[m][n];
	    for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
	    System.out.println(result(a,0,0,dp));
	    for(int[] i : dp){
	        System.out.println(Arrays.toString(i));
	    }
	}
	static int result(int[][] a, int i, int j, int[][] dp){
	    if(i>=a.length || i<0 || j>=a[0].length || j<0 || a[i][j]==1){
	        return 0;
	    }
	    if(i==a.length-1 && j==a[0].length-1){
	        return 1;
	    }
	    if(dp[i][j]!=-1) return dp[i][j];
	    return dp[i][j] = result(a,i+1,j,dp) + result(a,i,j+1,dp);
	}
}