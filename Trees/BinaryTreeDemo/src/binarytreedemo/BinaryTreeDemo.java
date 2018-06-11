package binarytreedemo;

/** program to demonstrate implementation of a traditional binary search tree **/
public class BinaryTreeDemo {
    
    public static void main(String[] args) {
        
        // Declare new binary search tree.
        BinarySearchTree myTree = new BinarySearchTree();
        
        // Add some nodes into the tree.
        myTree.rootNode = new Node(10);
        
        for (int i = 1; i < 21; i++)
        {
            myTree.addNode(new Node(i));
        }
        
        // Traverse tree.
        System.out.print("\nBreadth first tree traversal example:\n\n");
        myTree.breadthFirstTraversal();
        
        // Remove an element from the tree.
        //System.out.print("\nNode with value 5 removed from the tree.\n\n");
        //myTree.removeNode(new Node(5));
        
        // Traverse tree.
        //System.out.print("\nDepth first tree traversal example:\n\n");
        //myTree.depthFirstTraversal();
        
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
        if (isEmpty())
        {
            rootNode = newNode;
        }
        else if (rootNode.left == null || rootNode.right == null)
        {
            if (newNode.value == rootNode.value)
            {
                System.out.print("Value already exists in the tree. Cannot add element.");
            }
            else if (newNode.value > rootNode.value)
            {
                rootNode.right = newNode;
            }
            else 
            {
                rootNode.left = newNode;
            }
        }
        else 
        {
            Node current = rootNode;
            int currentValue = current.value;
            int newValue = newNode.value;
            
            while ((current.left != null) && (current.right != null))
            {
                if (newValue == currentValue)
                {
                    System.out.print("Value already exists in the tree. Cannot add element.");
                }
                else if (newValue > currentValue)
                {
                    if (current.right == null)
                    {
                        current.right = newNode;
                    }
                    else 
                    {
                        current = current.right;
                    }
                }
                else if (newValue < currentValue)
                {
                    if (current.left == null)
                    {
                        current.left = newNode;
                    }
                    else 
                    {
                        current = current.left;
                    }
                }
            }
        }
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
    
    /** traverse the tree implementing breadth first traversal and print node data **/
    public void breadthFirstTraversal()
    {
        Node current = rootNode;
        
        while ((current.left != null) && (current.right != null))
        {
            System.out.print(current.left.value + "\n" + current.value + "\n" + current.right.value + "\n");
            
            current = current.left;
        }
    }
    
    /** traverse the tree implementing depth first traversal and print node data **/
    public void depthFirstTraversal()
    {
        Node current = rootNode;
        
        while ((current.left != null) && (current.right != null))
        {
            
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
}
