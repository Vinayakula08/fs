/*
You are given a string s.

A split is called good if you can split s into two non-empty strings sleft and sright where their concatenation is equal to s (i.e., sleft + sright = s) and the number of distinct letters in sleft and sright is the same.

Return the number of good splits you can make in s.

 
input =aacaba
output: 2

Explanation: There are 5 ways to split "aacaba" and 2 of them are good. 
("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.


Example 2:
input = abcd
Output: 1

Explanation: Split the string as follows ("ab", "cd").


*/
import java.util.*;
class Main{
    static int result(String s) {
        int count=0;
        Map<Character,Integer> prefix=new HashMap<>();
        Map<Character,Integer> suffix=new HashMap<>();
        for(char ch:s.toCharArray()){
            suffix.put(ch,suffix.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            prefix.put(ch,prefix.getOrDefault(ch,0)+1);
            suffix.put(ch,suffix.get(ch)-1);
            if(suffix.get(ch)==0){
                suffix.remove(ch);
            }
            if(prefix.size()==suffix.size()){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(result(s));
    }
}