import java.util.*;
class SortString
{
	 public static String sortString(String s) 
	  { 
        int len = s.length();
        int[] freq = new int[26];
        for (int index = 0; index < len; index++) 
            freq[s.charAt(index) - 'a']++;
        
        StringBuilder sb = new StringBuilder(len);
        int count = 0;
        while (count < len) {
            // sorting up
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                }
            }
            // sorting down
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                }
            }
        }
        return sb.toString();
    }


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
		System.out.println(sortString(s));
        sc.close();
	}
}