/*
Ramu is playing with two strings s1 and s2. he wants to construct the newString in the following way.

   -- if s1 is not empty append the first character in s1 to newString and delete it from s1.
     example: if s1=abc and newString=de, then after choosing this operation, s1=bc and newString =dea
   -- if s2 is not empty append the first character in s2 to newString and delete it from s2.
      example: if s2=abc and newString="" then after choosing this operation, 
      s2=bc and newString= a
  Note: return the lexicographically largest newString ramu need to construct

example 1:
intput =
cabaa
bcaaa
output =cbcabaaaaa

 
Explanation: One way to get the lexicographically largest newString is:
- take from s1: newString = "c", s1 = "abaa", s2 = "bcaaa"
- Take from s2: newString = "cb", s1 = "abaa", s2 = "caaa"
- Take from s2: newString = "cbc", s1 = "abaa", s2 = "aaa"
- Take from s1: newString = "cbca", s1 = "baa", s2 = "aaa"
- Take from s1: newString = "cbcab", s1 = "aa", s2 = "aaa"

- Append the remaining 5 a's from s1 and s2 at the end of newString.

    
input= abcabc
abdcaba
output =abdcabcabcaba


*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        result(s1,s2);
    }
    /*public static String result(String s1,String s2)
    {
        if(s1.length()==0 || s2.length()==0)
        {
            return s1+s2;
        }
        if(s1.compareTo(s2)>0)
        {
            return s1.charAt(0)+result(s1.substring(1),s2);
        }
        else{
            return s2.charAt(0)+result(s1,s2.substring(1));
        }
        
    }*/
    public static void result(String s1, String s2)
    {
        int m = s1.length();
        int n = s2.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sbx1 = new StringBuilder(s1);
        StringBuilder sbx2 = new StringBuilder(s2);
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(s1.charAt(i)>s2.charAt(j))
            {
                sb1.append(s1.charAt(i));
                sbx1.deleteCharAt(0);
                i++;
            }
            else if(s2.charAt(j)>s1.charAt(i))
            {
                sb1.append(s2.charAt(j));
                sbx2.deleteCharAt(0);
                j++;
            }
            else if(s1.charAt(i)==s2.charAt(j))
            {
                if(sbx1.compareTo(sbx2)>0){
                    sb1.append(s1.charAt(i));
                    sbx1.deleteCharAt(0);
                    i++;
                }
                else{
                    sb1.append(s2.charAt(j));
                    sbx2.deleteCharAt(0);
                    j++;
                }
                
            }
        }
        for(;i<m;i++)
            sb1.append(s1.charAt(i));
        for(;j<n;j++)
            sb1.append(s2.charAt(j));
        System.out.println(sb1);
    }
}