import java.util.*;
class Main{
    static String res(int n)
    {
        if(n==1) return "1";
        String k = res(n-1);
        int count = 1;
        String r = "";
        for(int i=0;i<k.length()-1;i++)
        {
            if(k.charAt(i)==k.charAt(i+1))
                count++;
            else{
                r += Integer.toString(count);
                r += k.charAt(i);
                count = 1;
            }
        }
        r += Integer.toString(count);
        r += k.charAt(k.length()-1);
        return r;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(res(n));
    }
}