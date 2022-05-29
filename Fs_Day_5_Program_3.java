/*
 * CV Game

Somu is playing a game. The Game Rules are as follows 

A word will be given, where Ramu has to replace the letters of the word with V/C
If the letter is a vowel it will be de denoted by upper case letter ‘V’ and a 
if the letter is a consonant it will be denoted by upper case letter ‘C’. 

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Letters will be only(a-z/A-Z)

input = hello 
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV 
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV 

 */
/*import java.util.*;
class Test{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    printCV(s);
    }
    static void printCV(String s){
        StringBuilder st=new StringBuilder();
        if(isVowel(s.charAt(0)))
            st=st.append("V");
        else
            st=st.append("C");
        for(int i=1;i<s.length();i++)
        {
            s=s.toLowerCase();
            if(isVowel(s.charAt(i)))
            {
               if(st.charAt(st.length()-1)=='C')
                st=st.append('V');
            }
            else
                {
                if(isVowel(s.charAt(i))==false)
                    {
                    if(st.charAt(st.length()-1)=='V')
            	        st.append('C');
                    }
                }
        }
        System.out.println(st);
    }
    static boolean isVowel(char c)
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return true;
            else
                return false;
        }
}
*/
package FS;
import java.util.*;
public class Fs_Day_5_Program_3 {
	 
	public static boolean check(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			return true;
		}
		return false;
	}
	public static StringBuilder result(String s)
	{
		StringBuilder str = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				if(check(s.charAt(i)))
				{
					str.append('V');
				}
				else 
				{
					str.append('C');
				}
			}
			else 
			{
				if(check(s.charAt(i)) && !check(s.charAt(i-1)))
				{
					str.append('V');
				}
				if(check(s.charAt(i)) && check(s.charAt(i-1)))
				{
					continue;
				}
				if(!check(s.charAt(i)) && check(s.charAt(i-1)))
				{
					str.append('C');
				}
				if(!check(s.charAt(i)) && !check(s.charAt(i-1)))
				{
					continue;
				}
			}
		}
		return str;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toLowerCase();
		System.out.println(result(s));
	}
	   
}
