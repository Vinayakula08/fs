import java.util.*;
class Main {
    public static int result(int[] a, int n)
    {
        Arrays.sort(a);
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (a[l] + a[r] > a[i]) {
                    count += r - l;
                    r--;
                }
                else 
                {
                    l++;
                }
            }
        }
        return count;
    }
    static int result(int arr[],int n)
    {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n - 2; ++i) {
            int k = i + 2;
            for (int j = i + 1; j < n; ++j) {
                while (k < n && arr[i] + arr[j] > arr[k])
                {
                    ++k;
                }
                if (k > j){
                    count += k - j - 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        //System.out.println(result(a,n));
        System.out.println(findNumberOfTriangles(a,n));
    }
}