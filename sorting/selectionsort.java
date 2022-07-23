package sorting;
import java.util.*;
class Main {
	static void selectionSort(int n, int[] a){
        for(int i=0;i<n;i++){
            int min = a[i];
            int temp = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<min){
                    min = a[j];
                    temp = j;
                }
            }
            a[temp] = a[i];
            System.out.println(temp+" "+min);
            a[i] = min;
            System.out.println(Arrays.toString(a));
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		selectionSort(n,a);
		sc.close();
	}
}