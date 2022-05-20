/*
 * Arjun is playing a word game in his tab.When he start the game , It displays a word and he has to check for any two adjacent characters which are same.If found he has to select those two characters by tapping, so that both characters will be deleted from the word and the word size shrinks by 2. This process to be repeated until the word has no two adjacent characters are same.
You task is to help Arjun to perform the above task and Return the final word obtained.



Input Format:
-------------
Line-1: A string represents the word.

Output Format:
--------------
Return a string or empty string.


If empty string print -1

Constraints:
------------   
    1 <= word.length <= 10^5   
    word consists only lower case letters.

Sample Input-1:
---------------
pqqprs

Sample Output-1:
----------------
rs

Explanation:
-------------
Initially , Delete two 'q's then the word will be 'pprs'. Now Delete two 'p's then the word will be rs.

Sample Input-2:
---------------
pqqqprrs

Sample Output-2:
----------------
pqps

Explanation:
-------------
Initially , Delete two 'q's then the word will be 'pqprrs'. Now Delete two 'r's then the word will be pqps.

 */
package FS;
import java.util.*;
public class Fs_Day_6_Program_3 {
	public static StringBuilder result(StringBuilder s)
	{
	    int n = s.length();
		int t =0;
			for(int j=0;j<s.length()-1;j=t)
				if(s.charAt(j)==s.charAt(j+1))
				{
					s.delete(j,j+2);
					t=0;
				}
				else {
					t++;
				}
		
		if(s.length()==0)
		{
		    System.out.print("-1");
		}
		return s;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		System.out.println(result(s));

	}
}
