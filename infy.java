import java.util.*;
class Main{
    static int calculateXorvalue(int n, String str, int m, List<List<Integer>> l)
    {
        ArrayList<Integer> l3 = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<m;i++)
        {
            HashSet<Character> set = new HashSet<>();
            int x = l.get(i).get(0);
            if(x==2)
            {
                int y = l.get(i).get(1);
                int z = l.get(i).get(2);
                String s = "";
                if(z>=n)
                {
                    s = s + sb.substring(y-1,n).toString();
                }
                else{
                    s = s + sb.substring(y-1,z).toString();
                }
                for(int j=0;j<s.length();j++)
                {
                    set.add(s.charAt(j));
                }
                l3.add(set.size());
                set.clear();
            }
            if(x==1)
            {
                int y = l.get(i).get(1);
                int z = l.get(i).get(2);
                sb.setCharAt(y-1, (char)(97+(z%26)));
            }
        }
        int f = l3.get(0);
        for(int i=1;i<l3.size();i++)
        {
            f = f^l3.get(i);
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int m = sc.nextInt();
        List<List<Integer>> l = new ArrayList<>(m);
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> l1 = new ArrayList<>();
            for(int j=0;j<3;j++)
            {
                l1.add(sc.nextInt());
            }
            l.add(l1);
        }
        System.out.print(calculateXorvalue(n,str,m,l));
    }
}