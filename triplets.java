import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(result(k,a));
    }
    static int count;
    static int result(int k, int[] a){
        if(a.length>2 && Arrays.binarySearch(a,a[0]+k)>0 && Arrays.binarySearch(Arrays.copyOfRange(a,Arrays.binarySearch(a,a[0]+k),a.length),a[0]+2*k)>0){
            count++;
        }
        //if(a.length>2 && contains(a,a[0]+k)>0 && contains(Arrays.copyOfRange(a,contains(a,a[0]+k),a.length),a[0]+2*k)>0) count++;
        if(a.length>2) result(k,Arrays.copyOfRange(a,1,a.length));
        return count;
    }
   /* static int contains(int[] a, int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k) return i;
        }
        return -1;
    }*/
}