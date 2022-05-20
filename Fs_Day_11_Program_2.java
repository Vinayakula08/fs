/*
 * 
Ramu a School boy given a number 'n' writes it vertically down and writes up again verically up (n-1) lines in increasing order of 1.
He Repeats the above process continously. 


input = 5
output =
1
2 9
3 8 10
4 7 11 14 
5 6 12 13 15



input = 6
output = 
1
2 11
3 10 12
4 9 13 18
5 8 14 17 19
6 7 15 16 20 21

 */
package FS;
import java.util.*;
public class Fs_Day_11_Program_2 {
	public static void result(int n)
    {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=1;i<=((n)*(n+1))/2;i++)
		{
			l.add(i);
		}
		int t = 2*n-1;
		for(int i=0;i<n;i++)
		{
			int t1 =2*i-2;
			int f=0,g=0;
			int k = i;
			int x = 0;
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					System.out.print(l.get(k)+" ");
				}
				else 
				{
					if(j%2!=0)
					{
						if(x==0)
	                    {
	                        f = k+t+g;
	                        x++;
	                    }
	                    else
	                    {
	                        f = t+g;
	                    }
						System.out.print(l.get(f)+" ");
					}
					else 
					{
						g = f+t1;
						System.out.print(l.get(g)+" ");
						t1 = t1 -4;	
					}
				}
			}
			t = t-2;
			System.out.println();
		}
	}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        result(n);
    }

}
