import java.util.*;
 
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(n,arr));
    }
 
    static int maxSubArraySum(int input1, int input2[])
    {
        int max1 = Integer.MIN_VALUE, max = 0;
 
        for (int i = 0; i < input1; i++)
        {
            max = max + input2[i];
            if (max1 < max)
                max1 = max;
            if (max < 0)
                max = 0;
        }
        return max1;
    }
}