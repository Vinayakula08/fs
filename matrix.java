import java.util.*;
class Main {
    static void result(int n, int a[][])

    {
        for (int col = 0; col < n; col++) {
            int j = col, i = 0;
            while (j >= 0 && i < n) {
                System.out.print(a[i][j]+ " ");
                j--;
                i++;
            }
        }
        for (int row = 1; row < n; row++) {
            int i = row, j = n - 1;
            while (i < n && j >= 0) {
                System.out.print(a[i][j]+ " ");
                i++;
                j--;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        result(n,a);
    }
}