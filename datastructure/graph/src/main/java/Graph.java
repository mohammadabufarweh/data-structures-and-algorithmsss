import javax.swing.*;
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


    // code challenge 37
    static class Edge
    {
        String source;
        String destination;
        int  weight;
        Edge(String source, String destination,int weight)
        {
            this.source = source;
            this.destination = destination;
            this.weight=weight;
        }
    }

    static class Graphh {
        int couter=0;
        List<List<Integer>> allNodes = new ArrayList<>();
        LinkedList w= new LinkedList();
        public  Graphh(List<Edge> edges) {
            int n = 0;
            for (Edge e : edges) {
                n = Integer.max(n, Integer.max(Integer.parseInt(e.source), Integer.parseInt(e.destination)));
            }
            for (int i = 0; i <= n; i++) {
                allNodes.add(i, new ArrayList<>());
            }
            for (Edge current : edges) {
                allNodes.get(Integer.parseInt(current.source)).add(Integer.valueOf(current.destination));
                w.add(current.weight);
            }
        }

        public static  String businessTrip(Graphh graph) {

            int s = 0;
            int s2=0;
            int l =0;
            int n = graph.allNodes.size();
            while (s < n) {
                for (int d : graph.allNodes.get(s)) {
                    graph.couter++;
                    l=d;
                }
                s++;
                if(l==s){
                   s2++;
                }
            }
                if (s2 == graph.couter){
                    return "true";
                }
            return "false";
        }
    }

    // end for code challenge 37
}


