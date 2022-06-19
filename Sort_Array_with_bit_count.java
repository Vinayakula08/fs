/*
Given an array, display the output in ascending order by the number of 1's in binary format of that number.
sort the elements in ascending order of frequency of 1's.

ex:
input =9
0 1 2 3 4 5 6 7 8 
output =0 1 2 4 8 3 5 6 7
explanation: 
0 is the only integer with 0 bits
1 2 4 8 all have 1 bits
3 5 6 all have 2 bits 
7 has 3 bits
so sorted array by bits is 0 1 2 4 8 3 5 6 7


input =11
1024 512 256 128 64 32 16 8 4 2 1
output =1 2 4 8 16 32 64 128 256 512 1024


*/
import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] bit = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            bit[i] = Integer.bitCount(a[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(bit[i]>bit[j]){
                    int temp = bit[i];
                    bit[i] = bit[j];
                    bit[j] = temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if(bit[i]==bit[j] && a[i]>a[j]){
                    int temp = bit[i];
                    bit[i] = bit[j];
                    bit[j] = temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i : a) System.out.print(i+" ");
    }
}
##with bit bitCount
import java.util.*;
 class Test{
     static void sortArrayFreq(int n,Integer[] a){
      
	  Arrays.sort(a,new Comparator<Integer>() {
				 @Override
				 public int compare(Integer n1,Integer n2){
					 if(Integer.bitCount(n1)==Integer.bitCount(n2))         return n1-n2;
					 else 
						 return Integer.bitCount(n1)-Integer.bitCount(n2);
				 }
			 });
      
		 for(int i=0;i<n;i++)
             System.out.print(a[i]+" ");
 
        }


     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         Integer[] arr=new Integer[num];
         for(int i=0;i<num;i++){
             arr[i]=sc.nextInt();
         }
         sortArrayFreq(num,arr);
     }
 }


//  ##wihout bitCount
//  import java.util.*;
//  class Test{
//     static Integer count1s(int n){
// 		 Integer ones=0;
// 		 while(n!=0)
// 	     {
// 		   ones += (n & 1);
// 		   n = n >> 1;
// 		 }
// 		 return ones;
		
// 	  }
// 	  static void sortArrayFreq(int n,Integer[] a){
//           int num_ones=0;
		  
// 	  Arrays.sort(a,new Comparator<Integer>() {
// 				 @Override
// 				 public int compare(Integer n1,Integer n2){
// 					 if(count1s(n1)==count1s(n2)) 
// 						 return n1-n2;
// 					 else 
// 						 return count1s(n1)-count1s(n2);
// 				 }
// 			 });
      
// 		 for(int i=0;i<n;i++)
//              System.out.print(a[i]+" ");
 
// 	  }


	 
	 
//      public static void main(String[] args){
//          Scanner sc=new Scanner(System.in);
//          int num=sc.nextInt();
//          Integer[] arr=new Integer[num];
//          for(int i=0;i<num;i++){
//              arr[i]=sc.nextInt();
//          }
//          sortArrayFreq(num,arr);
//      }
//  }



//  import java.util.*;
// class freqcomparator implements Comparator<Integer>
// {
// 	static Integer count1s(int n){
// 		 Integer ones=0;
// 		 while(n!=0)
// 	     {
// 		   ones += (n & 1);
// 		   n = n >> 1;
// 		 }
// 		 return ones;
//     }
	

//    @Override
// 	 public int compare(Integer n1,Integer n2){
// 		 if(count1s(n1)==count1s(n2)) 
// 			 return n1-n2;
// 		 else 
// 			 return count1s(n1)-count1s(n2);
// 		}
// }
//  class Test{
    
// 	static void sortArrayFreq(int n,Integer[] a){
//   	   int num_ones=0;
//         Arrays.sort(a,new freqcomparator());
//        for(int i=0;i<n;i++)
//              System.out.print(a[i]+" ");
// 	}

//      public static void main(String[] args){
//          Scanner sc=new Scanner(System.in);
//          int num=sc.nextInt();
//          Integer[] arr=new Integer[num];
//          for(int i=0;i<num;i++){
//              arr[i]=sc.nextInt();
//          }
//          sortArrayFreq(num,arr);
//      }
//  }