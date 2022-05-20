package FS;
import java.util.*;
public class Fs_Day_14_Program_1 {
	
		static void differentFlagPermutations(int X,
		                               String[] arr,String s)
		{
		    String[] ml = arr;

		    Vector<String> t = new Vector<String>();
		    for(int i = 0; i < ml.length; i++)
		    {
		    	if(s.contains(ml[i]))
		    		t.add(ml[i]);
		    }
		    int count = ml.length;
		    for(int z = 0; z < X - 1; z++)
		    {
		        Vector<String> tmp = new Vector<String>();
		        for(int i = 0; i < arr.length; i++)
		        {
		            for(int k = 0; k < ml.length; k++)
		            {
		                if (arr[i] != ml[k])
		                {
		                    tmp.add(ml[k] + arr[i]);
		                    count += 1;
		                }
		            }
		        }    
		        for(int i = 0; i < tmp.size(); i++)
		        {
		        	if(s.contains(tmp.get(i)))
		        		t.add(tmp.get(i));
		        }
		        ml = tmp.toArray(new String[tmp.size()]);;
		    }
		    int c = 0;
		    StringBuilder str = new StringBuilder();
		    
		    for(int i=0;i<t.size();i++)
		    {
		    	for(int j=i;j<t.size();j++)
		    	{
		    		str.append(t.get(j));
		    	}
		    }
		    System.out.println(t);
		}
		public static void main(String[] args)
		{
		    Scanner sc = new Scanner(System.in);
		    String s = sc.next();
		    char c[] = s.toCharArray();
		    String[] arr = new String[c.length];
		    for(int i=0;i<c.length;i++)
		    {
		    	arr[i] = Character.toString(c[i]);
		    }
		    int X = 2;     
		    differentFlagPermutations(X, arr,s);  
		}

}
