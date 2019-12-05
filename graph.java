import java.util.*;
class graphll
{
    int v;
    LinkedList<Integer> adjListArray[];
    graphll(int v){
        this.v=v;
    adjListArray=new LinkedList[v];
    for (int i=0;i<v;i++)
    {
        adjListArray[i]=new LinkedList<>();
    }
    }
    void addEdge(int a, int b)
    {
        adjListArray[a].add(b);
        adjListArray[b].add(a);//because undirected graph
        
    }
    void print()
    {
        for(int i=0;i<v;i++)
        {
         System.out.println("Adjacency List of Vertex:" +i);
         for(Integer n: adjListArray[i])
         {
             System.out.println(n+"");
         }  
         System.out.println();
        }
    }
}
class graph
{
    public  static void main(String ...Nitesh) {
        graphll g=new graphll(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(4,2);
        g.print();
    }
}