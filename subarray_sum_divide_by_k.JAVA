import java.util.*;

class ContinuousSubset {
    public static boolean checkSubarraySum(int[] weights, int k) 
    {
        
	k = k == 0 ? Integer.MAX_VALUE : (k < 0 ? -k : k); // make sure k is positive; if k is zero, we won't do mod at all
        if ((weights.length + 2) / 2 > k) 
			return true; 
		// we have (length + 1 > k * 2) prefix sum but k remainder and k positions that the same remainders next to each other, then there is at least two prefix with the same remainder and the distance is larger than one
        
        Set<Integer> set = new HashSet<>();
        int last = 0;                            // the prefix sum one element earlier
        
	for (int weight : weights) {
            int cur = (last + weight) % k; // get newest prefix sum mod k
            if (set.contains(cur)) return true;
              set.add(last); // add old prefix sum into HashSet
            last = cur; // update old prefix sum
        }
        return false;
    }
	
   
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int[] weights=new int[n];
		for(int i=0;i<n;i++)
			weights[i]=sc.nextInt();
		System.out.print(checkSubarraySum(weights,w));
	}
}