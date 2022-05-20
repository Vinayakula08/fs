/*

Shanmukha creating a special strings.
A string is said to be a special string, if all the letters appeared 
even number of times, or only one letter appeared odd number of times.

For example: "adda" and "iaaff" are special strings.
but "iaf" is not a special string.

You are given a word W, where W conatins the letters from a to j.
Our task is to findout, the number of non-empty special strings, 
which are substrings of word W can be formed.
if a substring appeared more than once, count each appearance separately.

NOTE: subsequences are not allowed.

Input Format:
-------------
A String W, the word.

Output Format:
--------------
Print an integer, number of special strings.


Sample Input-1:
---------------
egg

Sample Output-1:
----------------
5

Explanation:
------------
The special strings formed from the word "egg" are:
'e'gg, e'g'g, eg'g', e'gg', 'egg'.


Sample Input-2:
---------------
bajaj

Sample Output-2:
----------------
9

Explanation:
------------
The special strings formed from the word "bajaj" are:
'b'ajaj, b'a'jaj, baj'a'j, ba'j'aj, baja'j', b'aja'j, ba'jaj', b'ajaj', 'bajaj'.


*/
import java.util.*;
class Main{
    static int result(StringBuilder s)
    {
        int count = 1;
        int cnt = 0;
        ArrayList<String> l1 = new ArrayList<>();
                ArrayList<String> l2 = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {

            for(int j=i+1;j<=s.length();j++)
            {
                String s1 = s.substring(i,j);
                l1.add(s1);
                char c[] = s1.toCharArray();
                Arrays.sort(c);
                count = 1;
                ArrayList<Integer> l = new ArrayList<>();
                for(int k=0;k<c.length-1;k++)
                {
                    if(c[k]==c[k+1])
                    {
                        count++;
                    }
                    else
                    {
                        l.add(count);
                        count = 1;
                    }
                }
                l.add(count);
                int f = 0;
                int x = 0;
                for(int k=0;k<l.size();k++)
                {
                    if(l.get(k)%2==0)
                    {
                        f++;
                    }
                    if(x==0 && l.get(k)%2==1)
                    {
                        x++;
                        f++;
                    }
                    
                }
                if(f==l.size())
                {
                    l2.add(s1);
                    cnt++;
                }
            }
        }
        System.out.println(l1.size());
        System.out.println(l2.size());
        return cnt;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        System.out.print(result(s));
        sc.close();
    }
}