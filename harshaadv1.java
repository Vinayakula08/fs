import java.util.*;
class Main{
    public static List<String> siblingStrings(int n, List<String> A)
    {
        ArrayList<String> l = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(i==0)
            {
                l.add("-1");
                l1.add(A.get(i));
            }
            else if(i==1)
            {
                l.add(A.get(0));
                l1.add(A.get(i));
            }
            else
            {
                Collections.sort(l1);
                l.add(l1.get(0));
                l1.add(A.get(i));
            }
        }
        return l;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> A = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            A.add(sc.next());
        }
        System.out.print(siblingStrings(n,A));
    }
}