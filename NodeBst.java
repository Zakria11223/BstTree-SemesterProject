package main;
//======================================================================
public class NodeBst {                // BST class 
    public NodeBst leftChild;       // left child of the BST
    public NodeBst rightChild;     // right child of the BST
    public int element;                 // element or data in the BST
    
    //======================================================================
    
   public  NodeBst(int element)      // Constructor which take the element 
    {
        
        this.element = element;         // set the element of the Node 
      System.out.println("Insertion is done successfully"+this.element);
    }
    
    //======================================================================
    public String toString()        // function to display the elements of the node
    {
        return "key"+element;
    }
    
}
//======================================================================