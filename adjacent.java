/*abstract
kapoor's have brought a tiny kitten in their house. Everybody is excited to give her a name.
but Mr.kapoor has a condition for the name ie there should be no duplicate adjacent character in the name.
but relatives were not aware of this condition and they have already sent some names.

Now your task is to minimize the given name according to the condition so that it can be accepted by mr.kapoor.

example: 
input =cherreis
output =chis

in cherreis first rr is removed, now the string is cheeis again 2 duplicate e's are coming, so after removing it output is chis, which can't be minimized further.

if final output is empty return -1.

*/
import java.util.*;
class Main{
    static char c;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(st.empty()){
                st.push(ch);
                continue;
            }
            if(!st.empty() && st.peek()==ch){
                st.pop();
                continue;
            }
            if(st.peek()!=ch && ch!=c){
                st.push(ch);
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.insert(0,st.pop());
        }
        if(sb.length()==0){
            System.out.println(-1);
            return;
        
        }
        System.out.println(sb);
    }
}