import java.util.*;
public class rohith {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/*String s = sc.next();
		String s1 = sc.next();
		int t = 0,flag = 0;
		int k = 0;
		StringBuilder str = new StringBuilder();
		str.append('0');
		str.append('0');
		for(int i=0;i<s1.length();i++)
		{	
			if(!(Character.isDigit(s1.charAt(i))))
			{
				k++;
				if(k!=1)
				{
					//t++;
				}
				t= t + Integer.parseInt(str.toString());	
				if(s.charAt(t)!=s1.charAt(i))
				{
					flag = 1;
					break;
				}
				t++;
				str.setLength(0);
				str.append('0');
			}
			else
			{
				str.append(s1.charAt(i));
				
			}
		}
		if(flag==0)
		{
			System.out.println(true);
		}
		if(flag==1)
		{
			System.out.println(false);
		}*/
		/*int n = sc.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=n;i>0;i--)
		{		
			l.clear();
			for(int j=n;j>=i;j--)
			{
				l.add(j);
			}
			for(int k=l.size()-1;k>=0;k--)
			{
				System.out.print(l.get(k));
			}	
			System.out.print("0");
			for(int k=0;k<l.size();k++)
			{
				System.out.print(l.get(k));
			}
			System.out.println();
		}*/
		StringBuilder s = new StringBuilder(sc.next());
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				if(!Character.isDigit(s.charAt(i)))
				{
					l.add(Integer.parseInt(s.substring(i, i+2).toString()));
				}
				else 
				{
					l.add(Integer.parseInt(s.substring(i, i+1).toString()));
				}
			}
			else 
			{
				if(Character.isDigit(s.charAt(i)) )
				{
					if(Character.isDigit(s.charAt(i-2)))
						l.add(Integer.parseInt(s.substring(i, i+1).toString()));
				}
				else 
				{
					l.add(Integer.parseInt(s.substring(i-1, i+1).toString()));
				}
			}
		}
		System.out.println(l);
		sc.close();
	}

}
