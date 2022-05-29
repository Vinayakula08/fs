import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    ArrayList<String> l = new ArrayList<>();
	    while(n-->0){
	        String s1 = sc.next();
	        String s2 = sc.next();
	        int flag = 0;
	        for(int i=0;i<s1.length();i++){
	            if(s1.charAt(i)==s2.charAt(i)){
	                flag++;
	                continue;
	            }
	            else if(s1.charAt(i)=='*' || s2.charAt(i)=='*'){
	                flag++;
	                continue;
	            }
	            else{
	                l.add("NO");
	                break;
	            }
	        }
	        if(flag==s1.length())
	            l.add("YES");
	    }
	    for(String s : l){
	        System.out.println(s);
	    }
	}
}