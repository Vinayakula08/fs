/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Main
{
    static ArrayList<Integer> l = new ArrayList<>();
    static void result(int[][] a,int m, int n, int sum){
        if(m==0){
            l.add(sum);
            return;
        }
        int a1 = 0;
        int b = 0;
        int c = n-1;
        while(m-->0){
            while(a1<a.length && b<a[a1].length && c>=0){
                
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[][] a = new int[n][];
	     for(int i=0;i<n;i++){
	        a[i] = new int[sc.nextInt()];
	        for(int j=0;j<a[i].length;j++){
	            a[i][j] = sc.nextInt();
	        }
	   }
	   // Set<Integer> max = new TreeSet<Integer>();
	   // for(int i=0;i<n;i++){
	   //     int k = a[i].length;
	   //     for(int j=0;j<k;j++){
	   //         max.add(a[i][j]);
	   //     }
	   // }
	    
	   // System.out.println(max);
	    for(int i=0;i<n;i++){
	        for(int j=0;j<a[i].length;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
