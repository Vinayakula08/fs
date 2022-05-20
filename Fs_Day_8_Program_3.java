/*
 * There is a board with M*N size. 
The board contains M*N blocks of 1*1 size.
Each block is printed a number on it.

You will be given a number, your task is to find whether the number is printed on 
any of the blocks or not. If found print yes, otherwise print no.

NOTE: 
- The numbers printed on the board in each row are in increasing order. 
- Next row starting number is greater than the last number of the previous row.

Constarint:
-----------
Can you solve it in log(M)+ log(N) time. 


Input Format:
-------------
Line-1 -> Two integers M and N, board size.
Next M lines -> N space separated integers.
Last Line -> An integer T, number to search.

Output Format:
--------------
Print a boolean value, 'yes' if number found.
otherwise, 'no'.


Sample Input-1:
---------------
4 4
1 3 6 10
12 15 19 23
24 28 32 36
37 41 44 47
15

Sample Output-1:
----------------
yes


Sample Input-2:
---------------
4 4
1 3 6 10
12 15 19 23
24 28 32 36
37 41 44 47
26

Sample Output-2:
----------------
no


 */
package FS;
import java.util.*;
import java.lang.*;
public class Fs_Day_8_Program_3 {
	Fs_Day_8_Program_3(int n, int m, int[][] a, int x, ArrayList<Integer> l)
    {
        if(l.contains(x))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
                l.add(a[i][j]);
            }
        }
        int x = sc.nextInt();
        Fs_Day_8_Program_3 s = new Fs_Day_8_Program_3(n,m,a,x,l);
    }
	
}
