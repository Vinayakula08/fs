/*
 * Kalpana a third class student is playing with numbers. 
She has given her brother the same set of numbers and asked him to find the 
next greatest nearest number which contains the same set of digits same number of times. 

If no such number exists print -1 

input = 121
output = 211

input = 653
output = -1


input = 456
output = 465



 */
import java.util.*;
public class Fs_Day_15_Program_1 {
    static ArrayList<Integer> l = new ArrayList<Integer>();
	static void permute(String s , String answer)
	{   
	    if (s.length() == 0)
	    {
	        l.add(Integer.parseInt(answer));
	    }
	    for(int i = 0 ;i < s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        String left_substr = s.substring(0, i);
	        String right_substr = s.substring(i + 1);
	        String rest = left_substr + right_substr;
	        permute(rest, answer + ch);
	    }
	}
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	    String s = scan.next();;
	    String answer="";
	    permute(s, answer);
	    Collections.sort(l);
	    int k = Integer.parseInt(s);
	    for(int i=0;i<l.size();i++)
	    {
	    	if(l.get(i)>k)
	    	{
	    		System.out.println(l.get(i));
	    		return;
	    	}
	    }
	    System.out.print(-1);
	}
}
