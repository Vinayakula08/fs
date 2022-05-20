import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] itemheight = new int[n];
        int[] roomheight = new int[k];
        for(int i=0;i<n;i++) itemheight[i] = sc.nextInt();
        for(int i=0;i<k;i++) roomheight[i] = sc.nextInt();
        System.out.println(result(n,k,itemheight,roomheight));
    }
    public static int result(int n, int k, int[] itemheight, int[] roomheight)
    {
        int[] pmin = new int[k];
        int[] smin = new int[k];
        pmin[0] = roomheight[0];
        smin[k-1] = roomheight[k-1];
        for(int i=1;i<k;i++)
            pmin[i] = Math.min(pmin[i-1],roomheight[i]);
        for(int i=k-2;i>=0;i--)
            smin[i] = Math.min(smin[i+1],roomheight[i]);
        Arrays.sort(itemheight);
        int count = 0;
        int[] ps = new int[k];
        for(int i=0;i<k;i++)
            ps[i] = Math.max(pmin[i],smin[i]);
        int x = 0;
        for(int i=0;i<k;i++){
            if(x<n && itemheight[j]<=ps[i]){
                count++;x++;
            }
        }
        return count;
    }
}