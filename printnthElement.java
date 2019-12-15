class printnthElement { 
    Node head;  
  
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
 
    void printNthFromLast(int n) 
    { 
        int length=0;
        Node temp=head;
//first we need to know the length of linked list
        if(temp!=null)
        {
            temp=temp.next;
            length++;
        }

        temp=head;
        if(length<n)
        return ;

        for(int i=0; i<length-n+1;i++)
        temp=temp.next;

        System.out.println(temp.data);
         
    } 
  
    public void push(int new_data) 
    { 
       
        Node new_node = new Node(new_data); 
  
        new_node.next = head; 
  
        head = new_node; 
    } 
  
    public static void main(String[] args) 
    { 
        printnthElement llist = new printnthElement(); 
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(35); 
  
        llist.printNthFromLast(4); 
    } 
} 