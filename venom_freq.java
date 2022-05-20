import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        arrange(s);
    }
    static void arrange(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        s="";int i=0;
        List<Integer> freq=new ArrayList<>(map.values());
        List<String> l=new ArrayList<>();
        for(char ch:map.keySet()){
            for(int j=0;j<freq.get(i);j++)
                s+=ch;
            priority(l,s);
            s = "";
            i++;
        }
        for(String s1 : l)
            System.out.print(s1);
    }
    static void priority(List<String> l,String k){
        if(l.isEmpty()){
            l.add(k);return;
        }
        int i=0;
        while(i<=l.size()-1 && k.length()<=l.get(i).length())
            i++;
        l.add(i,k);
    }
}