import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]  = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<a[i])
            {
                max1 = max;
                max = a[i];
            }
            else if(a[i]>max1 && a[i]!=max){
                max1 = a[i];
            }
        }
        System.out.println(max1);
        sc.close();
    }
}