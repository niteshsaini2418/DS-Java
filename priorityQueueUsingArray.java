import java.util.*;
class priority
{
    int array[]=new int[10];
    int nItems=0;

    public int size()
    {
        return nItems;
    }
    public boolean isEmpty()
    {
        //if(nItems==0) return true;

       // else return false;

       return nItems==0;
    }
    public int getPeek()
    {
        return array[nItems-1];
    }
    public int remove()
    {
        //int val =array[nItems];
        //nItems--;
        //return val;
        return array[--nItems];
    }
    public void insert(int val)
    {
      if(nItems==0)
     {
      array[0]=val;
      nItems++;
      return ;
    }
int i=0;
    for(i=nItems-1;i>=0;i--)
    {
        if(val<array[i])
        {
            array[i+1]=array[i];
        }

        else
        {
        
        break;
        }
    }
    array[i+1]=val;
    nItems++;
}

    

    public void print()
    {
        for(int i=0;i<nItems;i++)
        {
            System.out.println(array[i]+ " ");
        }
        System.out.println();
    }
}
public class priorityQueueUsingArray
{
    public static void main(String args[])
    {
        priority pq = new priority();
        pq.insert(2);
        pq.insert(1);
        pq.insert(4);
        pq.insert(9);
        pq.insert(3);
        pq.insert(6);
        pq.insert(5);
        pq.print();
        System.out.println(pq.size());
        System.out.println(pq.getPeek());
        System.out.println(pq.remove());
            pq.print();

       

    }
}
