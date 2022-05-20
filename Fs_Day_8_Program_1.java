/*
 write a program to read a postive input 'n' from the user and print the following pattern 

Assume the input 'n' will always be a postive integer 

input = 5
output = 
A*1
B*C*3*2
D*E*F*6*5*4
G*H*I*J*10*9*8*7
K*L*M*N*O*15*14*13*12*11
 
Note - If in the above pattern if the alphabet exceed 'Z' then start print again from 'A'



 */
package FS;
import java.util.*;
public class Fs_Day_8_Program_1 {
	public void result(int n)
    {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] c = s.toCharArray();
        int t = 1;
        int x = 1;
        StringBuilder str = new StringBuilder("0");
        for(int i=1;i<=n;i++)
        { 
            str.delete(0,str.length());
            int f = 1, l = 1;
            int k = 0, a = 0;
            while(f<=i)
            {
                f++;
                a++;
                if(a==1)
                {
                   str.append(c[(t++-1)%26]);
                }
                else
                {
                    str.append("*");
                    str.append(c[(t++-1)%26]);
                }
            }
            int z = x+i-1;
            while(l<=i)
            {
                l++;
                str.append("*");
                str.append(z--);
                x++;
            }
            System.out.println(str);  
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fs_Day_8_Program_1 m = new Fs_Day_8_Program_1();
        m.result(n);
    }
	

}
