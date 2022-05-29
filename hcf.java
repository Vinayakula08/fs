import java.util.*;
public class hcf {
	public static void hc(int n,int[] a)
    {
        Arrays.sort(a);
        for(int i = a[0];i>=1;i--)
        {
            int flag = 0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%i==0)
                {
                    flag++;
                }
            }
            if(flag==n)
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
        hc(n,a);
    }

}
