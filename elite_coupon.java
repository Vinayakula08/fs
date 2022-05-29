/*
KMIT's Technical club- "recurse" developed a UPI payment system R-UPI.
R-UPI (Rupee) payments, offers a coupon for each payment made using it.
Each coupon will come with an expiry time. R-UPI has a utilization restriction 
over the coupons earned by the user, the limit is atmost one coupon per day.
And  the coupons alloted in a single day will have same expiry time.

Nagireddy, one of the user of R-UPI made few payments each day for N days.
and he received coupons for the same. The coupons earned in each day for N days 
is given as coupons[], where coupon[i] indicates number of coupons on i-th day.
And the expiry time in days is given as expdays[], where expdays[i] indicates,
expiry of i-th day coupons and expiry days includes the day the coupons earned. 
If no coupons on i-th day, then coupons[i]=0 and expdays[i]=0.

For example: if Nagireddy earns 2 coupons on day-3, He has to utilize them on 
day-3 and day-4, he can't utilize them on day-5.

You will be given an integer N, coupons[] and expdays[].
Your task is to findout the maximum number of coupons utilized by Nagireddy. 

NOTE: if N=5 and on day-5 you are left with few coupons, you can continue 
to utilize the remaining coupons before they get expired.

Input Format:
-------------
Line-1: An integer N, number of Coupons.
Line-2: N space separated integers, number of coupons each day.
Line-3: N space separated integers, i-th coupon expires in days[i] days. 

Output Format:
--------------
Print an integer, number of coupons you can utilize.


Sample Input-1:
---------------
5
1 3 4 2 2 
2 1 2 4 3

Sample Output-1:
----------------
7

Explanation:
------------
Nagireddy can utilize 7 coupons in total,
	- On day-1, he can use 1 coupon received on day-1.
	- On day-2, he can use 1 coupon received on day-2 and remaining 2 coupons expired.
	- On day-3, he can use 1 coupon received on day-3 and remains 3 coupons.
	- On day-4, he can use 1 coupon received on day-3 and 
	  remains with 2 coupons earned on day-4.
	- On day-5, he can use 1 coupon received on day-4 and 
	  remains with 3 coupons earned on day-4 and 2 coupons earned on day-5
	- On day-6, he can use 1 coupon received on day-5 and 
	  remains with 3 coupons earned on day-4 and coupons earned on day-5 expired.
	- On day-7, he can use 1 coupon received on day-4 and 
	  2 coupons remained on day-4 expires.


Sample Input-2:
---------------
6
2 0 0 1 0 3
1 0 0 2 0 2

Sample Output-2:
----------------
4

Explanation:
------------
Nagireddy can utilize 4 coupons in total,
	- On day-1, he can use 1 coupon received on day-1, and 1 coupon expired.
	- On day-2 and day-3, he don't have any coupons
	- On day-4, he can use 1 coupon received on day-4 and no coupons left.
	- On day-5, he don't have any coupons
	- On day-6, he can use 1 coupon received on day-6 and 
	  remains with 1 coupons earned on day-6.
	- On day-7, he can use 1 coupon received on day-6 and 
	  the remaining 1 coupon expired.








*/
import java.util.*;
class Main{
    public static boolean add(ArrayList<Integer> l)
    {
        int sum = 0;
        for (int i : l)
            sum += i;
        return sum!=0;
    }
    public static void decrement(ArrayList<Integer> l2,ArrayList<Integer> l1)
    {
        for(int i=0;i<l2.size();i++)
        {
            if(l2.get(i)>0) l2.set(i,l2.get(i)-1);
            if(l1.get(i)==0) l2.set(i,0);
        }
    }
    public static int result(ArrayList<Integer> l1, ArrayList<Integer> l2)
    {
        int min = Integer.MAX_VALUE;
        int y = -1;
        for(int i=0;i<l2.size();i++)
        {
            if(min > l2.get(i) && l2.get(i)!=0 && l1.get(i)!=0)
            {
                min = l2.get(i);
                y = i;
            }
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        for(int i=0;i<n;i++)
            a1[i] = sc.nextInt();
        int[] a2 = new int[n];
        for(int i=0;i<n;i++)
            a2[i] = sc.nextInt();
        int day = 0;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int count = 0;
        while(day<n || add(l2))
        {
            if(day<n)
            {
                l1.add(a1[day]);
                l2.add(a2[day]);
                day++;
            }
            int x = result(l1,l2);
            System.out.println(x);
            if(x!=-1) l1.set(x,l1.get(x)-1);
            if(x!=-1) count++;
            decrement(l2,l1);
        }
        System.out.println(count);
        sc.close();
    }
}
/*abstract
import java.util.*;
public class prac3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=0,count=0;
		int[] a=new int[n];
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
		}
		int[] b=new int[n];
		for(int j=0;j<n;j++) {
			b[j]=sc.nextInt();
		}
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		while(sum(b)) {
			if(i>=n) {
				i=n-1;
			}
			l1.clear();l2.clear();
			for(int j=0;j<=i;j++) {
				l1.add(a[j]);l2.add(b[j]);
			}
			int index=index(l1,l2);
			if(index==-1) {
				for(int j=0;j<=i;j++) {
					b[j]=Math.max(b[j]-1,0);
				}
				i+=1;continue;
			}
			for(int j=0;j<=i;j++) {
				b[j]=Math.max(b[j]-1,0);
			}
			a[index]-=1;count+=1;i+=1;
		}
		System.out.print(count);
	}
	static int index(List<Integer> l1,List<Integer> l2) {
		int index=l1.get(0)>0 && l2.get(0)>0?0:-1;
		int min=Integer.MAX_VALUE;
		for(int i=1;i<l1.size();i++) {
			if(l2.get(i)<min && l2.get(i)>0 && l1.get(i)>0) {
				min=l2.get(i);
				index=i;
			}
		}
		return index;
	}
	static boolean sum(int[] b) {
		int sum=0;
		for(int i:b) {
			sum+=i;
		}
		return sum!=0;
	}
}*/