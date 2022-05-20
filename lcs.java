import java.util.*;
class Solution {
    public int lcs(String s1, String s2) {
        if(s1.length()>0 && s2.length()>0){
        if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1))
            return 1+lcs(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1));
        return Math.max(lcs(s1.substring(0,s1.length()-1),s2.substring(0,s2.length())),lcs(s1.substring(0,s1.length()),s2.substring(0,s2.length()-1)));
        }
        return 0;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Solution s = new Solution();
        System.out.println(s.lcs(s1,s2));
        sc.close();
    }
}