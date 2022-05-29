import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int[] psum = new int[n];
        int[] ssum = new int[n];
        ssum[n-1] = a[n-1];
        psum[0] = a[0];
        for(int i=1;i<n;i++)
        {
            psum[i] = Math.max(a[i],psum[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            ssum[i] = Math.max(ssum[i+1],a[i]);
        }
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            ans += Math.min(psum[i],ssum[i]) - a[i];
        }
        System.out.println(ans);
        sc.close();
    }
}