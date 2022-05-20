/*
 * Given a string S in encoded form, and  an integer array indices[] of string length.

You need to find the decoded form of String S, 
by moving each character at ith position in S, to indices[i] position in decoded string.
and then print the decoded string.

Input Format:
-------------
Line-1 -> A String S, enocded string of length L, 
          S conatins only lowercase alphabets [a-z]
Line-2 -> L space separated integers indices[], where 0 <=indices[i] < L 

Output Format:
--------------
Print a String, decoded string.


Sample Input-1:
---------------
aeilmmor
6 1 5 7 2 0 3 4

Sample Output-1:
----------------
memorial

Explanation:
---------------
Given String, a e i l m m o r
			  6 1 5 7 2 0 3 4
after shifting,	memorial


Sample Input-2:
---------------
aidin
4 3 2 0 1

Sample Output-2:
----------------
india

Explanation-2:
---------------
Given String, a i d i n
			  4 3 2 0 1
after shifting,	india


 */
package FS;
import java.util.*;
public class Fs_Day_12_Program_1 {
	public static StringBuilder result(String s, int[] a)
    {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
           
            str.replace(a[i],a[i]+1,String.valueOf(s.charAt(i)));
        }
        return str;
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print(result(s,a));
    }
}
