import java.util.*;
class Main
{
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
	    int count2=0;
        int i = 1;
	    while(i<=n && n>1)
	    {
	        if(isPrime(i))
	        {
	            count1++;
	        }
	        if(i==n){
	            n=n-count1;
	            i=0;
	            count1=0;
	            count2++;
	        }
	        i++;
	    }
	  return count2+1;
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        System.out.print(check(n));
		sc.close();
    }
}