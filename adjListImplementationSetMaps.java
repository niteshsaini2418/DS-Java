import java.util.*;
class graphSM
{
    HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
    boolean addVertex(int vertex)
    {
        if(!graph.containsKey(vertex))
        {
        graph.put(vertex,new HashSet<>());
        return true;
        }
        return false;
    }
    void addEdge(int u, int v)
    {
      HashSet<Integer> neighbour=graph.get(u);
      neighbour.add(v);
      graph.put(u,neighbour);
      neighbour=graph.get(v);
      neighbour.add(u);
      graph.put(v,neighbour);
    }
    void print()
    {
        System.out.println(graph.keySet());
        for(Integer Key:graph.keySet())
        {
            System.out.println("Adjacency List for Nodes: "+Key);
            System.out.println(graph.get(Key));
        }
    }
    
}
class adjListImplementationSetMaps
{
    public static void main(String args[])
    {
        graphSM g=new graphSM();
        g.addVertex(0);
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(2,4);
        g.print();
        

    }
}