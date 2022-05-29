import java.util.*;
class Main{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static boolean sprime(int n)
    {
        String s = Integer.toString(n);
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
            sum += (int)(s.charAt(i)-'0');
        }
        return isPrime(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a<=2)
        {
            a = 2;
        }
        if(a==2) 
        {
            System.out.print(a+" ");
            a+=1;
        }
        if(a%2==0) a+=1;
        for(int i=a;i<=b;i+=2)
        {
            if(isPrime(i) && sprime(i))
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}