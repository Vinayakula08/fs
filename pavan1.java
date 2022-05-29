import java.util.*;
class GFG{
    static int gcd(int a,int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findSum(int N)
    {
    int count = 0;
    for (int i = 1; i < N; i++)
    {
        if (gcd(i, N) == 1)
        {
            count++;
        }
    }
    return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(findSum(N));
    }
}