/*

Three Friends are given three rows of the keyboard, The first row is given to Shyam,second row is given to gopal, third row is given to ramu. 

Teacher has given them few lines of words and asked each individual if they can print the words that can be printed using the letters of the rows given to them 

Shyam has given the row -   QWERTYUIOP/qwertyuiop
Gopal has given the row -    ASDFGHIJKL/asdfghjkl
Ramu has given the row -   ZXCVBNM/zxcvbnm

Teacher also gave the following rules in addition ;
    You may use one character in the row more than once.
    You may assume the input string will only contain letters of alphabet(A-Z/a-z).
    Assume the alphabets are case sensitive 

    Print -1 for all Boundary Conditions 

Example:

input =hello Alaska Dad Peace
output = 
Alaska 
Dad


Here the words Alaska and Dad are the characters of second student gopal only 


input =asdf qwer zxcv
output =
asdf
qwer
zxcv

input =Dad hAS the Key
output = Dad
hAS

input =to be or not TO be 
output = to
or
TO


*/
import java.util.*;
class Main
{
    static void result(String s)
    {
        String s1 = "QWERTYUIOPqwertyuiop";
        String s2 = "ASDFGHIJKLasdfghjkl";
        String s3 =  "ZXCVBNMzxcvbnm";
        ArrayList<String> l = new ArrayList<>();
        List<Character> c1 = new ArrayList<>();
        for (char ch : s1.toCharArray()) 
            c1.add(ch);
        List<Character> c2 = new ArrayList<>();
        for (char ch : s2.toCharArray()) 
            c2.add(ch);
        List<Character> c3 = new ArrayList<>();
        for (char ch : s3.toCharArray()) 
            c3.add(ch);
        String[] a = s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            int c = 0;
            if(c1.contains(a[i].charAt(0)))
                for(int j=0;j<a[i].length();j++)
                {
                    if(c1.contains(a[i].charAt(j)))
                        c++;
                }
            else if(c2.contains(a[i].charAt(0)))
                for(int j=0;j<a[i].length();j++)
                {
                    if(c2.contains(a[i].charAt(j)))
                        c++;
                }
            else if(c3.contains(a[i].charAt(0)))
                for(int j=0;j<a[i].length();j++)
                {
                    if(c3.contains(a[i].charAt(j)))
                        c++;
                }
            if(c==a[i].length())
                l.add(a[i]);
        }
        if(l.size()==0)
            System.out.print(-1);
        else
            for(int i=0;i<l.size();i++)
                System.out.println(l.get(i));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        result(s);
    }
}