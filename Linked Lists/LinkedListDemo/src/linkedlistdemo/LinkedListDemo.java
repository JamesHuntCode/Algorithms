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
        System.out.print("The value in the first element of the list is: " + myList.firstElement().data + ".\n\n");
        
        // Get the element at the end of the list.
        System.out.print("The value in the last element of the list is: " + myList.lastElement().data + ".\n\n");
        
        // Add a new node to the list.
        myList.addNode(new Node());
        System.out.print("A node with the value 66 has been added to the list.\n\n");
        
        // Get the length of the list.
        System.out.print("The list currently has " + myList.listLength() + " nodes stored.\n\n");
        
        // Traverse list (method prints out all values).
        myList.traverse();
        System.out.print("\n\n");
        
        // Search list for a given value (within a node).
        boolean valueLocated = (myList.search(new Node()).data) != -1;
        System.out.print("Does the list contain a node with the value 66? " + valueLocated + ".\n\n");
        
        // Get sum of all node values within list.
        System.out.print("The total sum of all Node's values within the list is " + myList.sum() + ".\n\n");
    }
}

/** Dynamically linked list (of Nodes) **/
class LinkedList
{
    /** first node in list **/
    Node listHead;
    
    /** will return a boolean value indicating if the list contains any nodes **/
    public boolean isEmpty()
    {
        return true;
    }
    
    /** will return the first node in the list (not the list head though) **/
    public Node firstElement()
    {
        return new Node();
    }
    
    /** will return the last node in the list **/
    public Node lastElement()
    {
        return new Node();
    }
    
    /** will add a new node to the back of the list **/
    public void addNode(Node newNode)
    {
        
    }
    
    /** will return an integer value indicating the number of nodes stored in the list **/
    public int listLength()
    {
        return -1;
    }
    
    /** will visit all nodes inside the list and print their values individually **/
    public void traverse()
    {
        
    }
    
    /** will search for a given node, if located, will return the node, otherwise, will return a node with -1 value **/
    public Node search(Node searchingFor)
    {
        return new Node();
    }
    
    /** will visit every node inside the list and sum their integer values **/
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
