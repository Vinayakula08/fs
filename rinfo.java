import java.util.*;
class Main{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        TreeMap<Character,Integer> map = new TreeMap<>();
        TreeMap<Character,Integer> map1 = new TreeMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                if(map.containsKey(s.charAt(i)))
                {
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                else
                {
                    map.put(s.charAt(i),1);
                }
            }
            if(Character.isDigit(s.charAt(i)))
            {
                if(map1.containsKey(s.charAt(i)))
                {
                    map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
                }
                else
                {
                    map1.put(s.charAt(i),1);
                }
            }
        }
        int max=0;
        for(int i:map.values()){
            max=Math.max(max,i);
        }
        int max1=0;
        for(int i:map1.values()){
            max1=Math.max(max1,i);
        }
        int f = Math.abs(max - max1);
       Character ch = s.charAt(f);
        while(s.charAt(f)!=' ')
        {
            s.deleteCharAt(f);
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch && s.charAt(i)!=' ')
            {
                s.deleteCharAt(i);
            }
        }
        String str = "$";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                s.replace(i,i+1,str);
            }
        }
        System.out.print(s);
        sc.close();
    }
}