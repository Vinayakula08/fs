/*
 * Pythagoras a mathematicians is playing with a group of numbers which contains distinct numbers(>0),
He finds the number of valid quadruples that can be formed with the given numbers.

The rules to check if it is a valid qudraples are as follows:
    - It contains 4 numbers a, b, c, d
    where a*b = c*d  and a != b != c != d

If He is not able to do so, he prints 0 


Write the code to check if the Pythagoras is correct or not. 

The first line of input consists of the group size followed by group numbers 

Input =5
3 2 4 1 6
output= 16

Explanation:
-------------
There are 16 valid Quadrules:
(2,3,1,6) , (2,3,6,1) , (6,1,3,2) , (6,1,2,3)
(3,2,1,6) , (3,2,6,1) , (1,6,3,2) , (1,6,2,3)
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)


Sample Input-2:
---------------
4
2 3 5 7

Sample Output-2:
----------------
0

 */
import java.util.*;
 class Main {
	static ArrayList<String> l2 = new ArrayList<>();
    static ArrayList<String> l1 = new ArrayList<>();
    static void fun(int i,int k,String x,int n,int[] vi)
    {
        if(k==4)
        {
            l2.add(x);
            return;
        }
        vi[i] = -1;
        for(int j=0;j<n;j++)
        {
            if(vi[j]!=-1)
                fun(j,k+1,x+l1.get(i)+" ",n,vi);
        }
        vi[i] = 0;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            l1.add(sc.next());
        }
        for(int i=0;i<n;i++)
        {
            int []vi = new int[n];
            String x = "";
            fun(i,0,x,n,vi);
        }
        int c = 0;
        HashSet<String> set = new HashSet<>(l2);
        ArrayList<String> l3 = new ArrayList<>(set);
        for(int i=0;i<l3.size();i++)
        {
            String s = l3.get(i);
            String[] a = s.split(" ");
            int z[] = new int[4];
            for(int j=0;j<4;j++)
            {
                z[j] = Integer.parseInt(a[j]);
            }
            if(z[0]*z[1]==z[2]*z[3])
            {
                c++;
            }
        }
        System.out.print(c);
    }
}
