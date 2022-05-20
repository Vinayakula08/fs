/*
write a  java program to count the GrandChild/Child for given name 

Assume the relations here limit only to child and grandChild only 
all the inputs will be given in lower case characters(a-z) and are valid relations 

the first line of input consists of number of relations followed by child name and fathers name seperated by ',' 
followed by a name. 



Where the first string is "Child", second string is "Father".
If the given name is Father print the count of his children
If the given name is GrandFather print the count of his GrandChildren

Print -1 for any other boundary conditions 

for given input like this

input =
5
kishore,ramesh
dev,gopal
gopal,ramu
srinu,gopal
praveen,ranjit
ramu
output = 2

And given input "ramu" we have to find his no of grandchildren/child
Here "ramu" has one direct child gopal and gopal has 2 children(dev,srinu).
So ramu has 2 grand children dev,srinu. so output is 2

example:2 

input =
5
ranjit,knr
ramesh,pradeep
kittu,ranjit
yogesh,ranjit
praveen,ranjit
knr
output=
3

//given data for knr we need print the count of grand children . 
here knr direct child is ranjit and ranjit has three children   ---- kittu,yogesh,praveen so print 3


input = 
8
a,b
c,b
d,b
f,a
g,a
e,a
m,c
z,d
b
output =
5

*/
import java.util.*;
class Main{
    static void result(int n, String[] sa, String st)
    {
        String[][] s = new String[n][2];
        for(int i=0;i<n;i++)
        {
            String[] a = sa[i].split(",");
            s[i][0] = a[1];
            s[i][1] = a[0];
        }
        ArrayList<String> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(s[i][0].equals(st))
            {
                l.add(s[i][1]);
            }
        }
        int c = 0;
        for(int i=0;i<l.size();i++)
        {
            for(int j=0;j<n;j++)
            {
                if(l.get(i).equals(s[j][0]))
                {
                    c++;
                }
            }
        }
        if(c==0)
        {
            System.out.print(l.size());
        }
        else
        {
            System.out.print(c);
        }    
    }
    public static void main(String[] ars)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sa = new String[n];
        for(int i=0;i<n;i++)
        {
            sa[i] = sc.next();
        } 
        String st = sc.next();
        result(n,sa,st);
    }
}