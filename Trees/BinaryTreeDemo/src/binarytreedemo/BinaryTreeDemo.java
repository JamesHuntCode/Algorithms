package binarytreedemo;

import java.util.*;

/** program to demonstrate implementation of a traditional binary search tree **/
public class BinaryTreeDemo {
    
    public static void main(String[] args) {
        
        // Declare new binary search tree.
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.rootNode = new Node(10);

        for (int i = 1; i < 20; i++)
        {
            if (i != 10)
            {
                myTree.addNode(myTree.rootNode, new Node(i));
            }
        }
        
        // Traverse tree.
        System.out.print("\nIn-order traversal example:\n\n");
        myTree.traverse(myTree.rootNode, "in-order");
        
        System.out.print("\nPost-order traversal example:\n\n");
        myTree.traverse(myTree.rootNode, "post-order");
        
        System.out.print("\nPre-order traversal example:\n\n");
        myTree.traverse(myTree.rootNode, "pre-order");
        
        // Remove an element from the tree.
        System.out.print("\nNode with value 5 removed from the tree.\n\n");
        myTree.removeNode(new Node(5));
        
        // Traverse tree.
        System.out.print("\nBreadth first tree traversal example:\n\n");
        myTree.traverse(myTree.rootNode, "breadth-first");
        
        System.out.print("\nDepth first tree traversal example:\n\n");
        myTree.traverse(myTree.rootNode, "depth-first");
        
        // Search the tree.
        boolean valueLocated = ((myTree.search(myTree.rootNode, new Node(10)).value) != -1);
        System.out.print("\nDoes the tree contain a 17? " + valueLocated + ".\n\n");
        
        // Is the tree empty?
        System.out.print("Is the tree empty? " + myTree.isEmpty() + ".\n\n");
        
        // How many nodes inside the tree?
        System.out.print("How many nodes are in the tree? " + myTree.nodeCount() + ".\n\n");
        
        // What's the sum of all Node data in the tree?
        System.out.print("What is the sum of all node data in the tree? " + myTree.sum() + ".\n\n");
        
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
    public void addNode(Node root, Node newNode)
    {
        if (isEmpty())
        {
            rootNode = newNode;
        }
        else 
        {
            if (newNode.value > root.value)
            {
                if (root.right == null)
                {
                    root.right = newNode;
                }
                else 
                {
                    addNode(root.right, newNode);
                }
                    
            }
            
            if (newNode.value < root.value)
            {
                if (root.left == null)
                {
                    root.left = newNode;
                }
                else 
                {
                    addNode(root.left, newNode);
                }
            }
            
            if (newNode.value == root.value)
            {
                System.out.print("\n\nThe tree already contains the value that you wish to add.\n\n");
            }
        }
    }
    
    /** remove a specific node from the tree **/
    public void removeNode(Node removeMe)
    {
        
    }
    
    /** traverse the tree and print node data **/
    public void traverse(Node root, String order)
    {
        if (order.equals("in-order"))
        {
            if (root != null)
            {
                traverse(root.left, "in-order");
                System.out.print(root.value + "\n");
                traverse(root.right, "in-order");
            }
        }
        else if (order.equals("post-order"))
        {
            if (root != null)
            {
                traverse(root.right, "post-order");
                traverse(root.left, "post-order");
                System.out.print(root.value + "\n");
            }
        }
        else if (order.equals("pre-order"))
        {
            if (root != null)
            {
                System.out.print(root.value + "\n");
                traverse(root.left, "pre-order");
                traverse(root.right, "pre-order");
            }
        }
        else if (order.equals("depth-first"))
        {
            Stack<Node> nodeStack = new Stack<>();
            
            nodeStack.add(rootNode);
            
            while (!nodeStack.isEmpty())
            {
                Node current = nodeStack.pop();
                
                if (current.right != null)
                {
                    nodeStack.add(current.right);
                }
                
                if (current.left != null)
                {
                    nodeStack.add(current.left);
                }
                
                System.out.print(current.value + "\n");
            }
        }
        else if (order.equals("breadth-first"))
        {
            Queue<Node> nodeQueue = new LinkedList<>();
            
            nodeQueue.add(rootNode);
            
            while (!nodeQueue.isEmpty())
            {
                Node current = nodeQueue.remove();
                
                System.out.print(current.value + "\n");
                
                if (current.left != null)
                {
                    nodeQueue.add(current.left);
                }
                
                if (current.right != null)
                {
                    nodeQueue.add(current.right);
                }
            }
        }
    }
    
    /** method to locate a value in the tree, if no value is located, return -1 **/
    /** this method (of course) implements a binary search **/
    public Node search(Node root, Node findMe)
    {
        if (!isEmpty())
        {
            int valueToFind = findMe.value;
            
            if (valueToFind == root.value)
            {
                return root;
            }
            
            if (valueToFind < root.value)
            {
                return search(root.left, findMe);
            }
            
            if (valueToFind > root.value)
            {
                return search(root.right, findMe);
            }
        }
            
        return new Node(-1);
    }
        
    /** return the amount of nodes currently in the tree **/
    /** this method uses a depth first search to traverse the tree **/
    public int nodeCount()
    {
        if (!isEmpty())
        {
            int nodeCounter = 0;

            Stack<Node> nodeStack = new Stack<>();

            nodeStack.add(rootNode);

            while (!nodeStack.isEmpty())
            {
                nodeCounter++;
                Node current = nodeStack.pop();

                if (current.right != null)
                {
                    nodeStack.add(current.right);
                }

                if (current.left != null)
                {
                    nodeStack.add(current.left);
                }
            }
            
            return nodeCounter;
        }
        
        return -1;
    }
    
    /** return the sum of all node data **/
    /** this method uses a depth first search to traverse the tree **/
    public int sum()
    {
        if (!isEmpty())
        {
            int sum = 0;

            Stack<Node> nodeStack = new Stack<>();

            nodeStack.add(rootNode);

            while (!nodeStack.isEmpty())
            {
                Node current = nodeStack.pop();
                
                sum += current.value;
                
                if (current.right != null)
                {
                    nodeStack.add(current.right);
                }

                if (current.left != null)
                {
                    nodeStack.add(current.left);
                }
            }
            
            return sum;
        }
       
        return 0;
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
        left = null;
        right = null;
    }
}
