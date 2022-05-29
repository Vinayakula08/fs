import java.util.*;
class Main {

    static int lis(int input2[], int input1)
    {
        int lis[] = new int[input1];
        int i, j, max = 0;
        for (i = 0; i < input1; i++)
            lis[i] = 1;
        for (i = 1; i < input1; i++)
            for (j = 0; j < i; j++)
                if (input2[i] > input2[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
        for (i = 0; i < input1; i++)
            if (max < lis[i])
                max = lis[i];
        return max;
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(lis(arr, n));
    }
}