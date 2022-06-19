import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(sc.next());
        Stack<Character> st = new Stack<>();
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(!st.empty() && st.peek()==ch){
                st.pop();
                continue;
            }
            else{
                st.push(ch);
            }
        }
        sb = new StringBuilder();
        while(!st.empty()){
            sb.insert(0, st.pop());
        }
        if(sb.length()==0){
            System.out.println("NO BLOCK");
            return;
        } 
        System.out.println(sb);
    }
}