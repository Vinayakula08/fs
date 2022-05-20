import java.util.*;
class Main {
    static int n1 ;
    public static int reverse(int n) {
        if(n==0) return n1;
        n1 = n1*10 + n%10;
        reverse(n/10);
        return n1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(reverse(n));
    }
}
