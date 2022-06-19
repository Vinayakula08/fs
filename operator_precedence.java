// In special MATHS where there is no rule of operator precedence. 
// All operators have equal precedence. 

// If + comes before * then + should perform before *.

// for given input 1-2*3 

// in general maths gives -5 as answer , but in special MATHS it is -3
// Evaluate the given string 

// string has only numbers (1 to 9) , operators(+,-,*,/)
// Between every number there will be a operator

// input =1-2*3
// output =-3

// input =
// 1+2-3*4
// // output =0
// import java.util.*;
// public class Main{
//     static int result(String s){
//         int sum1=0,sum2=0,i=0,n=s.length(),sign=1;
//         while(i<n){
//             char ch=s.charAt(i);
//             if(Character.isDigit(ch)){
//                 while(i<n && Character.isDigit(s.charAt(i))){
//                     sum2=sum2*10 + s.charAt(i)-'0';
//                     i++;
//                 }
//                 if(sign==1) sum1+=sum2;
//                 else if(sign==2) sum1-=sum2;
//                 else if(sign==3) sum1*=sum2;
//                 else sum1/=sum2;
//                 sum2=0;continue;
//             }
//             if(ch=='+') sign=1;
//             if(ch=='-') sign=2;
//             if(ch=='*') sign=3;
//             if(ch=='/') sign=4;
//             i++;
//         }
//         return sum1;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         System.out.print(result(s));
//     }
// }


import java.util.*;
class Main{
    static String calc(String a, String b,char ch){
        if(ch=='-'){
            return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
        }
        if(ch=='+'){
            return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
        }
        if(ch=='*'){
            return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
        }
        if(ch=='/'){
            return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
        }
        return "0";
    }
    static char ch;
    static int result(String s){
        String a = "";
        String b = "";
        int temp = 0;
        for(int i=0;i<s.length();){
            while(i<s.length() && Character.isDigit(s.charAt(i)) && temp==0 && i<s.length()){
                a += s.charAt(i);
                i++;
            }
            temp++;
            if(!Character.isDigit(s.charAt(i))){
                ch = s.charAt(i);
                i++;
            }
            while(i<s.length() && Character.isDigit(s.charAt(i)) && a.length()>0){
                b += s.charAt(i);
                i++;
            }
            a = calc(a,b,ch);
            b = "";
        }
        return Integer.parseInt(a);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(result(s));
    }
}