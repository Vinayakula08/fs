import java.util.*;
class Main
{
    public static StringBuilder result(int n,int[][] a, int k)
    {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n-k+1; i++)
        {
            for (int j = 0; j < n-k+1; j++)
            {
                int sum = 0;
                for (int x = i; x < k+i; x++)
                {
                    for (int y = j; y < k+j; y++)
                    {
                        sum = sum + a[x][y];
                    }
                }
                if(sum!=0)
                {
                    l.add(sum);
                }
            }
        }
        Collections.sort(l);
        int min = l.get(0);
        int max = l.get(l.size()-1);
        StringBuilder sb = new StringBuilder();
        if(min==max)
        {
            sb.append(min);
        }
        else
        {
            sb.append(min);
            sb.append(":");
            sb.append(max);
        }
        return sb;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        int a[][] = new int[n][n];
        String s[] = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            String[] s1 = s[i].split(",");
            for(int j=0;j<n;j++)
            {
                a[i][j] = Integer.parseInt(s1[j]);
            }
        }
        System.out.print(result(n,a, k));
        sc.close();
    }
}