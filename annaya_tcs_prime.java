import java.util.*;
class annaya_tcs_prime
{
    public static int gcd(int a, int b) 
    { 
        return b == 0? a:gcd(b, a % b);    
    }
    public static int lcm(int[] arr, int i)
    {
        if (i == arr.length - 1){
        return arr[i];
        }
        int a = arr[i];
        int b = lcm(arr, i+1);
        return (a*b/gcd(a,b)); 
    }
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] a = s.split(" ");
        int[] a1 = new int[a.length];
        int[] a2 = new int[a.length-1];
        for(int i=0;i<a.length;i++)
        {
            a1[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(a1);
        for(int i=0;i<a.length-1;i++)
        {
            a2[i] = a1[i+1];
        }
        int q = a1[0];
        int lc = lcm(a2, 0);
        int i = 1;
        if((lc+q)%2==0)
        {
            System.out.print("None");
            return;
        }
        while(true)
        {
            if(isPrime(i*(lc)+q))
            {
                System.out.print(i*(lc)+q);
                break;
            }
            if(Integer.MAX_VALUE-i*(lc)+q<1000)
            {
                System.out.print("None");
                break;
            }
            i++;
        }
    }
}