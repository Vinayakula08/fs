/*import java.util.*;
class Main{
    public static int min(int a, int b, int c)
    {
        if(a<b && a<c)
        {
            return a;
        }
        else if(b<c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static void result(int n, int [][]a, int [][]dp)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j!=0 && j!=n-1)
                {
                    dp[i][j] = a[i][j] + min(dp[i-1][j-1],dp[i-1][j],dp[i-1][j+1]);
                }
                if(j==0)
                {
                    dp[i][j] = a[i][j] + min(Integer.MAX_VALUE,dp[i-1][j],dp[i-1][j+1]);
                }
                if(j==n-1)
                {
                    dp[i][j] = a[i][j] + min(dp[i-1][j-1],dp[i-1][j],Integer.MAX_VALUE);
                }
            }
        }
        int min = dp[n-1][0];
        for(int i=n-1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(min>dp[i][j])
                {
                    min = dp[i][j];
                }
            }
        }
        System.out.print(min);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        int [][]dp = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
                if(i==0)
                {
                    dp[i][j] = a[i][j];
                }
            }
        }
        result(n,a,dp);
    }
}*/
import java.util.*;
class Main{
    public static int max(int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b;
        else
            return c;
    }
    public static int result(int m, int n, int[][] a,int[][] dp)
    {
        for(int j=1;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                if(i==0)
                    dp[i][j] = a[i][j] + Math.max(dp[i][j-1],dp[i+1][j-1]);
                if(i==m-1)
                    dp[i][j] = a[i][j] + Math.max(dp[i][j-1],dp[i-1][j-1]);
                if(i>0 && i<m-1)
                    dp[i][j] = a[i][j] + max(dp[i][j-1],dp[i-1][j-1],dp[i+1][j-1]);
            }
        }
        int max = dp[0][n-1];
        for(int i=1;i<n;i++)
            max = Math.max(max,dp[i][n-1]);
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
                if(j==0) dp[i][j] = a[i][j];
            }
        }
        System.out.println(result(m,n,a,dp));
        sc.close();
    }
}