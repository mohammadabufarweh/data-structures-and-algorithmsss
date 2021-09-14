import java.util.*;

public class Graph <T> {

    private Map<T, List<T>> map = new HashMap<>();
    public void addNewNode(T node)
    {
        map.put(node, new LinkedList<T>());
    }
    public void addNewEdge(T node1, T node2)
    {

        if (!map.containsKey(node1)){
            addNewNode(node1);
        }

        if (!map.containsKey(node2)) {
        addNewNode(node2);
        }
            map.get(node1).add(node2);
            map.get(node2).add(node1);
    }


    @Override
    public String toString()
    {
        if (map.keySet().isEmpty()){
            return null;
        }else {
        StringBuilder builder = new StringBuilder();
        for (T nodes : map.keySet())
        {
            builder.append(nodes.toString() + "  ");
            for (T edges : map.get(nodes))
            {
                builder.append(edges.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());}
    }

    public String getNodes(){
        List builder = new ArrayList();
        for (T nodes : map.keySet())
        {
            builder.add(nodes);
        }
        return (builder.toString());
    }
    public String getNeighbors(T node){
        StringBuilder builder = new StringBuilder();
            for (T edges : map.get(node))
            {
                builder.append(edges.toString() + " ");
            }
        return (builder.toString());
    }
    public int size()
    {
    return map.keySet().size();
    }


    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

   public List breadthFirst(int rootNode)
    {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> ll = new LinkedList<Integer>();
        visited[rootNode]=true;
        ll.add(rootNode);
        List l =new ArrayList();
        while (ll.size() != 0)
        {
            rootNode = ll.poll();
            l.add(rootNode);
            Iterator<Integer> i = adj[rootNode].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    ll.add(n);
                }
            }
        }
        return l;
    }


}

