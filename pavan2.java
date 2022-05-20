import java.util.*;
class Main
{
    public static int flip(int a[], int n)
    {
        int total = 0;
        for (int i = 0; i < n; i++)
            total += a[i];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            int sum = 0;
            for (int j = i; j < n; j++)
            {
                sum += a[j];
                max = Math.max(max, total - 2 * sum);
            }
        }
        return Math.max(max, total);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
        System.out.println(flip(arr, N));
    }
}