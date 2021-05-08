//======================================================================
package main;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class BST {                   // class BST which has implementation of all functions like insertion,deletion, searching. 
    
    public NodeBst head;        // making the head node which is reference of type NodeBst Class 
    
    BST()                               // default constructor; called when object is created
    {
        head = null;               // initially head is null 
    }
   //====================================================================== 
   public void insertnewNode(int nodeParameterValue)            // Adding integer value for making new node
  {
      NodeBst newNode = new NodeBst (nodeParameterValue);   // Making the object of NodeBst Class and passing value to the constructor
      
        
      if(head==null)                                                    // initially head is null 
      {
        
         head = newNode;                                        // head is point to the first node of the BST Tree
      }
      
      else
      {
          NodeBst currentNode = head;           
          NodeBst parent; 
          
          while(true)
          {
              parent = currentNode; 
              
              if(nodeParameterValue<parent.element)    //  if the value is less than the value in the tree
              {
                  currentNode = currentNode.leftChild;      // so place the new node to the left of the Node
                  
                  if(currentNode ==null)
                  {
                      parent.leftChild = newNode; 
                      return ;
                  }
              }
              else                                              //  if the value is less than the value in the tree
              {
                  currentNode = currentNode.rightChild; // so place the new node to the left of the Node
                  
                  if(currentNode ==null)
                  {
                      parent.rightChild = newNode;
                      return;
                  }
              }
          }
      }
      
     
      
  } // insert function close
   
   //======================================================================
   public void  findElements(int element)  // function taking one integer variable 
   {
       NodeBst current = head;              // current is point to the head and head is the starting point of BST 
       
       if(element==head.element)        // if the first value in BST is equal to the element for which user searching
       {
           System.out.println("your element is found successfully in the BST:"+head.element);   // display the value
       }
       
       else                         // other wise we will search in the depth 
       {
                 while(current!=null)       // Go till current is null 
       {
           
           
           if(element<current.element)  // if the user key is less than the element of the tree 
           {
               current = current.leftChild;     // update the current to the left sub tree 
               if(element ==current.element)        // comparing both values 
               {
                   System.out.println("your element is found successfully in the BST:"+current.element); // display the search key 
                   break; // break the loop or Go out from the loop 
               } // inner if 
               
           } // outer if 
           
           if(element>current.element)  // if the user key is less than the element of the tree 
           {
               current = current.rightChild;        // update the current to the left sub tree
               if(element ==current.element)        // comparing both values 
               {
                   System.out.println("your element is found successfully in the BST:"+current.element);  // display the search key 
                   break;               // break the loop or Go out from the loop 
               } // inner if 
               
           } // outer if 
       }
       }
      
   }
   //======================================================================
   public void findMaximum(NodeBst startNode)
   {
       NodeBst current = startNode;    // current node which point to the Start Node or root node
       if(current!=null)        // until current null
         {
            while(current.rightChild!=null)     // we will go the right most leaf node to find maximum element
             {
                   current = current.rightChild;    // update current to the right child 
             }
      
         }
     System.out.println( "\nThe maximum in the Binary Search Tree is :"+current.element);  // showing the maximum element in BST
       return;
      //return currentNode.element;
   }
   //======================================================================
    public int findMinimum(NodeBst startNode)
   {
       NodeBst current = startNode;     // current node which point to the Start Node or root node
       if(current!=null)        // until current null
         {
            while(current.leftChild!=null)      // we will go the right most leaf node to find maximum element
            {
                current = current.leftChild;        // update current to the right child 
            }
         }
     System.out.println( "\nThe minimum in the Binary Search Tree is :"+current.element);    // showing the maximum element in BST
       return current.element;
      //return currentNode.element;
   }
   //======================================================================
  // function to traverse the BST inOrder order
  public void showInOrder(NodeBst startNode)
  {
      if(startNode!=null)    // base condition
          {
           showInOrder(startNode.leftChild);     // recursively call and passing the left child of the BST
          System.out.println(startNode.element);
          showInOrder(startNode.rightChild);        // recursively call and passing the right child of the BST
          }
         
      }
  //======================================================================
  // function to traverse the BST in pre order
  public void showPreOrder(NodeBst startNode)
  {
       if(startNode!=null)       // base condition
          {
             System.out.println(startNode.element);    // display the element
             showPreOrder(startNode.leftChild);          // recursively call and passing the left child of the BST
             showPreOrder(startNode.rightChild);       // recursively call and passing the right child of the BST
          }
         
      }
  //======================================================================
  // function to traverse the BST in post order
    public void showPostOrder(NodeBst startNode)
   {
      if(startNode!=null)        // base condition 
          {
           showPostOrder(startNode.leftChild);     // recursively call and passing the left child of the BST
           showPostOrder(startNode.rightChild);     // recursively call and passing the right child of the BST
           System.out.println(startNode.element);   // display the element
          }
         
  }
  
  //======================================================================
    
    public void findNthLargestElement(NodeBst startNode,int nthNumber)
    {
       NodeBst current = startNode;
       
       if(nthNumber==1)     // if the user pass nthNumber equal to 1 then find the largest element 
       {
          if(current!=null)
           {
                  while(current.rightChild!=null)       // Go until the right child of the current node is null 
                   {
                      current = current.rightChild;     // update current to the right child 
                   }
           }
         System.out.println( "\nThe first Largest in the Binary Search Tree is :"+current.element); 
     }
      else   if(nthNumber==2)       // if the user pass nthNumber equal to 2 then find the Second largest element 
       {
          if(current!=null)     // checking for current if it is null or not
           {
                  while(current.rightChild.rightChild!=null)        // Go until the parent of leaf child 
                   {
                      current = current.rightChild;     // update to the right 
                   }
           }
         System.out.println( "\nThe Second Largest in the Binary Search Tree is :"+current.element); 
     }
       else   if(nthNumber==3)      // if the user pass nthNumber equal to 2 then find the Second largest element 
       {
          if(current!=null)     // checking for current if it is null or not
           {
                  while(current.rightChild.rightChild.rightChild!=null) // Go until the grand parent of the leaf node 
                   {
                      current = current.rightChild;  // update the current to right child 
                   }
           }
         System.out.println( "\nThe Third Largest in the Binary Search Tree is :"+current.element); 
     }
       else
       {
           System.out.println( "\n You can find Nth Largest Element up to 3"); 
       }
       
       
      return;       //return currentNode.element;
    }
    //======================================================================
    
    public void findHeightBST(NodeBst startNode)
    {
        int count = 0;    // start the count variable from 0
        NodeBst current = startNode;   // set current node to the root node which is storing the reference to the start of BST 
        while(current.rightChild!=null)     // Go till the last right child of the BST
        {
            count++;                        // increment count by 1
            current = current.rightChild;   // update the current to the right 
            
        }
        
        System.out.println("Height is"+" "+count);      // show the height of the tree
       
    }
    //======================================================================
    // Delete specific element from the BST
    public NodeBst deleteElement(NodeBst startNode,int element)
    {
        NodeBst current = startNode;
        /* First Case: if the BST is empty or if there is nothing in the BST*/
        if (current == null)
            return current;
 
        /* otherwise if the elemet is less than the currentNode element then go to further other node in the left sub tree*/
        if (element < current.element)
            current.leftChild = deleteElement(current.leftChild, element);          // recursively calling to function
        /* otherwise if the elemet is greater than the currentNode element then go to further other node in the right sub tree*/
        else if (element > current.element)
            current.rightChild = deleteElement(current.rightChild, element);    // recursively calling to function
        
        else {
            /* Second Case: if node has one child or no child */
            
            // current Node which has only one child or no child 
            if (current.leftChild == null) // if there is no left child of the current node
                return current.rightChild;
            else if (current.rightChild == null)    // if there is no right child of the current node
                return current.leftChild;       
 
            /* Third Case: if the node has two child: left child and right child */
            /* Finding successor which is smallest value in the right sub tree */
            current.element = findMinimum(current.rightChild);   // call to findMinimum funtion to return smallest element in the right sub tree
 
            // Now deleting the successor
            current.rightChild= deleteElement(current.rightChild, current.element); // recursive call 
        }
 
        return current;
    }
    
    //======================================================================
    
    public void doDepthFirstSearch(NodeBst startNode)
    {
        if(startNode!=null)       // base condition
          {
             System.out.println(startNode.element);    // display the element
             doDepthFirstSearch(startNode.leftChild);          // recursively call and passing the left child of the BST
             doDepthFirstSearch(startNode.rightChild);       // recursively call and passing the right child of the BST
          }
    }
    
    // This function is using Queue for the visited nodes and travers the tree 
    public void doBredthFirstSearch(NodeBst startNode)
    {
        //declare the Queue	
        Queue<NodeBst> q= new LinkedList<>();
        q.add(startNode);   // Adding the root node to the q 
       
        while(!(q.isEmpty()))       // until it not empty 
        {
             startNode = q.remove();    // removing the first node and storing the reference to the startNode
            System.out.println(startNode.element);      // Display the visited Node 
            if(startNode.leftChild!=null)                   // if the left child is not null of the node
            {
                q.add(startNode.leftChild);             // Add the neighbouring node to the queue
            }
          if(startNode.rightChild!=null)          // if the right child is not null of the node
           {
            q.add(startNode.rightChild);    // Add the neighbouring node to the queue
          } // if loop 
      } // while loop 
        
  } // BFS closed
    
}  // class close
