// import java.util.*;
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(result(s));
        sc.close();
    }
    /*public static int result(String s)
    {
        String[] a = s.split(" ");int n = a.length;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++) l.add(Integer.parseInt(a[i]));
        while(l.size()>1)
        {
            Collections.sort(l);
            if(l.get(l.size()-1)==l.get(l.size()-2)){
                l.remove(l.size()-1);
                l.remove(l.size()-1);
            }
            else{
                l.add(0,l.get(l.size()-1)-l.get(l.size()-2));
                l.remove(l.size()-1);
                l.remove(l.size()-1);
            }     
        }
        if(l.size()>0) return l.get(0);
        return 0;
    }*/
    public static int result(String s)
    {
        String[] a = s.split(" ");int n = a.length;
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){ p.offer(Integer.parseInt(a[i])); System.out.println(p);}
        while(p.size()>1)
        {
            int x = p.poll();
            int y = p.poll();
            if(x!=y) p.offer(x-y);
        }
        if(p.size()==1) return p.poll();
        return 0;
    }
}