/*
 * Scott is a sweet lover and eats sweets daily. His father is worried about his health 
and gives a task to Scott. If Scott solves the task then he is allowed to eat the sweets.

His task is as follows

Scott is given a word 'W'. Now he is supposed to see, the word is a Balanced Word or Not .

A word is said to be Balanced word if it contains all characters same number of times. 
He can also make the word Balanced by removing  only one occurence of a character at any index in the word. 

If he is able to do so print "true" else print "false"


Sample Test Case-1

input = xyz
output = true

This is Balanced because (x-1,y-1,z-1)

Sample Test Case-2

input = xyzz
output = true

This is Balanced because (x-1,y-1,z-2)
He can remove one occurence of z, It results in (x-1,y-1,z-1)

Sample Test Case-3

input = xxyyzzzz
output = false

This is not Balanced because (x-2,y-2,z-4)
By removing once occurence of z, It results in (x-2,y-2,z-3)
So this is not Balanced

Sample Test Case-4

input = xzxyzxz
output = true

This is Balanced because (x-3,y-1,z-3)
By removing once occurence of y, It results in (x-3,z-3)
So this is  Balanced
 */
package FS;
import java.util.*;
import java.lang.*;

import java.lang.Math;
public class Fs_Day_9_Program_1 {
	public static void result(StringBuilder s)
	{
		ArrayList<Integer> l = new ArrayList<>();
        int count = 1;
        char[] c = s.toString().toCharArray();
        Arrays.sort(c);
        for(int i=0;i<s.length()-1;i++)
        {
            if(c[i]==c[i+1])
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
        System.out.println(l);   
        int a = 0;        
       if(l.size()%2==0)
	   {
		   a = l.get(0);
	   }
       for(int i=0;i<l.size();i++)
        {
    	   a = a^l.get(i);
        }
        System.out.println(a);
        Collections.sort(l);
        if(a==1 || (a ==l.get(l.size()-1) && l.get(l.size()-1)-l.get(l.size()-2)<=1) || l.size()==1 || (l.size()==2 && Math.abs(l.get(0)-l.get(1))<=1) || (l.size()==2 && (l.get(0)==1 || l.get(1)==1)))
        {
            System.out.println(true);
        }
        else
        {
            System.out.print(false);
        }
        
	}
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        result(s);
    }
}
