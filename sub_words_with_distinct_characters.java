/*
Given a word w, return number of righteous subwords of length 4 in w.

A word is righteous if there are no duplicate characters.

example:
input =wxyzzaz
output =1

there are 4 sub-words with size 4: wxyz,xyzz,yzza,zzaz.
righteous subwords from the above 4 is only one wxyz with no duplicate character.


input =abcddcbaabcd
output =3

there are 9 sub-words with size 4:
abcd,bcdd,cddc,ddcb,dcba,cbaa,baab,aabc,abcd.
righteous subwords from the above 9 are three words abcd, dcba, abcd
with no duplicate character.
Note:  if there are multiple occurrences of the same subword, every occurrence should be counted.


input =abcdabcdabcd
output =9
abcd,bcda,cdab,dabc,abcd,bcda,cdab,dabc,abcd


*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(result(s));
        sc.close();
    }
    public static int result(String s)
    {
        int count = 0;
        for(int i=0;i<s.length()-3;i++)
        {
            String s1 = s.substring(i,i+4);
            char[] ch = s1.toCharArray();
            Character[] ch1 = new String(ch).chars().mapToObj(c -> (char) c).toArray(Character[]::new);
            ArrayList<Character> l = new ArrayList<>(Arrays.asList(ch1));
            HashSet<Character> set = new HashSet<>(l);
            if(set.size()==4) count++;
        }
        return count;
    }
}