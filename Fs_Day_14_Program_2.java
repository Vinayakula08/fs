import java.util.*;
public class Fs_Day_14_Program_2 {
	public static void result(String s, int p)
    {
        String []s1 = s.split(" ");
        int []a = new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            a[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(a);
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length-1;i++)
        {
            l.add(a[i+1]-a[i]);
        }
        int count = 1;
        System.out.println(l);
        int sum = 0;
        StringBuilder str = new StringBuilder("0");
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        int max = 0;
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        for(int k=0;k<l.size();k++)
        {
        	for(int j=k;j<l.size();j++)
        	{
        		l1.add(l.get(j));
        		sum = 0;
        		count = 1;
        		str.delete(0, str.length());
        		str.append("0");
        		for(int i=0;i<l1.size();i++)
                {
                    sum = sum + l1.get(i) + Integer.parseInt(str.toString());
                    str.delete(0, str.length());
                    str.append(sum);
                    if(sum<=p)
                    {
                        count++;
                    }
                    else
                    {
                    	l2.add(count);
                    	break;
                    }
                }
        	}
        	
        	l1.clear();
        }
        count = 0;
        System.out.print(l2);
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int p = sc.nextInt();
        result(s,p);
    }
}