import java.util.*;
class Main {
    static final int MAX = 100;
    static int result(int a[][],int m, int n)
    {
        int dp[][] = new int[m][n];
        for(int[] rows:dp)
        {
            Arrays.fill(rows, 0);
        }
        for (int j = n-1; j >= 0; j--)
        {

            for (int i = 0; i < m; i++)
            {
                int r = (j == n-1) ? 0 : dp[i][j+1];
                int ru = (i == 0 || j == n-1) ? 0 : dp[i-1][j+1];
                int rd = (i == m-1 || j == n-1) ? 0 : dp[i+1][j+1];
                dp[i][j] = a[i][j] + Math.max(r, Math.max(ru, rd));                                   
            }
        }
        int res = dp[0][0];
        for (int i = 1; i < m; i++)
        {
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print(result(a, m, n));
        sc.close();
    }
}