/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

/** Program to demonstrate an implementation of a dynamic linked list **/
public class LinkedListDemo {
    public static void main(String[] args) {
        
        // Declare new linked list.
        LinkedList myList = new LinkedList();
        
        // Execute methods within LinkedList class on "myList" and output results.
        
        // Is the list empty?
        System.out.print("\nThe list is empty? " + myList.isEmpty() + ".\n\n");
        
        // Get the first element in the list (after the list head).
        System.out.print("");
        
        // Get the element at the end of the list.
        System.out.print("");
        
        // Add a new node to the list.
        System.out.print("");
        
        // Get the length of the list.
        System.out.print("");
        
        // Traverse list (method prints out all values).
        myList.traverse();
        System.out.print("\n\n");
        
        // Search list for a given value (within a node).
        System.out.print("");
        
        // Get sum of all node values within list.
        System.out.print("");
    }
}

/** Dynamically linked list (of Nodes) **/
class LinkedList
{
    /** first node in list **/
    Node listHead;
    
    
    public boolean isEmpty()
    {
        return true;
    }
    
    
    public Node firstElement()
    {
        return new Node();
    }
    
    
    public Node lastElement()
    {
        return new Node();
    }
    
    
    public void addNode(Node newNode)
    {
        
    }
    
    
    public int listLength()
    {
        return -1;
    }
    
    
    public void traverse()
    {
        
    }
    
    
    public Node search(Node searchingFor)
    {
        return new Node();
    }
    
    
    public int sum()
    {
        return -1;
    }
}

/** Node to be stored inside linked list class **/
class Node
{
    /** integer data held within node **/
    int data;
    
    /** next node in list **/
    Node nextNode;
}
