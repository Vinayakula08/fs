/*
 * Harsha a second class student is playing a game on his tab. 

where he has go to second level. He can reach second level if and only if he solves the first level. 

In the first level he will be a given a number series which will contain only '1' and '0's. 

He has to replace '0' to '1' and '1' to '0' and add '1' at the end and produce a new result. 

If he is able to produce a new result he can reach the second level. Help him to reach the second level. 


Examples:

 "0111" is "1000" and adding 1 at the end we get 1001
 "1100" is  "0011" and adding 1 at the end we get 0100

Here adding will done from the last 
when we add two '1's  we get 10 as the result and 1 is carry forwarded, on continuing the same process we get 0100 as the result 


Sample Test Case - 1
input = 0111
output = 1001

Sample Test Case - 2
input = 1100
output = 0100

 */
package FS;
import java.util.*;
public class Fs_Day_7_Program_1 {
	public static StringBuilder result(StringBuilder s)
    {
        StringBuilder str = new StringBuilder("1");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(0)=='1')
            {
                s.append('0');
                s.deleteCharAt(0);
                continue;
            }
            if(s.charAt(0)=='0')
            {
                s.append('1');
                s.deleteCharAt(0);
                continue;
            }
        }
        int flag = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                flag++;
                s.replace(i,i+1,"0");
                continue;
            }
            if(s.charAt(i)=='0')
            {
                s.replace(i,i+1,"1");
                return s;
            }
        }
        if(flag==s.length())
        {
            str.append(s);
            return str;
        }
        return s;
    }
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        System.out.print(result(s));
    }
}
