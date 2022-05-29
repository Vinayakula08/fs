/*Tinku a Second Class Student is given a Phrase which contains few words in {}
His teacher marked all dificult words in the { }. 
His teacher gave him the meaning to the difficult words 
he was asked to replaced the difficult words in the { } with the meanings given to him. 

if the difficult word doesnt exist print ?

The first line of input contains the phrase followed by difficult words 
Each difficult words is given by a name followed by meaning (n difficult words)


input={name}isa{gender}
name ajay gender boy
output=ajayisaboy


input={name}is{age}yearsold
name bob age two
output=bobistwoyearsold


input=hi{name}
a b
output=hi?
*/
import java.util.*;
class Main{
    public static StringBuilder result(String s1, String s2)
    {
        String[]a = s2.split(" ");
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<a.length;i=i+2)
        {
            map.put(a[i],a[i+1]);
        }
        
        ArrayList<StringBuilder> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='}')
            {
                sb.deleteCharAt(0);
                System.out.println(sb);
                l.add(sb);
                sb.delete(0,sb.length());
                x = 0;
            }
            if(s1.charAt(i)=='{' || x>0)
            {
                sb.append(s1.charAt(i));
                x++;
            }
        }
        System.out.println(l);
        return sb;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(result(s1,s2));
        sc.close();
    }
}
