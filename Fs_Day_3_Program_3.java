/*
 * Scoops an 2nd class boy is doing a maths assignment given by his teacher.
Scoops is very poor at maths. 

When given an expression he will evaluate the expression from the start to the end. 

Help Scoops to solve the problem. He assumes the +,-,*,/ has the equal priority. 

Sample Test Case - 1
input = 2+5*2
output = 14

Explanation - The expression when evaluated from start to end
we have 2+5 which is 7 and when 7 is multiplied with 2 we have 14 as the output 

Sample Test Case - 2
input = 2+3*6
output = 30

Explanation :- The sum of 2+3 is 5 and 5*6 = 30 

Sample Test Case - 3
input = 5+7-9+0*0+1
output = 1

Explanation :- The sum of 5+7 is 12 
12-9 is 3 and 3+0 is 3, 3*0 is 0 and 0+1 is 1 

Sample Test Case - 4
input = -1+-1*2
output = -4

Explanation :-
-1 + -1 is -2 
and -2 * 2 is -4
 */
package FS;
/*
import java.util.*;
public class Fs_Day_3_Program_3 {
	public static int check(char c,String string,int sum)
    {
        //System.out.print(str);
        int s;
        if(c =='+')
        {
            //int s=0;
            s = sum + Integer.parseInt(string.toString());
            return s;
        }
        if(c =='*')
        {
            //int s = 1;
            s = sum * Integer.parseInt(string.toString());
            return s;
        }
        if(c =='/')
        {
            //int s = 1;
            s = sum / Integer.parseInt(string.toString());
            return s;
        }
        if(c =='-')
        {
            //int s = 1;
            s = sum - Integer.parseInt(string.toString());
            return s;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int flag = 0;
        int sum = 0;
        int t;
        for(int i=0;i<s.length();i++)
        {
            
            if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=58)
            {
                str2.append(s.charAt(i));
            }
                       
            else
            {            	
            	break;	
            }
        }
        for(int i=0;i<s.length();i++)
        {
            
            if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=58)
            {
                str.append(s.charAt(i));
            }
                       
            else
            {            	
            	str1.append(i);
            	//System.out.println(str1);
            	//str1.append('&');
            	str1.append(s.charAt(i));	
            }
        }
        int a[] = new int[str1.length()/2];
        sum = sum + Integer.parseInt(str2.toString());
        int q = 0;
        for(int i = 0; i<s.length();i++)
        {
        	if(!(Character.isDigit(s.charAt(i))))
        	{
        		
        		 //sum = sum + check(str1.charAt(i+1), str.substring(i+2, ), sum) ;
        		a[q++] = i;
        		
        	}
        	
        }
        int k =0;
        for(int i = 0; i<str1.length();i++)
        {
        	if(!(Character.isDigit(s.charAt(i))))
        	{
        		 sum = sum + check(str1.charAt(i), str.substring(a[k]+1,a[k+1]-1 ), sum) ;
        		
        		
        	}
        	
        }
        
        
        System.out.println(sum);
        
    }
}*/
/*import java.util.Scanner;

public class Main {
	public static int value(char c)
	{
	    return (int)(c - '0');	     
	}
	public static int result(String s)
	{
	    int res;
	    if(Character.isDigit(s.charAt(0)))
	    {
	        res = value(s.charAt(0));
	        for (int i = 1; i<s.length(); i = i+2)
	           {
        	        char c = s.charAt(i);
        	        char c1 = s.charAt(i+1);
        	        if (c == '+') 
        	        	res = res + value(c1);
        	        else if (c == '-') 
        	        	res = res - value(c1);
        	        else if (c == '*') 
        	        	res = res * value(c1);
        	        else if (c == '/') 
        	        	res = res / value(c1);

	            } 
	    }
	    else
	    {
	        res = 0;
	        for (int i = 0; i<s.length(); i = i+2)
	           {
        	        char c = s.charAt(i);
        	        char c1 = s.charAt(i+1);
        	        if (c == '+') 
        	        	res = res + value(c1);
        	        else if (c == '-') 
        	        	res = res - value(c1);
        	        else if (c == '*') 
        	        	res = res * value(c1);
        	        else if (c == '/') 
        	        	res = res / value(c1);

	            }
	        
	    }
	    
	    return res;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    
	    System.out.println(result(s));
	 
	    
	}

}*/
import java.util.*;
 public class Fs_Day_3_Program_3 {
     public static int result(String s)
     {
         String s1 = "";
        List<Integer> l = new ArrayList<Integer>();
        if(s.charAt(0)=='-')
        {
            l.add(-(s.charAt(1)-'0'));
        }
        else
        {
            l.add(s.charAt(0)-'0');
        }
        //int k = 1;
        for(int k=1;k<s.length()-1;k++)
        {
            char c=s.charAt(k);
            if(c=='+' || c=='-' || c=='*' || c=='/')
            {
                s1=s1+c;
                if(s.charAt(k+1)=='-')
                {
                    int x=(s.charAt(k+2)-'0');
                    l.add(-x);
                    k=k+2;
                }
                else
                {
                    l.add(s.charAt(k+1)-'0');
                    k++;
                }
            }
        }
        int res=l.get(0);
        int j=0;
        for(int i=1;i<l.size();i++)
        {
            char c=s1.charAt(j);
            j++;
            if(c == '+')
            {
                res=res+l.get(i);
            }
            if(c == '-')
            {
                res=res-l.get(i);
            }
            if(c == '*')
            {
                res=res*l.get(i);
            }
            if(c == '/')
            {
                res=res/l.get(i);
            }
        }
        
        return res;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        System.out.println(result(s));
    }
}
