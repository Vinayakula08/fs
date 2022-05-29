/*abstract
Given a word w, return the number of substrings with out duplicate characters of length 3 in w.

ex: 
input =xyzzaz
output =1
there are 4 substrings of size 3
xyz, yzz,zza,zaz
out of this only xyz has no duplicate characters so print 1.


ex:
input =aababcabc
ouput =4

there are 7 substrings of size 3
aab,aba,bab,abc,bca,cab,abc
from the above abc,bca,cab,abc are having unique characters.


*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(result(s));
        sc.close();
    }
    public static int result(String s)
    {
        int count = 0;
        ArrayList<Character> l = new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            l.add(s.charAt(i));
        }
        HashSet<Character> set = new HashSet<>(l);
        if(set.size()==3) count++;
        for(int i=3;i<s.length();i++)
        {
            l.add(s.charAt(i));
            l.remove(0);
            set = new HashSet<>(l);
            if(set.size()==3) count++;
        }

        return count;
    }
}