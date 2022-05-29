import java.util.*;
import java.lang.*;
import java.math.*;
class Main{
    /*
    static void result(int N, int X)
    {
        StringBuilder sb = new StringBuilder("1");
        for(int i=0;i<N-1;i++)
            sb.append("0");
        StringBuilder sb1 = new StringBuilder("1");
        for(int i=0;i<N;i++)
            sb1.append("0");
        BigInteger b1 = new BigInteger(sb1.toString());
        BigInteger x = new BigInteger("1");
        int k=0;
        for(BigInteger i=new BigInteger(sb.toString());i.compareTo(b1)<0;i = i.add(x))
        {
            StringBuilder s = new StringBuilder(i.toString());
            k=0;
            for(BigInteger j=BigInteger.valueOf(0);j.compareTo(BigInteger.valueOf(s.length()-1))<0;j=j.add(x))
            {

                int a = (int)(s.charAt(j.intValue())-'0');
                int b3 = (int)(s.charAt(j.intValue()+1)-'0');
                if(Math.abs(a-b3)==X)
                {
                    k++;
                }
            }
            if(k==s.length()-1)
            {
                System.out.print(s+" ");
            }
        }
    }*/
    public static void check(int n, int i, int k, ArrayList<Integer> l)
    {
        if(n==0)
        {
            l.add(i);
            return;
        }
        int ld = i%10;
        if(ld+k<10)
            check(n-1,i*10+ld+k,k,l);
        if(ld-k>=0)
            check(n-1,i*10+ld-k,k,l);
    }
    public static void result(int N,int X)
    {
        if(N==1) 
        {
            for(int i=0;i<10;i++) System.out.print(i+" ");
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<10;i++)
            check(N-1,i,X,l);
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        result(N,X);
    }
}