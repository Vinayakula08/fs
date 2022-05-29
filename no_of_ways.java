import java.util.*;
class Main{
    static int count;
    public static boolean result(int n)
    {
        if(n==0) 
        {
            count++;
        }
        System.out.println(n);
        if(n<3) return false;
        return result(n-10) || result(n-5) || result(n-3);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(result(n));
        System.out.println(count);
    }
}