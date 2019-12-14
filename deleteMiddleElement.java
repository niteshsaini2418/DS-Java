class deleteMiddleElement  
{  
  
static class Node  
{  
    int data;  
    Node next;  
} 
  
  
static Node deleteMid(Node head)  
{  
    if(head==null)
    return null;
    
    if(head.next==null)
    return null;

    Node fast_pointer=head;
    Node slow_pointer=head;
    Node prev=null;
    while(fast_pointer!=null && fast_pointer.next!=null)
    {
        fast_pointer=fast_pointer.next.next;
        prev=slow_pointer;
        slow_pointer=slow_pointer.next;
    }
    prev.next=slow_pointer.next;
    return head;
     
}  
  
static void printList(Node ptr)  
{  
    while (ptr != null)  
    {  
        System.out.print(ptr.data + "->");  
        ptr = ptr.next;  
    }  
    System.out.println("NULL");  
}  
  
static Node newNode(int data)  
{  
    Node temp = new Node();  
    temp.data = data;  
    temp.next = null;  
    return temp;  
}  
  
public static void main(String[] args)  
{  
    Node head = newNode(1);  
    head.next = newNode(2);  
    head.next.next = newNode(3);  
    head.next.next.next = newNode(4);  
  
    System.out.println("Gven Linked List");  
    printList(head);  
  
    head = deleteMid(head);  
  
    System.out.println("Linked List after deletion of middle");  
    printList(head);  
} 
}  