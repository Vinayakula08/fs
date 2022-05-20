import java.util.ArrayList;
import java.util.*;
public class Solution1 {
    public static List<List<Integer>> l1 = new ArrayList<>();
    private int v;
    private ArrayList<Integer>[] adjList;
    public Solution1(int vertices)
    {
        this.v = vertices;
        initAdjList();
    }
    @SuppressWarnings("unchecked")
    private void initAdjList()
    {
        adjList = new ArrayList[v];
 
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    public void addEdge(int u, int v)
    {
        adjList[u].add(v);
    }
    public List<List<Integer>> printAllPaths(int s, int d)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(s);
        printAllPathsUtil(s, d, isVisited, pathList);
        return l1;
    }
    private void printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList)
    {
 
        if (u.equals(d)) {
            List<Integer> l3 = new ArrayList<>(localPathList);
            l1.add(l3);
            return;
        }
        isVisited[u] = true;
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);
                localPathList.remove(i);
            }
        }
        isVisited[u] = false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        int k = sc.nextInt();
        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
        Solution1 g = new Solution1(1000);
        for(int i=0;i<k;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(l.contains(x))
            {
                g.addEdge(x,y);
            }
            ArrayList<Integer> p = new ArrayList<>();
            p.add(x);
            p.add(y);
            map.put(p,z);
        }
        int s = sc.nextInt();
        int d = sc.nextInt();
        g.printAllPaths(s, d);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<l1.size();i++)
        {
            ArrayList<Integer> f = new ArrayList<>(l1.get(i));
            int sum = 0;
            for(int j=0;j<f.size()-1;j++)
            {
                int t1 = f.get(j);
                int t2 = f.get(j+1);
                ArrayList<Integer> p = new ArrayList<>();
                p.add(t1);
                p.add(t2);
                if(map.containsKey(p))
                {
                    sum = sum + map.get(p);
                }
            }
            min = Math.min(sum,min);
        }
        System.out.println(min);
        sc.close();
    }
}
