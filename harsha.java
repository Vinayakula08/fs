import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        String[] a = new String[m];
        for(int i=0;i<m;i++)
        {
            a[i] = sc.nextLine();
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            String[] s = a[i].split(",");
            if(i%2==0)
            {
                for(int j=0;j<s.length;j++)
                {
                    l.add(Integer.parseInt(s[j]));
                }
            }
            if(i%2!=0)
            {
                for(int j=s.length-1;j>=0;j--)
                {
                    l.add(Integer.parseInt(s[j]));
                }
            }
        }
        int max = -1;
        int sum = 0;
        for(int i=0;i<l.size();i++)
        {
            sum = sum+l.get(i);
            double x = Math.sqrt(sum);
            if(x==Math.ceil(x))
            {
                max = Math.max(max,sum);
                sum = 0;
            }
        }
        System.out.println(max);
        sc.close();
    }
}