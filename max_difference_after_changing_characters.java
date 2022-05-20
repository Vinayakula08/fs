/*abstract
Sunder is given a number(num).
He will apply the following rules only 2 times 

Pick a digit x (9 >= x >=0) .
Pick another digit y (9 >= y >= 0) . The digit y can be equal to x .
Replace all the occurrences of x in the decimal representation of num by y .
The new integer cannot have any leading zeros, also the new integer cannot be 0.
Let a and b be the results of applying the operations to num the first and second times, respectively.
Return the max difference between a and b .

Example 1:
Input = 555
Output = 888

Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
The second time pick x = 5 and y = 1 and store the new integer in b.
We have now a = 999 and b = 111 and max difference = 888


Example 2:
Input: num = 9
Output: 8
Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
The second time pick x = 9 and y = 1 and store the new integer in b.
We have now a = 9 and b = 1 and max difference = 8

Input = 123456
Output = 820000

Explanation:
The first time pick x=1 and y=9 and store the new integer in a(a=923456)
The second time pick x=2 and y=0 and store the new integer in b (b=103456)
Now a-b becomes 820000


Input = 10000
Output = 80000
Explanation:
The first time pick x=1 and y=9 and store the new integer in a(a=90000)
The second time pick x=9 and y=1 and store the new integer in b (b=10000)
Now a-b becomes 80000

*/
import java.util.*;
class Main{
    public static int result(int n)
    {
        int a = 0;
        int b = 0;
        String s = Integer.toString(n);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='9')
            {
                s = s.replace(s.charAt(i),'9');
                break;
            }
        }
        a = Integer.parseInt(s);
        s = Integer.toString(n);
        int t = 0;
        if(s.charAt(0)=='1')
        {
            t =1;
        }
        for(int i=t;i<s.length();i++)
        {
            if(s.charAt(i)>'1' && t==1)
            {
                s = s.replace(s.charAt(i),'0');
                break;
            }
            if(s.charAt(i)>'1' && t==0)
            {
                s = s.replace(s.charAt(i),'1');
                break;
            }
        }
        b = Integer.parseInt(s);
        return a-b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(result(n));
    }
}