/*
Given a mXn matrix print the matrix in the following format.
sort the each matrix elements of diagonal in ascending order.

example:
input =
3
3
9 6 3
8 5 2
7 4 1
output =
1 2 3
4 5 6
7 8 9


input =
3
4
3 3 1 1
2 2 1 2
1 1 1 2
output =
1 1 1 1
1 2 2 2
1 2 3 3

*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] ans = result(a,m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static int[][] result(int[][] mat,int m, int n) {
        
        int[][] ans = new int[m][n];
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                map.putIfAbsent(i-j,new PriorityQueue<Integer>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                ans[i][j]  = map.get(i-j).poll();
            }
        }
        return ans;
    }
}