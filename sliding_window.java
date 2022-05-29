import java.util.*;
public class sliding_window {
	/*static int res(int a[], int w)
	{
		int sum = 0,max = 0;;
		for(int i=0;i<w;i++)
		{
			sum = sum + a[i];
		}
		max = sum;
		for(int i=w;i<a.length;i++)
		{
			sum = sum + a[i] - a[i-w];
			if(sum>=max)
			{
				max = sum;
			}
		}
		return max;
	}
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			int w = sc.nextInt();
			System.out.println(res(a,w));
			
	}*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        
        for(int i=n-1;i>=0;i--)
        {
        	
        }
        sc.close();
    }
}
