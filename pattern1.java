/*
Number Rangoli 

Swathi Prints the following Number Rongoli 
for any given positive integer 'n'

Help Swathi in this regard

input=4
output=
1*2*3*4*17*18*19*20
--5*6*7*14*15*16
---8*9*12*13
----10*11


The output should contain only - and * numbers(0-9)


input=3
output=
1*2*3*10*11*12
--4*5*8*9
---6*7


**/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int x = 1;
        for(int i=n-1;i>=0;i--)
        {
            for(int k=0;k<=t;k++)
            {
                if(i==n-1) continue;
                System.out.print("-");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(x++);
                System.out.print("*");
            }
            int y = (i)*(i+1) + x;
            for(int j=0;j<=i;j++)
            {
                System.out.print(y++);
                if(j!=i) System.out.print("*");
            }
            System.out.println();
            t++;
        }
    }
}