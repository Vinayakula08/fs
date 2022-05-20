import java.util.*;
class Main{
    public static void main(String[] args) {
        String s = "abc";
        permute("",s);
        System.out.println(l);
        System.out.println(permute("", s));
    }
    static ArrayList<String> l = new ArrayList<>();
    static ArrayList<String> permute(String p, String rem){
        if(rem.length()==0){
            ArrayList<String> ans = new ArrayList<>();
            l.add(p);
            System.out.println(p);
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            ans.addAll(permute(p.substring(0,i)+rem.charAt(0)+p.substring(i),rem.substring(1)));
        }
        return ans;
    }
}