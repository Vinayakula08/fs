/*
Wonderful String

You will be given a Wonderful String,print the numbers of '2' in the wonderful string. 

A wonderful string contains only two digits '1' and '2'.

The string has following rules
	- The first few digits are as follows: 
	    "1221121221221121122......"
	- The string is originally formed as follows:
		1 22 11 2 1 22 1 22 11 2 11 22 ......
	and the count of '1's or '2's in each consecutive groups are:
		1 2 2 1 1 2 1 2 2 1 2 2 ......
	the count sequence above is in the string S itself.



input=7
output=3

Explanation:
------------
The sustring of length 7 is "1221121".The count of 2's is 3.


input=12
output=7

Explanation:
------------
The sustring of length 12 is "122112122122".The count of 2's is 7.


*/
import java.util.*;
class Main{
    public static String result(int n)
    {
        String s = "122";
        int j = 2;
        int y = 0;
        while(s.length()<=n)
        {
            int x = (int)(s.charAt(j)-'0');
            char ch = s.charAt(s.length()-1);
            if(ch=='1') y=2;
            if(ch=='2') y=1;
            for(int i=0;i<x;i++){
                s = s+Integer.toString(y);
            }
            j++;
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = result(n);
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='2')
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}