/*
 * Shyam a clever boy, is good in analyzing the words given to him. 
He figures out the speciality of the word in any way. 
Given a word to Shyam, he determines few characters(consecutive) or whole word to be same from left to right and from right to left. 
Print the word which match the above pattern which has the maximum characters in it.
He considers the words which matches the above pattern, has a minimum length of 2. 

If no such word exists print -1

Now Check Shyam is correct or not by writing a code for him. 


for example:
input =abbbabbcbbacdb
output =abbcbba

input=hello
output=ll

input = abcd
output=-1
 */
package FS;
import java.util.*;
public class Fs_Day_9_Program_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder str = new StringBuilder("0");
		StringBuilder str1 = new StringBuilder("-1");
		int max = 0;
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i;j<s.length();j++)
			{
				str.delete(0, str.length());
				str.append(s.substring(i,j+1));
				if(max<str.length() && str.length()>1 && (str.toString().equals(str.reverse().toString())))
				{
					max = str.length();
					str1.delete(0, str.length());
					str1.append(str);
				}
			}
		}
		System.out.println(str1);
	}
}
