What the Project Does:

The main objective of the project is to implement all the functionality for the binary Search Tree.

The following are the main functionality of the project:

i. Creating a Node:  In this function, we create a new node. We set data for new node as well as the left and right child for the node. 

ii. Inserting new Node: In this function, we inserting node data of integer data type. The data of each node is placing carefully according to the rule of Binary Search Tree. The Smaller value is placing to the left child of the parent node and the greater value of the node from the parent is placing to the right. In this way, we construct a binary search Tree. 

iii. Finding Elements: This function search for the specific integer value in the binary search tree. if the value is found in the binary search tree then a message is showing.

iv. Finding Height of the BST: This function find the height binary search tree.The height is the number of edges from the root node. The height of the root node is 0. 

v. Finding Minimum Element in the BST: This function find the smallest element in the binary search tree. The smallest element is found in the left sub tree. 

vi. Finding Largest Element in the BST: This function find the Largest element in the binary search tree. The smallest element is found in the right sub tree.

vii. Finding Nth Largest Element in the BST: This function find the Nth largest element in the binary search tree. The nth largest element can be the first, second, or third largest element. 

viii. Delete the specific Element in the BST: This function delete the element in the binary search tree. The function look for three cases:
	Case I. 	Node which has no child
	Case II. 	Node which has only one child
	Case III. 	Node which has Two child. 

v. Tree Traversing:
 There are three functions which do traversing for the tree.The three traversing functions are of the following. 

i. 	Inorder    Traversing: This function shows the elements of the BST in Ascending order. 
ii.	PreOrder   Traversing: This function shows the elements of the BST through Recursively call.Here first root is visiting and then other nodes.  
iii.	Post Order Traversing: This function shows the elements of the BST through Recursively call.Here root node is visiting in the last. 


Advanced Search:  There are two types of Advanced Search. 

Bredth First Search: This search basically use the queue for visited nodes. The tree is traversed with the help of enqueue and deque operation on the queue. 

Depth First Search: This search basically use the stack for visited nodes. It working like same as the Inorder traversing. There for the resulting traverse of of depth search and inorder traversing is same. 

//=========================================================================================
How to use it. 

In order to use or run it in the system, the following steps will be taken. 

i.  The system should have a standard IDE for java(NetBean, Eclipse, Intellig). 
ii. Open the project folder in the Java IDE and configure the three files. 
iii.Compile the project and then run it. 

//===========================================================================================

How the output is generating:

The data is inserted in the Main.java class for every function calling. There for to test different functions of the BST, you should have to give different values in the main.java class.  