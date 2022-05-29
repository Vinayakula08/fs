/*
 * Shyam has given a word from the Dictionary and he has to encode the word by 
only reversing the letters of the word ignoring other letters.

Only the letters(a-z/A-Z)/0-9)has to be encoded not other letters 

Sample Test Case -1

input = a&b*c$rt
output = t&r*c$ba

Explanation - 

From the above test case we have a,b,c,r,t as the alphabets 
and reversing only this characters without disturbing other characters we will have 
t&r*c$ba as the output

Sample Test Case -2

input = a&b$c#d
output = d&c$b#a

 */
import java.util.*;
public class Fs_Day_2_Program_3 {
public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		StringBuilder str = new StringBuilder();
		StringBuilder str1 = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			int x = (int)s.charAt(i);
			if((x>=65 && x<=90) || (x>=97 && x<=122) )
			{
				str.append(s.charAt(i));
			}
		}
		int n = str.length();
		for(int i=0;i<s.length();i++)
		{
			int x = (int)s.charAt(i);
			if((x>=65 && x<=90) || (x>=97 && x<=122) )
			{
				str1.append(str.charAt(n-1));
				n--;
				
			}
			else 
			{
				str1.append(s.charAt(i));	
			}
		}
		System.out.print(str1);
		sc.close();
	
	}
}
