import java.util.*;
class Main{
    public static boolean isPrime(int n){
        if(n==1 || n==0) 
            return false;
        for(int i=2; i<n; i++){
            if(n%i==0) 
                return false;
        }
        return true;
    }
    public static int check(int n)
    {
        int count1=0;
        int count2=1;
        while(n>1)
        {
            count1=0;
            count2++;
            for(int i=1;i<=n;i++)
            {
                if(isPrime(i))
                    count1++;
            }
            n=n-count1;
        }
        return count2;
    }
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(check(n));
        sc.close();
    }
}