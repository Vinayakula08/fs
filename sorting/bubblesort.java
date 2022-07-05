import java.util.*;
class Main
{
    static void bubbleSort(int n, int[] a){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	    }
	    bubbleSort(n,a);
		System.out.println(Arrays.toString(a));
        sc.close();
	}
}