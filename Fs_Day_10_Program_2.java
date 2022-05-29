/*
 * Shyam is given a sentence and asked him to check if it is the same reading from both sides or not. If it is same print true else print false


Note - Assume the input line here is not case sensitive
ignore the special symbols,spaces and compare only the characters and print true or false


input =a man a plan a canal panama
output = 1

in the above  example first character is 'a' last character is 'a'
second character is 'm' last second character is 'm' and comparing so on all characters should be equal


input =do nine men interpret nine men i nod
output = true

input =Red rum, sir, is murder
output = true 

input = Was it a cat I saw?
output = true

input =Eva,   can I s e e b^% e e s i n a ca;;;ve?
output = true 

input =No lemon, no melon
output = true 


 */
package FS;
import java.util.*;
public class Fs_Day_10_Program_2 {
	public static boolean result(String s)
    {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                str.append(s.charAt(i));
            }
        }
        if(str.toString().equals(str.reverse().toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(result(s));
    }
}
