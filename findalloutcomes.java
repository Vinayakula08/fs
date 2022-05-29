import java.util.*;
class Main{
    static int evaluate(char operator, int lhs, int rhs){
		if(operator == '*'){
			return lhs * rhs;
		}
		else if(operator == '+'){
			return lhs + rhs;
		}
		else{
			return lhs - rhs;
		}
	}
    	
	static List<Integer> findAllOutcomes(String s){
		List<Integer> l = new ArrayList<Integer>();
		boolean bool = true;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '-'){
				bool = false;
				List<Integer> left = findAllOutcomes(s.substring(0, i));
				List<Integer> right = findAllOutcomes(s.substring(i + 1));
				for(Integer a : left){
					for(Integer b : right){
						l.add(evaluate(s.charAt(i), a, b));
					}
				}
			}
		}
		if(bool){
			l.add(Integer.parseInt(s));
		}
		Collections.sort(l);
		return l;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        List<Integer> l = findAllOutcomes(s);
        for(Integer i : l){
            System.out.print(i + " ");
        }
	}
}