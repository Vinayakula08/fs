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
class Main{
    static int result(int n, int d, int[] a)
    {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++)
            l.add(a[i]);
        int max = 1;
        int count = 1;
        for(int i=0;i<l.size();i++)
        {
            max = (count>max)?count:max;
            if(max>l.size()-i)
                break;
            count = 1;
            int x = l.get(i);
            for(int j=i+1;j<a.length;j++)
            {
                if(l.get(j)-x==d){
                    count++;
                    x = l.get(j);
                }
            }
        }
        max = (count>max)?count:max;
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print(result(n,d,a));
    }
}