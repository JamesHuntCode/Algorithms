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
        
        
        // Traverse tree.
        
        
        // Remove an element from the tree.
        
        
        // Traverse tree.
        
        
        // Search the tree.
        
        
        // Is the tree empty?
        
        
        // How many nodes inside the tree?
        
        
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
