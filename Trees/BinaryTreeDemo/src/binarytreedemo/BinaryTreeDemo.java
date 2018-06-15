package binarytreedemo;

/** program to demonstrate implementation of a traditional binary search tree **/
public class BinaryTreeDemo {
    
    public static void main(String[] args) {
        
        // Declare new binary search tree.
        BinarySearchTree myTree = new BinarySearchTree();
        
        // Add some nodes into the tree.
        myTree.rootNode = new Node(10);
        
        myTree.rootNode.left = new Node(5);
        myTree.rootNode.right = new Node(15);
        
        myTree.rootNode.left.left = new Node(2);
        myTree.rootNode.left.right = new Node(7);
        
        myTree.rootNode.right.right = new Node(17);
        myTree.rootNode.right.left = new Node(12);
        
        // Traverse tree.
        System.out.print("\nDepth first tree traversal example:\n\n");
        myTree.traverse(myTree.rootNode, "pre-order");
        
        // Remove an element from the tree.
        //System.out.print("\nNode with value 5 removed from the tree.\n\n");
        //myTree.removeNode(new Node(5));
        
        // Traverse tree.
        //System.out.print("\nBreadth first tree traversal example:\n\n");
        //myTree.breadthFirstTraversal();
        
        // Search the tree.
        //boolean valueLocated = ((myTree.search(new Node(17)).value) != -1);
        //System.out.print("\nDoes the tree contain a 17? " + valueLocated + ".\n\n");
        
        // Is the tree empty?
        //System.out.print("Is the tree empty? " + myTree.isEmpty() + ".\n\n");
        
        // How many nodes inside the tree?
        //System.out.print("How many nodes are in the tree? " + myTree.nodeCount() + ".\n\n");
        
        // What's the sum of all Node data in the tree?
        //System.out.print("What is the sum of all node data in the tree? " + myTree.sum() + ".\n\n");
        
    }
    
}

/** binary search tree data structure **/
class BinarySearchTree
{
    /** node at the top of the tree **/
    Node rootNode;
    
    /** determine if the tree contains any nodes **/
    public boolean isEmpty()
    {
        return (rootNode == null);
    }
    
    /** add a new node to the tree **/
    public void addNode(Node newNode)
    {
        
    }
    
    /** remove a specific node from the tree **/
    public void removeNode(Node removeMe)
    {
        int valueToRemove = removeMe.value;
        
        Node current = rootNode;
        
        while ((current.left != null) && (current.right != null))
        {
            
        }
    }
    
    /** traverse the tree and print node data **/
    public void traverse(Node root, String order)
    {
        if (order == "in-order")
        {
            
        }
        else if (order == "post-order")
        {
            
        }
        else 
        {
            if (root != null)
            {
                System.out.print(root.value + "\n");
                traverse(root.left, "pre-order");
                traverse(root.right, "pre-order");
            }
        }
    }
    
    /** method to locate a value in the tree, if no value is located, return -1 **/
    public Node search(Node findMe)
    {
        return new Node(-1);
    }
        
    /* return the amount of nodes currently in the tree **/
    public int nodeCount()
    {
        int nodeCounter = 0;
        
        Node current = rootNode;
        
        while ((current.left != null) && (current.right != null))
        {
            
        }
        
        return nodeCounter;
    }
    
    /** return the sum of all node data **/
    public int sum()
    {
        int nodeSum = 0;
        
        Node current = rootNode;
        
        while ((current.left != null) && (current.right != null))
        {
            
        }
        
        return nodeSum;
    }
}

/** node to be placed into binary tree (holds an integer value & links to child nodes) **/
class Node
{
    /** data held by the node **/
    int value;
    
    /** link to left child of 'this' (child on the left has a smaller value than 'this') **/
    Node left;
    
    /** link to right child of 'this' (child on the right has a greater value than 'this') **/
    Node right;
    
    /** constructor function **/
    public Node(int nodeVal)
    {
        value = nodeVal;
    }
    
    /** determine if a node has any children **/
    public boolean hasChildren()
    {
        return ((left != null) || (right != null));
    }
}
