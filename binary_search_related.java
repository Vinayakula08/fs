/*
Given a sorted array of distinct integers and a target value, 
return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.


Example 1:
input =4
1 3 5 6
5
output =2


input =4
1 3 5 6
2
output =1

*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        for(int i=0;i<n;i++)
            x[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(result(n,x,k));
        sc.close();
    }
    public static int result(int n, int[] x, int k)
    {
        for(int i=0;i<n;i++)
        {
            if(x[i]==k || x[i]>k)
                return i;
        }
        return n;
        
    }
}