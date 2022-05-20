/*
 * Mr. Bob is a Military Encoders. 
Mr. Bob writes a word as shown below and then merges them. 
Help Bob to write the code. 

Mr. Bob will be given a word 'w' and a number 'n' 

Sample Test Case - 1
input = 
ABCDE
2
output = ACEBD


This is How Bob writes the letters of the word 
A    C    E
   B    D

Now concatenate the two rows and ignore spaces in every row. We get ACEBD


Sample Test Case - 2
input = system
3
output = seytms


s         e
  y    t    m
     s

Now concatenate the 3 rows we get seytms
 */
package FS;
import java.util.*;
public class Fs_Day_4_Program_2 {
	static StringBuilder result(String str,int n)
    {
        StringBuilder str1 = new StringBuilder();
        int r = 2*(n-1)-1;
        int t = r;
        int t1 = 1;
        if(n==1)
        {
        	StringBuilder str5 = new StringBuilder(str);
        	return str5;
        }
        for(int j =0; j<=r; j++)
        {
        	if(str1.length()==str.length())
        	{
        		break;
        	}
        	int k = 0;
            for(int i=j; i<str.length(); i++)
            {
            	k++;
            	if(j==0) 
            	{
	               str1.append(str.charAt(i));
	               i = i+t;
            	}
            	else if(t==-1)
            	{
	               str1.append(str.charAt(i));
	               i = i+t1;
            	}
            	
	            else 
	            {
	            	if(k%2!=0)
	            	{
	            	   str1.append(str.charAt(i));
		               i = i+t;
	            	}
	            	else 
	            	{
	                 	str1.append(str.charAt(i));
			            i = i+t1;
					}
				}
            }
            t = t-2;           
            if(j!=0)
            {
            	t1 = t1+2;    	
            }
        }
        return str1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(result(s,n));
    }
}