import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(result(s));
    }
    static long result(String s){
        long count = 0;
        int mod = (int)1e9+7;
        long sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                sum = (sum + count*(count+1)/2)%mod;
                count = 0;
            }
        }
        sum = (sum + count*(count+1)/2)%mod;
        System.out.println(sum);
        return sum;
    }
}