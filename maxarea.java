/*
Find Maximum are for given sequence of plots
In a layout of plots, all plots are having equal width, which is 10 meters, but these

plots varies in length For a given sequence of plots lengths, you need find what is maximum
rectangle area you can make ?

Example


Max Area is 4*10*20 = 800 sq meters

input =30 40 25 20
output =800

input =20 20 20 60 10 50 40 20 20 20 20
utput
1200
*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int[] a=new int[str.length];
        for(int i=0;i<str.length;i++) {
        	a[i]=Integer.parseInt(str[i]);
        }
        System.out.println(maxarea(a));
    }
	static int maxarea(int[] a) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			int min=(int)1e9;
			for(int j=i;j<a.length;j++) {
				min=Math.min(min,a[j]);
				max=Math.max(max,(j-i+1)*min*10);
			}
		}
		return max;
	}
}