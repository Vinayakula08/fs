import java.util.*;
import java.lang.Math;
class prac3{
	static TreeMap<String , Integer> m = new TreeMap<>();
	public static int palindromeStrings(String s) {
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			   for (int j = i+1; j < s.length(); j++) {
			         String k=s.substring(i,j+1);
			         List<String> li=pa(k);
			         Set<String> q=new HashSet<>();
			         for(int p=0;p<li.size();p++) {
			        	 System.out.println(li.get(p));
			        	 if(li.get(p).length()>1 && k.length()>=li.get(p).length() && k.indexOf(li.get(p))!=-1) {
			        		 System.out.print(li.get(p)+" "+k+" ");
			        		 q.add(k);
			        	 }
			         }
			         count+=q.size();
			   	  }
			  }
		return count;
	}
    static List<String> pa(String s)
    {
        int n = s.length();
        int[][] R = new int[2][n+1];
        s = "@" + s + "#";
      
        for (int j = 0; j <= 1; j++)
        {
            int rp = 0; 
            R[j][0] = 0;
      
            int i = 1;
            while (i <= n)
            {
                while (s.charAt(i - rp - 1) == s.charAt(i +
                                                j + rp))
                    rp++;
                R[j][i] = rp;
                int k = 1;
                while ((R[j][i - k] != rp - k) && (k < rp))
                {
                    R[j][i + k] = Math.min(R[j][i - k],
                                              rp - k);
                    k++;
                }
                rp = Math.max(rp - k,0);
                i += k;
            }
        }
        s = s.substring(1, s.length()-1);
        m.put(s.substring(0,1), 1);
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j <= 1; j++)
                for (int rp = R[j][i]; rp > 0; rp--)
                   m.put(s.substring(i - rp - 1,  i - rp - 1
                                       + 2 * rp + j), 1);
            m.put(s.substring(i, i + 1), 1);
        }
        List<String> l=new ArrayList<>(m.keySet());
        return l;
    }
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        int result=palindromeStrings(S);
        System.out.println(result);
        scan.close();
    }
}