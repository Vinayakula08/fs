/*Ramu is given an group of scores and a special number k, 
Now his teacher asked him to find the pairs(a,b) where a<b such that
scores[a]-scores[b]==k. 
The absolute diff should be equal to k 

If no such pairs exists print 0
The first line of input contains the size of the scores followed by the scores followed by a special number k 

input =4
4 5 5 4
1
the pairs which match the above condition
[4 5 5 4]
The pairs are as follows 
[4 5]
[4 5]
[5 4]
[5 4]


input = 5
4 3 2 6 5
2
output = 3
The pairs are as follows 
[4 2]
[4 6]
[3 5]
*/

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int k=sc.nextInt();
        System.out.print(pairs(n,l,k));
    }
    static int pairs(int n,List<Integer> l,int k){
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:l){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        while(l.size()!=0){
        	int j=l.get(0);
        	l.remove(0);
        	map.put(j,map.get(j)-1);
            if(l.contains(Math.abs(j-k))){
                count+=map.get(Math.abs(j-k));
            }
            if(l.contains(Math.abs(j+k))){
                count+=map.get(Math.abs(j+k));
            }
        }
        return count;
    }
}