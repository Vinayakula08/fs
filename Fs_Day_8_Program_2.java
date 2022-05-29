/*
 * You are given an alphanumeric word W.
You need to find the number of words that can be formed from W.

The words have the following properties:
    - It should be a substring of W of any length, minimum 1.
    - All the letters in the word should be same.


Input Format:
-------------
Single String W.

Output Format:
--------------
Print an integer, the number of words can be formed


Sample Input-1:
---------------
paddy
 
Sample Output-1:
----------------
6

Explanation:
------------
The words are : p, a, d, d, dd, y


Sample Input-2:
---------------
abcde

Sample Output-2:
----------------
5

Explanation:
------------
The words are : a,b,c,d,e


 */
package FS;
import java.util.*;
public class Fs_Day_8_Program_2 {
	public int result(StringBuilder s)
	{
		int count = 1;
		int sum = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                sum = sum + ((count)*(count+1))/2;
                count = 1;
            }
        }
        sum = sum + ((count)*(count+1))/2;
	    return sum;
	}
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        Fs_Day_8_Program_2 m = new Fs_Day_8_Program_2();
        System.out.println(m.result(s));
    }

}
