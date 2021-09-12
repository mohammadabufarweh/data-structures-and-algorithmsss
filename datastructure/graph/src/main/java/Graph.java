import java.util.*;

public class Graph <T> {
    //creating an object of the Map class that stores the edges of the graph
    private Map<T, List<T>> map = new HashMap<>();
    //the method adds a new vertex to the graph
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
}
