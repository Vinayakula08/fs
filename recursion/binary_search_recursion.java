import java.util.*;
class Main{
    public static int binarysearch(int st, int end, int[] a, int k)
    {
        if(end<st) return -1;
        int mid = st + (end-st)/2;
        if(a[mid]==k) return mid;
        else if(a[mid]>k) return binarysearch(st,mid-1,a,k);
        else return binarysearch(mid+1,end,a,k);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(binarysearch(0,n-1,a,k));
        sc.close();
    }
}