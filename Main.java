package main;
//======================================================================
// class Main;   program execution is starting from here
public class Main {

    public static void main(String[] args) {
       
        BST bstObject = new BST();                                                  // Making object of the BST class 
        bstObject.insertnewNode(45);                                             // calling to insert function and passing  integer value     
        bstObject.insertnewNode(20);                                            // calling to insert function and passing  integer value
        bstObject.insertnewNode(50);                                            // calling to insert function and passing  integer value
        bstObject.insertnewNode(30);                                            // calling to insert function and passing  integer value
        bstObject.insertnewNode(60);                                            // calling to insert function and passing  integer value
        
        System.out.println("\nPreOrder Traversal\n");
        bstObject.showPreOrder(bstObject.head);                      // call to the pre order function and passing the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n In Order Traversal\n");
        bstObject.showInOrder(bstObject.head);                      // call to the In order function and passing the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\nPost Order Traversal\n");
        bstObject.showPostOrder(bstObject.head);                 // call to the post order function and passing the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findMaximum(bstObject.head);                  // call to the find Maximum function and passing the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findMinimum(bstObject.head);                   
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findElements(20);                                      // call to the findElement function and passing the specific value
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findNthLargestElement(bstObject.head, 3); // finding nth largest element like for 1st =1, second = 2 and so on. 
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findHeightBST(bstObject.head);            // finding height of the bst;; Assuming height of the root is 0. 
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\nDeleting the 45 element from BST\n");
        bstObject.deleteElement(bstObject.head, 45);       // deleting the specific element
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("Showing BST elements after the deletion of 45");
        bstObject.showInOrder(bstObject.head);
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("Depth First Search");
        bstObject.doDepthFirstSearch(bstObject.head);
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("Bredth First Search");
        bstObject.doBredthFirstSearch(bstObject.head);
        
        
        
     }
    
}
//======================================================================