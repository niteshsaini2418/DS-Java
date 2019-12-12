class Node  
{ 
    int data; 
    Node left, right; 
  
    public Node(int data) 
    { 
        this.data = data; 
        left = right = null; 
    } 
} 
  
class symmetricTrees 
{ 
    Node a, b; 
      
    /* Given two trees, return true if they are 
       mirror of each other */
    boolean areSymmetric(Node a, Node b)  
    { 
        /* Base case : Both empty */
        if (a == null && b == null) 
            return true; 
  
        // If only one is empty 
        if (a == null || b == null)  
            return false; 
  
        /* Both non-empty, compare them recursively 
           Note that in recursive calls, we pass left 
           of one tree and right of other tree */
        return a.data == b.data 
                && areSymmetric(a.left, b.left) 
                && areSymmetric(a.right, b.right); 
    } 
  
    // Driver code to test above methods 
    public static void main(String[] args)  
    { 
        symmetricTrees tree = new symmetricTrees(); 
        Node a = new Node(1); 
        Node b = new Node(1); 
        a.left = new Node(2); 
        a.right = new Node(3); 
        a.left.left = new Node(4); 
        a.left.right = new Node(5); 
  
        b.left = new Node(2); 
        b.right = new Node(3); 
        b.left.left = new Node(4); 
        b.left.right = new Node(5); 
  
        if (tree.areSymmetric(a, b) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
    } 
}