/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid;
No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and
that digits are only for those repeat numbers, k.

For example, there won't be input like 3a or 2[4].

Example 1:
Input: 3[a]2[bc]
Output: aaabcbc

Example 2:
Input: 3[a2[c]]
Output: accaccacc


*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        // StringBuilder sb = new StringBuilder();
        // StringBuilder sb1 = new StringBuilder();
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)!='[' && s.charAt(i)!=']')
        //     {
        //         stack.push(s.charAt(i));
        //     }
        //     if(s.charAt(i)==']')
        //     {
        //         sb1.delete(0,sb.length());
        //         while(Character.isAlphabetic(stack.peek()))
        //         {
        //             sb1.append(stack.pop());
        //         }
        //        System.out.println(stack.peek());
        //         int x = (int)(stack.pop()-'0');
        //         System.out.println(sb);
        //         StringBuilder sb2 = new StringBuilder(sb);
        //         sb2.append(sb1);
        //         System.out.println(sb2);
        //         sb1 = new StringBuilder(sb2);
        //         for(int j=1;j<x;j++)
        //         {
        //             sb2.append(sb1);
        //         }
        //         System.out.println(sb2);
        //         sb2.reverse();
        //         sb = new StringBuilder();
        //         sb.append(sb2);
        //     }
        // }
        // System.out.println(sb);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c!='[' && c!=']')
            {
                stack.push(c);
            }
            if(c==']')
            {
                sb.delete(0, sb.length());
                while(Character.isAlphabetic(stack.peek()))
                {
                    sb.append(stack.pop());
                }
                StringBuilder sb1 = new StringBuilder(sb);
                String s2 ="";
                while(!stack.empty() && Character.isDigit(stack.peek()))
                {
                    s2 += stack.pop();
                }
                int x = Integer.parseInt(s2);
                for(int j=1;j<x;j++)
                {
                    sb.append(sb1);
                }
                sb.reverse();
                for(int k=0;k<sb.length();k++)
                {
                    stack.push(sb.charAt(k));
                }
                sb.delete(0, sb.length());
            }
        }
        sb.delete(0, sb.length());
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        System.out.print(sb.reverse());
    }
}
