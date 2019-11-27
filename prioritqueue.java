import java.util.*;// using Built-in class
class priorityQueue
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(2);
        pq.add(1);
        pq.add(4);
        pq.add(9);
        pq.add(6);
        pq.add(3);
        pq.add(5);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        System.out.println(pq.poll());// poll function will print the highest number and it remove it too
        System.out.println(pq.size());// so the size will decrease
        System.out.println(pq.peek());// peek function will also print highest number but will not remove it. Hence size of queue will remain same.
        System.out.println(pq.size());

    }
}