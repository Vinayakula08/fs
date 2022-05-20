/*

Ramu is a milk supplier. He has only two aluminium cups of capacity m and n litres. 
Using these two cups only, he can measure the milk. 
He has to supply exactly P litres of milk

To measure the milk, the operations allowed are:
	- Fill one of the cups completely with milk.
	- Empty the other cup.
	- Pour milk from one cup into another cup till it fills completely,
	 or the first cup itself is empty.
	 
Such that, at the end one or both cups contains P litres of the milk.
	
Please help Ramu, to check whether P litres of milk can be measured
using the two cups or not.

Input Format:
-------------
3 space separated integers, m, n and P.

Output Format:
--------------
Print a boolean value.


input=3 5 4
output=true


input=2 4 5
output=false

*/
import java.util.*;
import java.lang.*;
class Main{
     public static boolean  result(int m, int n, int p) {
         int a=0,b=0;
        if(m!=n){
                a = Math.min(m,n);
                b = Math.max(m,n);
        }
        else
        {
            a = m;
            b = n;
        }
        int z = b % a;
        if(p%a==0 || p%b==0 || a+b==p || a+(a-z)==p || b+z==p)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.print(result(m,n,p));
    }
}
/*import java.util.*;
class Main{
    static int gcd(int m, int n)
    {
        if (m == 0)
          return n;
        if (n == 0)
          return m;
        if (m == n)
            return m;
        if (m > n)
            return gcd(m-n, n);
        return gcd(m, n-m);
    }
    public static boolean  result(int m, int n, int p) {
        if(m%2==0 && n%2==0 && p%2!=0) return false;
        return  p % gcd(m, n) == 0 || m % p==0 || n % p==0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.print(result(m,n,p));
    }
}*/