import java.util.ArrayList;
import java.util.*;
 
// A directed graph using
// adjacency list representation
public class R {
    public static List<List<Integer>> l1 = new ArrayList<>();
 
    // No. of vertices in graph
    private static int v;
 
    // adjacency list
    private static ArrayList<Integer>[] adjList;
 
    // Constructor
    public R(int vertices)
    {
 
        // initialise vertex count
        this.v = vertices;
 
        // initialise adjacency list
        initAdjList();
    }
 
    // utility method to initialise
    // adjacency list
    @SuppressWarnings("unchecked")
    private static void initAdjList()
    {
        adjList = new ArrayList[v];
 
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
 
    // add edge from u to v
    public static void addEdge(int u, int v)
    {
        // Add v to u's list.
        adjList[u].add(v);
    }
 
    // Prints all paths from
    // 's' to 'd'
    public static void printAllPaths(int s, int d)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
 
        // add source to path[]
        pathList.add(s);
 
        // Call recursive utility
        printAllPathsUtil(s, d, isVisited, pathList);
    }
 
    // A recursive function to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path
    private static void printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList)
    {
 
        if (u.equals(d)) {
            List<Integer> l3 = new ArrayList<>(localPathList);
            l1.add(l3);
            // if match found then no need to traverse more till depth
            return;
        }
 
        // Mark the current node
        isVisited[u] = true;
 
        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                // store current node
                // in path[]
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);
 
                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }
 
        // Mark the current node
        isVisited[u] = false;
    }
 
    // Driver program
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
        R g = new R(1000);
        for(int i=0;i<k;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(l.contains(x))
            {
                R.addEdge(x,y);
            }
        }
        int s = sc.nextInt();
        int d = sc.nextInt();
 
        System.out.println(
            "Following are all different paths from "
            + s + " to " + d);
        R.printAllPaths(s, d);
        System.out.println(l1);
        sc.close();
    }
}