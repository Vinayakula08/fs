import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        /*ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i%k==0)
            {
                Collections.reverse(l2);
                if(l2.size()>=k) { for(int j=0;j<k;j++) l1.add(l2.get(j)); }
            }
            l2.add(a[i]);
        }
        Collections.reverse(l2);
        l1.addAll(l2);
        l2.clear();
        for(int i=0;i<n;i++)
                System.out.print(l1.get(i)+" ");*/
        int[] b = new int[n];
        int t = 0;
        for(int i=0;i<n;i++)
        {
            if(i%k==0)
            {
                if(t>=k) {
                     for(int j=t-1;j>=t-k;j--) System.out.print(b[j]+" "); 
                    }
            }
            t++;
            b[i] = a[i];
        }
        for(int j=n-1;j>t-k+1;j--) System.out.print(b[j]+" "); 
        sc.close();
    }
}