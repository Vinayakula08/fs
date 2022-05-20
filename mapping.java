/*abstract
Given a list of strings words and a string pattern, return a list of words[i] that match pattern. 
You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing 
every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps
to another letter, and 
no two letters map to the same letter.

Note: print output in ascending order of words

input =abc deq mee aqq dkd ccc
abb
ouput =aqq mee

words= abc deq mee aqq dkd ccc
pattern =abb
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
             "aqq" matches the pattern because there is a permutation {a -> a, b-> q}
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, 
since a and b map to the same letter.



Example 2:
input =a b c
a
ouput =a b c



*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] a = s1.split(" ");
        ArrayList<String> l = new ArrayList<>();
        for(String s : a){
            if(match(s,s2)){
                l.add(s);
            }
        }
        Collections.sort(l);
        for(String s : l)
        System.out.print(s+" ");
    }
    static boolean match(String s, String s2){
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length()!=s2.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch1 = s2.charAt(i);
            char ch2 = s.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
            else if(map.values().contains(ch2)){
                return false;
            }
            else{
                map.put(ch1,ch2);
            }
        }
        return true;
    }
}