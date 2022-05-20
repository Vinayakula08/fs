//BAABA
//2 4 1 1 2
//2 4


//ABAB
//10 5 10 5
//0 15
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int A= 0;
        int B= 0;
        int min1 = 0;
        int min2 = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='A')
            {
                A = A+a[i];
                B=B - a[i];
                min2 = Math.min(min2,B);
            }
            if(s.charAt(i)=='B')
            {
                B = B+a[i];
                A = A - a[i];
                min1 = Math.min(min1,A);
            }
        }
        System.out.print(Math.abs(min1)+" "+Math.abs(min2));
    }
}