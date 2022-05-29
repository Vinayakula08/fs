/*
 * Tubby a UKG Student has given a group of letters and His madam asked to see if the group of 
letters consists of every letter in the English Aplhabet(a-z/A-Z)

print true if it contains else print false

Note: The input can contain whitespaces.


Sample Test Case -1 

input =The quick brown fox jumps over the lazy dog 
output = true 

Explanation 
The given input line Contains all the characters from �a� to �z� or 'A' to 'Z'
 

Sample Test Case -2 

input =ThequickBrownfoxjumpsOverThelazy doG 
output = true 

Explanation 
The given input line Contains all the characters from �a� to �z� or 'A' to 'Z' 

Sample Test Case - 3

input =AbcEfghuIJkzlMnOpqrsTuvWxyD
output = true

Explanation 
The given input line Contains all the characters from �a� to �z� or 'A' to 'Z' 
 */
import java.util.*;
public class Fs_Day_2_Program_2 {
	
public static void main(String args[]) 
	{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	s = s.toUpperCase();
	//StringBuilder str = new StringBuilder();
	HashSet<Character> str = new HashSet<Character>();
	//str.append('!');
	int x;
	for(int i=0;i<s.length();i++)
	{
		x = (int)s.charAt(i);
		
		if((x>=65 && x<=90) || (x>=97 && x<=122) )
		{
			str.add(s.charAt(i));
			System.out.println(str);
		}		
	}
	System.out.println(str.size());
	if(str.size()==26)
	{
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	sc.close();
	}
}
