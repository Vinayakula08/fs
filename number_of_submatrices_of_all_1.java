// Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

// input =3 4
// 0 1 1 1
// 1 1 1 1
// 0 1 1 1
// output =15

// Explanation: 
// There are 10 squares of side 1.
// There are 4 squares of side 2.
// There is  1 square of side 3.
// Total number of squares = 10 + 4 + 1 = 15.


// Example 2:
// input =3 3
// 1 0 1
// 1 1 0
// 1 1 0
// output =7

// Explanation: 
// There are 6 squares of side 1.  
// There is 1 square of side 2. 
// Total number of squares = 6 + 1 = 7.
 

import java.util.*;
class Main{
    static int result(int m, int n, int[][] a){
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(a[i-1][j-1]==1){
                    dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                }
            }
        }
        int count = 0;
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                count += dp[i][j];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(result(m,n,a));
        sc.close();
    }
}