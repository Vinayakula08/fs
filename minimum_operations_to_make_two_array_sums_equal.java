/*abstract
Rakesh is playing a game with two arrays called  array1 and array2 of single digit numbers of range 1 to 6.
In each step rakesh can change any value of any array in range of 1 to 6. 
return the minimum number of steps to make the sum of values in array1 equal to sum of values in array2
otherwise print -1, if it is not possible to make the sum of two arrays equal

Note:  array1 and array2 possibly of different lengths.

input =6
1 2 3 4 5 6
6
1 1 2 2 2 2
output =3


Rakesh can make  the sums of array1 and array2 equal with 3 operations.
- Change array2[0] to 6. array1 = [1,2,3,4,5,6], array2 = [6,1,2,2,2,2].
- Change array1[5] to 1. array1 = [1,2,3,4,5,1], array2 = [6,1,2,2,2,2].
- Change array1[2] to 2. array1 = [1,2,2,4,5,1], array2 = [6,1,2,2,2,2].


input =7
1 1 1 1 1 1 1
1
6
output =-1
Explanation: There is no way to decrease the sum of array1 or to increase the sum of array2 to make them equal.so return -1.


input =2
6 6
1
1
output =3
Explanation: You can make the sums of array1 and array2 equal with 3 operations. All indices are 0-indexed. 
- Change array1[0] to 2. array1 = [2,6], array2 = [1].
- Change array1[1] to 2. array1 = [2,2], array2 = [1].
- Change array2[0] to 4. array1 = [2,2], array2 = [4].

*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i=0;i<m;i++)
            a[i] = sc.nextInt();
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i=0;i<n;i++)
            b[i] = sc.nextInt();
        System.out.println(result(a,b,m,n));
    }
    public static int result(int[] a, int[] b, int m, int n) 
        {
        Arrays.sort(a);
        Arrays.sort(b);
        int f = 0;
        for(int x:a)
            f = f + x;
        int t=0;
        for(int x:b)
            t = t + x;
        if(f==t)
            return 0;
        if(f>t)
        return helper(a,b,f,t);
        return helper(b,a,t,f);
    }
    static int helper(int a[],int b[],int f,int t)
    {
          
       int t1=a.length;
       int t2=b.length*6;
       if(t1>t2)
           return -1;
        int i=a.length-1,j=0,ans=0;
        while(i>=0 || j<b.length)
        {
            if(f<=t)
               break;
            int c1=-1,c2=-1;;
            if(i>=0)
            {
                c1=Math.abs(a[i]-1);
            }
            if(j<b.length)
                c2=Math.abs(6-b[j]);
            if(c1>=c2)
            {
                f=f-c1;
                i--;
            }
            else 
            {
                t += c2;
                j++;
            }
            ans++;
        }
        return ans;
        
    }

}