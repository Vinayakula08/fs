import java.util.*;
public class pattern {
	public static void result(int n)
    {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=((n)*(n+1))/2;i>=1;i--)
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
//15
//14 7
//13 8 6
//12 9 5 2
//11 10 4 3 1

