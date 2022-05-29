import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> l = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                l.add(s.charAt(i));
            }
            if(Character.isDigit(s.charAt(i)))
            {
                sum += (int)(s.charAt(i)-'0');
            }
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++) System.out.print(l.get(i));
        System.out.print(sum);
        sc.close();
    }
}