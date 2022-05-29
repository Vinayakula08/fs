import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        int c = 0;
        while(d>0)
        {
            int t = Collections.max(l);
            if(t==0) break;
            int x = l.indexOf(t);
            d = d-l.get(x);
            l.set(x,l.get(x)/2);
            c++;
        }
        if(c<=k && d<=0) System.out.println(c);
        else System.out.println(-1);
        sc.close();
    }
}