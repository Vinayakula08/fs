import java.util.*;
import java.io.*;
class Main{
  static int maxSumFlip(int ar[], int n)
  {
    int total_sum = 0;
    for (int i = 0 ; i < n ; i++){
      total_sum += ar[i];
    }
    int b = 0;
    int a = Integer.MAX_VALUE;
    for (int i = 0 ; i < n ; i++){
        b += ar[i];
        if(a > b){
            a = b;
        }
        if(b > 0){
            b = 0;
        }
        System.out.println(a+" "+b);
    }
    return Math.max(total_sum, total_sum - 2*a);
  }
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
      }
      System.out.println(maxSumFlip(arr, n));
  }
}
