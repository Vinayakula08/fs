import java.util.*;
class Main {
    public static int lcs(char[] a, char[] b, int m, int n)
    {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (a[i - 1] == b[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }
    public static int doubleStrings(String S)
    {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<S.length();i++)
        {
        String s1 = S.substring(0,i);
        String s2 = S.substring(i,S.length());
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int m = a.length;
        int n = b.length;
        l.add(lcs(a, b, m, n));
        }
        return Collections.max(l)*2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(doubleStrings(S));
        sc.close();
    }
}