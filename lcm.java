import java.util.*;
public class lcm {
	 public static void lc(int a[])
	    {
	        int mul = 1;
	        for (int i:a)
	        {
	            mul = mul*i;
	        }
	        Arrays.sort(a);
	        for(int i=a[a.length-1];i<=mul;i++)
	        {
	            int flag =0;
	            for(int j=0;j<a.length;j++)
	            {
	                if(i%a[j]==0)
	                {
	                   flag++;
	                }
	            }
	            if(flag==a.length)
	            {
	                System.out.print(i);
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        lc(a);
	    }

}
