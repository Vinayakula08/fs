import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int k = sc.nextInt();
        System.out.println(sumofsubset(0,n,a,sum,k,new ArrayList<>()));
        System.out.println(l1);
        System.out.println(count);
    }
    static int count;
    static List<List<Integer>> l1 = new ArrayList<>();
    static ArrayList<Integer> sumofsubset(int csum, int n, int[] a, int sum,int k,ArrayList<Integer> l2){
        if(csum==k){
            count++;
            return l2;
        }
        if(csum<=k && sum>=k && a.length>0){
            ArrayList<Integer> l4 = new ArrayList<>(l2);
            l4.add(a[0]);
            ArrayList<Integer> left = sumofsubset(csum+a[0], n, Arrays.copyOfRange(a, 1, a.length), sum-a[0], k,l4);
            if(left.size()>0) l1.add(left);
            ArrayList<Integer> right = sumofsubset(csum, n, Arrays.copyOfRange(a, 1, a.length), sum-a[0], k,new ArrayList<>(l2));
            if(right.size()>0) l1.add(right);
        }
        return new ArrayList<Integer>();
    }
}