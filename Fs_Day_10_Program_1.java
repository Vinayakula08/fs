/*
 * Tubby a Third Class Student has given a Assignment on Time Chapter by his class teacher.
Tubby is supposed to change the time given in AM/PM Format to 24 Hours Format. 
Help Tubby Solve the Problem 

The Maths teacher gave him the time in the following Format - HH:MM:SS:AM/PM

Assume all HH,MM,SS are in the valid range only 
 
Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
     
Assume all input times are valid

Back end test cases

input = 06:10:20PM
output = 18:10:20

input = 01:45:50PM
output = 13:45:50

input = 10:05:30AM
output = 10:05:30

input = 02:13:19AM
output = 02:13:19
    
 */
package FS;
import java.util.*;
public class Fs_Day_10_Program_1 {
	public static StringBuilder result(StringBuilder s)
    {
        int a = Integer.parseInt(s.toString().substring(0,2));
        if(a==12 && s.charAt(s.length()-2)=='A')
        {
            String s1 = "00";
            s.delete(0,2);
            char c[] = s1.toCharArray();
            s.insert(0,c,0,2);
            s.delete(s.length()-2,s.length());
            return s;
        }
        else if(s.charAt(s.length()-2)=='A' || (a==12 && s.charAt(s.length()-2)=='P'))
        {
            s.delete(s.length()-2,s.length());
            return s;
        }
        else
        {
            a =a + 12;
            String s1 = Integer.toString(a);
            s.delete(0,2);
            char c[] = s1.toCharArray();
            s.insert(0,c,0,2);
            s.delete(s.length()-2,s.length());
            return s;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        System.out.print(result(s));
    }
}
