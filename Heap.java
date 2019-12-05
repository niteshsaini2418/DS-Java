import java.util.*;

class heapTree
{
    int arr[]=new int[10];
    int size=0;
    int getParentIndex(int i)
    {
      return (i-1)/2;
    }

    int getLeftChildIndex(int i)
    {
      return (2*i+1); 
    }
    int  getRightChildIndex(int i)
    {
        return (2*i+1);
    }
    boolean getParent(int i) 
    {
      if(getParentIndex(i)<0)  return false;
      return true;


    }
    boolean getLeftChildIndex(int i)
    {
        return getLeftChildIndex(i)<size;
    }

    boolean getRightChildIndex(int i)
    {
        return getRightChildIndex(i)<size;
    }
    int parent (int i)
    {
        return arr[getParentIndex(i)];
    }
    int rightChild(int i)
    {
        return arr[getRightChildIndex(i)];
    }
    int leftChild(int i)
    {
        return arr[getLeftChildIndex(i)];
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        return size<=0;  //or size==0
    }
    int peek()
    {
        return arr[0];
    }
    void insert(int val)
    {
        arr[size]=val;
        size++;
        HeapifUp();
    }
    void HEapifUp()
    {
        int i =size-1;
        while(hasParent(i) && parent(i)<arr[i])
        {
            swap(i,getParentIndex(i));
            i=getParentIndex(i);
        }
    }
        void swap(int a , int b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        void print()
        {
            for(int i=0;i<size;i++)
            {
                System.out.println(arr[i]+ " ");
                System.out.println();

            }
        }

    


}

public class Heap{
     public static void main(String[] args) {
        heapTree ht=new heapTree();
        ht.insert(10);
        ht.insert(5);
        ht.insert(3);
        ht.insert(2);
        ht.insert(7);
        ht.print();
    }
}