import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    long sum =0,p=0;
	    int m = Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	        sum+=a[i];
	        if(a[i]>=0){
	            p+=a[i];
	            m = Math.min(m,a[i]);
	        }
	    }
	    if(p==sum){
	        System.out.println(sum-2*m);
	    }
	    else{
	        System.out.println(2*p-sum);
	    }
	}
}