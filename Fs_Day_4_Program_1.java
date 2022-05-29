/*Gene and Minne are playing with the words. 
Minne is always sure that his word will be equal to the Genes word, after moving few letters of the Genes word to the end.
Help Minne to solve the problem.

The first line of input contains the Genes word followed by Minne word. 
If it matches print true else print false


Sample Test Case - 1
input = abcde 
eabcd
output = true 


After performing the Genes word abcde-bcdea-cdeab-deabc-eabcd.


Sample Test Case - 2
input = abcdef
fedcba
output = false

Explanation -
After performing the Genes word  abcdef bcdefa cdefab defabc efabcd fabcde 
which doesnt match with the Minne word so the output is false 


*/
package FS;
import java.util.*;
public class Fs_Day_4_Program_1 {
	public static boolean check(StringBuilder s, StringBuilder s1)
    {
        if(s.length()!=s1.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            s.append(s.charAt(0));
            s.deleteCharAt(0);
            String c = s.toString();
            String c1 = s1.toString();
            if(c.equals(c1))
            {
                return true;
            }
            if(i==c.length()-1 && !c.equals(c1))
            {
                return false;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        StringBuilder s1 = new StringBuilder(sc.next());
        System.out.print(check(s,s1));
    }
}
