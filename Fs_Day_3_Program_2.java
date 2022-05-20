/*
 * Mr.Bob and Mr.Cob are working on a Military Mission. 
They are supposed to encode the message and send the message to the under-cover team.

Where Cob has written a script. 
Where the Script says double all the ascii values other than mentioned in the bracket
(97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

Help Bob in writing the Code. 

Sample Test Case-1
input = attack the enemy
output = at#tt#tac#ck#k t#th#he en#nem#my#y

 */
package FS;
import java.util.*;
public class Fs_Day_3_Program_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.nextLine());
		StringBuilder str = new StringBuilder();
		int a[] = {97,101,105,111,117,65,69,73,79,85};
		int flag =0;
		for(int i=0;i<s.length();i++)
		{
			flag =0 ;
			for(int j=0;j<a.length;j++)
			{
				if((int)s.charAt(i)==a[j])
				{
					flag =1;
					break;
				}
				if(s.charAt(i)==' ')
				{
					flag =1;
					break;
				}
			}
			if(flag==0)
			{
				str.append(s.charAt(i));
				str.append('#');
				str.append(s.charAt(i));
			}
			else {
				str.append(s.charAt(i));
				
			}
			
		}
		System.out.print(str);

	}

}
