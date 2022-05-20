/*
Shyam is playing with group of characters, where the group of characters contain only A/B.

He has to return the count of non-empty substrings from this group which will have the same number of
A's and B's and all the A's and all the B's in these substrings are grouped consecutively

Substrings that occur multiple times are counted the number of times they occur.

 
Example 1:

Input = AABBAABB
Output = 6

Explanation: 
There are 6 substrings that have equal number of consecutive B's and A's: 
"AABB", "AB", "BBAA", "BA", "AABB", and "AB".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "AABBAABB" is not a valid substring because all the A's (and B's) are not grouped together.

Example 2:

Input = BABAB
Output = 4
Explanation: 
There are 4 substrings: "BA", "AB", "BA", "AB" that have equal number of consecutive B's and A's.


*/
import java.util.*;
class Main
{
    public static int result(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            
            {
              String s1=s.substring(i,j+1);
              char ch[]=s1.toCharArray();
              Arrays.sort(ch);
              StringBuilder s2=new StringBuilder(s1);
              if((String.valueOf(ch).equals(s1) || s2.reverse().toString().equals(String.valueOf(ch))) && s.substring(i,j+1).length()%2==0 && ch[ch.length/2]!=ch[ch.length/2-1])
              {
                  count++;
            
              }
                
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(result(s));
        sc.close();
    }
}