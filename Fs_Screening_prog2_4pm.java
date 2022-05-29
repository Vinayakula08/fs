import java.util.*;
public class Fs_Screening_prog2_4pm {
	static void pattern(int n)
	{
		int t = 1;
		String s = " ";
		for(int i=1;i<=n;i++)
		{
			ArrayList<String> l = new ArrayList<>();
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2==0)
				{
					l.add(s);
				}
				else
				{
					l.add(Integer.toString(t));
					t++;
				}
			}
			if(l.get(l.size()-1).equals(s))
			{
				l.remove(l.size()-1);
			}
			if(i%2==0)
			{
				for(int k=l.size()-1;k>=0;k--)
				{
					System.out.print(l.get(k));
				}
			}
			else
			{
				for(int k=0;k<l.size();k++)
				{
					System.out.print(l.get(k));
				}
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}
}