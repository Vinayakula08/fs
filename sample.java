import java.util.*;
import java.math.BigInteger;
class Main{
    public static BigInteger  fact(BigInteger n) {
        BigInteger b = new BigInteger("0");
         BigInteger b1 = new BigInteger("1");
        if(b.equals(n))
        {
            return b1;
        }
        else
        {
            return n.multiply(fact(n.subtract(b1)));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for(int i=0;i<=n1;i++)
        {
            BigInteger h = new BigInteger(Integer.toString(i));
            BigInteger n = new BigInteger(Integer.toString(n1));
            System.out.print(fact(n).divide((fact(n.subtract(h)).multiply(fact(h))))+" ");
        }
        sc.close();
    }
}