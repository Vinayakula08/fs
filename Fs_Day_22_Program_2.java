/*

Ramu is given an array of numbers now he has to check for a super square matrix in the given array.

A super square matrix is a matrix such that every row sum, every column sum, and both
diagonal sums are all equal. 

The integers in the magic square do not have to be distinct. 
Every 1 x 1 a is trivially a super square matrix 

Given an m x n integer a , return the k (i.e., the side length k ) of the largest super square matrix that can be found
within this a.



Example 1:

Input = 
4 5
7 1 4 5 6
2 5 1 6 4
1 5 4 3 2
1 2 7 3 4
Output: 3

Explanation: 

From the above array we have the following super square matrix of k 3 
5 1 6 
5 4 3
2 7 3 



The largest super square matrix has a k of 3.
Every row sum, column sum, and diagonal sum of this magic square is equal to 12.
- Row sums: 5+1+6 = 5+4+3 = 2+7+3 = 12
- Column sums: 5+5+2 = 1+4+7 = 6+3+3 = 12
- Diagonal sums: 5+4+3 = 6+4+2 = 12


*/
/*
***************



Check this link for answer



https://www.geeksforgeeks.org/largest-square-sub-matrix-with-equal-row-column-and-diagonal-sum/





**************




*/

import java.util.*;
import java.lang.*;
class Main{
    public static int[][] rsum = new int[50][51];
    public static int[][] csum = new int[51][50];
    public static boolean check(int r, int c, int k, int[][] a) {
        int r_end = r + k, c_end = c + k;
        int sum = 0;
        for (int i = r, j = c; i < r_end; i++, j++) {
            sum += a[i][j];
        }
        for (int i = r; i < r_end; i++) {
            if (rsum[i][c_end] - rsum[i][c] != sum) {
                return false;
            }
        }
        for (int i = c; i < c_end; i++) {
            if (csum[r_end][i] - csum[r][i] != sum) {
                return false;
            }
        }
        int ad_sum = 0;
        for (int i = r, j = c_end - 1; i < r_end; i++, j--) {
            ad_sum += a[i][j];
        }
        return ad_sum == sum;
    }
    static int result(int n, int m, int[][] a)
    {
        int x = Math.min(n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                rsum[i][j] = rsum[i][j - 1] + a[i][j - 1];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                csum[i][j] = csum[i - 1][j] + a[i - 1][j];
            }
        }
        for (int k = x; k > 1; k--) {
            for (int i = 0; i <= n - k; i++) {
                for (int j = 0; j <= m - k; j++) {
                    if (check(i, j, k, a)) {
                        return k;
                    }
                }
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print(result(n,m,a));
    }
}