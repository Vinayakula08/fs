/*

Sundeep is working with integer sets.
He is given a set of integers nums[], consist of positive integers.
You have to find a subsequence of integet set nums[], where the sum of elements
is equal to the sum of the rest of the elements.

Check whether you are able to split the entire set nums[], into two subsequences
where the two subsequences never share the elements from same index.

If it is possible to split, print true.
otherwise print false.

The first line of input contains the size followed by array elements 

Sample Input-1:
---------------
4
4 2 8 6

Sample Output-1:
----------------
true

Explanation:
----------
[4,6] and [2,8] sum of both the sets equal to 10.


Sample Input-2:
---------------
5
2 3 4 5 8

Sample Output-2:
----------------
false







*//*
import java.util.*;
public class fsday21{//prog2
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    sum+=a[i];
		}
		System.out.print(subsequence(n,a,sum));
	}
	static boolean subsequence(int n,int[] a,int sum){
	    if(sum%2!=0){
	        return false;
	    }
	    int s=sum;
	    int csum=0;
	    Arrays.sort(a);
	    int i=0,j=n-1;
	    while(i<j){
	        csum+=a[i]+a[j];
	        s=sum-csum;
	        if(s==csum){
	            return true;
	        }
	        else if(csum<s){
	            i++;
	            csum-=a[j];
	        }
	        else if(csum>s){
	            j--;
	            csum-=a[i];
	        }
	    }
	    return false;
	}
}
*/
import java.util.*;
class Main
{
static boolean result(int a[], int n, int x, int l, int r)
{
    if (x == n)
        return l == r;
    else
        return result(a, n, x + 1, l + a[x], r) || result(a, n, x + 1, l, r + a[x]);
}

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.print(result(a,n,0,0,0));
    
}
}