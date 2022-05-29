/*Shyam a Fifth class boy is working on numbers, Given few numbers 
he has to construct a new number which is greatest number. 

The first line of input contains the size of the numbers followed by the numbers

input = 2
50 7
output = 750

input = 5
3 30 34 5 9
output = 9534330
*/
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        int max = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.next();
            max = Math.max(a[i].length(),max);
        }
        result(n,a,max);
    }
    public static void result(int n, String[] a, int max)
    {
        String[] a1 = new String[n];
        int k = 0;
        for(int i=0;i<n;i++)
        {
            k = a[i].length();
            int x = k;
            StringBuilder sb = new StringBuilder(a[i]);
            int f = 0;
            while(k<max+1)
            {
                sb.append(a[i].charAt((f++)%x));
                k++;
            }
            a1[i] = sb.toString();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(Integer.parseInt(a1[i])<Integer.parseInt(a1[j]))
                {
                    String s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                    String s1 = a1[i];
                    a1[i] = a1[j];
                    a1[j] = s1;
                } 
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]);
    }
}