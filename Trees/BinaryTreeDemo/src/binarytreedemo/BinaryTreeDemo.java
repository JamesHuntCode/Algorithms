/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        myTree.breadthFirstTraversal();
        
        // Remove an element from the tree.
        myTree.removeNode(new Node(5));
        
        // Traverse tree.
        myTree.depthFirstTraversal();
        
        // Search the tree.
        boolean valueLocated = ((myTree.search(new Node(17)).data) != -1);
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
    public void addNode(Node newNode)
    {
        
    }
    
    /** remove a specific node from the tree **/
    public void removeNode(Node removeMe)
    {
        
    }
    
    /** traverse the tree implementing breadth first traversal **/
    public void breadthFirstTraversal()
    {
        
    }
    
    /** traverse the tree implementing depth first traversal **/
    public void depthFirstTraversal()
    {
        
    }
    
    /** method to locate a value in the tree, if no value is located, return -1 **/
    public Node search(Node findMe)
    {
        return new Node(-1);
    }
        
    /* return the amount of nodes currently in the tree **/
    public int nodeCount()
    {
        return -1;
    }
    
    /** return the sum of all node data **/
    public int sum()
    {
        return -1;
    }
}

/** node to be placed into binary tree (holds an integer value) **/
class Node
{
    /** data held by the node **/
    int data;
    
    /** constructor function **/
    public Node(int nodeData)
    {
        data = nodeData;
    }
}
