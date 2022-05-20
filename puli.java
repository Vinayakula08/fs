import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            A.add(sc.nextInt());
        }
        int M = sc.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=0;i<M;i++)
        {
            B.add(sc.nextInt());
        }
        System.out.print(result(N,A,M,B));
        sc.close();
    }
    public static int result(int N, ArrayList<Integer> A, int M, ArrayList<Integer> B)
    {
        ArrayList<Integer> l = new ArrayList<>();
        int sum = 0;
        int max = 0;
        for(int i=0;i<N;i++)
        {
            if(B.contains(A.get(i))){
                l.add(A.get(i));
                sum = sum + A.get(i);
                if(l.containsAll(B)){
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
    }
}