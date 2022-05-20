import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static List<List<Integer>> l1 = new ArrayList<>();
    private int v;
    private ArrayList<Integer>[] adjList;
    public Solution(int vertices)
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
    public void printAllPaths(int s, int d)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(s);
        printAllPathsUtil(s, d, isVisited, pathList);
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
        Solution g = new Solution(10000);
        for(int i=0;i<k;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(l.contains(x))
            {
                g.addEdge(x,y);
            }
        }
        int s = sc.nextInt();
        int d = sc.nextInt();
        g.printAllPaths(s, d);
        if(l1.size()==0)
        {
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
        sc.close();
    }
}
