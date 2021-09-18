import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
    private int Vertices;
    private LinkedList<Integer> adjlist[];
    DepthFirstSearch(int count_v)
    {
        Vertices = count_v;
        adjlist = new LinkedList[count_v];
        for (int i=0; i<count_v; ++i)
            adjlist[i] = new LinkedList();
    }
    void addNewEdge(int v, int w)
    {
        adjlist[v].add(w);
    }
    void traversalDFS(int v, boolean vnodelist[])
    {
        vnodelist[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> i = adjlist[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!vnodelist[n])
                traversalDFS(n, vnodelist);
        }
    }
    void depthFirst(int v)
    {
        boolean visited[] = new boolean[Vertices];
        traversalDFS(v, visited);
    }
}
