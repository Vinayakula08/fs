import java.util.*;

class Main{
    public static void main(String[] args) {
        String s = "abc";
        subset("",s);
        System.out.println(subsetwithlist("",s));
    }
    static void subset(String p, String rem){
        if(rem.length()==0){
            System.out.println(p);
            return;
        }
        subset(p+rem.charAt(0),rem.substring(1));
        subset(p,rem.substring(1));
    }
    static List<String> subsetwithlist(String p, String rem){
        if(rem.length()==0){
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        List<String> left = subsetwithlist(p+rem.charAt(0),rem.substring(1));
        List<String> right = subsetwithlist(p,rem.substring(1));
        left.addAll(right);
        return left;
    }
}