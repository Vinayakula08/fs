/*

Ramu is given a pair of words, Now his teacher has given him a task. 
His task is to see if the individual alphabets of the words are mapped properly or not 

If they do so print true else print false

Two strings are mapped properly  if the characters in 's' can be replaced to get 't'.
All occurrences of a alphabet must be replaced with another alphabet while preserving the order of alphabets
No two alphabets may map to the same alphabet but a alphabet may map to itself.


Note:
You may assume both s and t have the same length and all inputs contains('a-z')

input = 
egg
app
output = true

input = 
foo
bar
output = false

input = 
papel
title
output = true


*/
import java.util.*;
class Main
{
    static boolean result(String s1, String s2)
    {
        HashMap<Character,Character> m1 = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(!m1.containsKey(s1.charAt(i)))
            {
                m1.put(s1.charAt(i),s2.charAt(i));
            }
            else{
                if(m1.get(s1.charAt(i))==s2.charAt(i))
                {
                    continue;
                }
                else{
                    return false;
                }
            }
        }
         HashMap<Character,Character> m2 = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(!m2.containsKey(s2.charAt(i)))
            {
                m2.put(s2.charAt(i),s1.charAt(i));
            }
            else{
                if(m2.get(s2.charAt(i))==s1.charAt(i))
                {
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.print(result(s1,s2));
    }
}