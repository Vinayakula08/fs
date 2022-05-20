/*
Given a array of "array of words" and "characters", 
find the sum of length of all nice words using those characters.

nice word: a word is nice, if it can be formed by characters.

example: 

input =cat bt hat tree
atach
output=6

The words that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

input =apple orange bat tree
atbeppol
output =8

*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.next();
        System.out.println(result(s,s1));
        sc.close();
    }
    public static int result(String s, String s1)
    {
        String[] a = s.split(" ");
        int i = 0;
        int sum =0 , flag = 0;
        while(i<a.length)
        {
            flag = 0;
            for(int j =0;j<a[i].length();j++)
            {
                if(s1.contains(Character.toString(a[i].charAt(j))))
                    flag++;
            }
            if(flag==a[i].length()) sum += flag;
            i++;
        }
        return sum;
    }
}