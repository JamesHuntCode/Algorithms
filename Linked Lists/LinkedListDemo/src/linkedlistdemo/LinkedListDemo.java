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
        
        // Add some demo values to myList.
        for (int i = 0; i < 11; i++)
        {
            myList.addNode(new Node(i + 1));
        }
        
        // Execute methods within LinkedList class on "myList" and output results.
        
        // Is the list empty?
        System.out.print("\nThe list is empty? " + myList.isEmpty() + ".\n\n");
        
        // Get the first element in the list (after the list head).
        System.out.print("The value in the first element of the list is: " + myList.firstElement().data + ".\n\n");
        
        // Get the element at the end of the list.
        System.out.print("The value in the last element of the list is: " + myList.lastElement().data + ".\n\n");
        
        // Add a new node to the list.
        myList.addNode(new Node(11));
        System.out.print("A node with the value 11 has been added to the list.\n\n");
        
        // Get the length of the list.
        System.out.print("The list currently has " + myList.listLength() + " nodes stored.\n\n");
        
        // Traverse list (method prints out all values).
        myList.traverse();
        System.out.print("\n\n");
        
        // Search list for a given value (within a node).
        boolean valueLocated = ((myList.search(new Node(5)).data) != -1);
        System.out.print("Does the list contain a node with the value 5? " + valueLocated + ".\n\n");
        
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
        return listHead == null;
    }
    
    /** will return the first node in the list **/
    public Node firstElement()
    {
        return listHead;
    }
    
    /** will return the last node in the list **/
    public Node lastElement()
    {
        if (isEmpty())
        {
            return new Node(-1);
        }
        else if (firstElement().nextNode == null)
        {
            return firstElement().nextNode;
        }
        else 
        {
            Node currentNode = listHead;
            
            while (currentNode.nextNode != null)
            {
                if (currentNode.nextNode == null)
                {
                    break;
                }
                else 
                {
                    currentNode = currentNode.nextNode;
                }
            }
            
            return currentNode;
        }
    }
    
    /** will add a new node to the back of the list **/
    public void addNode(Node newNode)
    {
        if (isEmpty())
        {
            listHead = newNode;
            newNode.nextNode = null;
        }
        else if (firstElement().nextNode == null)
        {
            firstElement().nextNode = newNode;
            newNode.nextNode = null;
        }
        else 
        {
            lastElement().nextNode = newNode;
            newNode.nextNode = null;
        }
    }
    
    /** will return an integer value indicating the number of nodes stored in the list **/
    public int listLength()
    {
        if (isEmpty())
        {
            return 0;
        }
        else if (firstElement().nextNode == null)
        {
            return 1;
        }
        else 
        {
            int nodeCount = 0;
            Node currentNode = listHead;
            
            while (currentNode.nextNode != null)
            {
                if (currentNode.nextNode == null)
                {
                    nodeCount++;
                    break;
                }
                else 
                {
                    nodeCount++;
                    currentNode = currentNode.nextNode;
                }
            }
            
            return nodeCount;
        }
    }
    
    /** will visit all nodes inside the list and print their values individually **/
    public void traverse()
    {
        if (isEmpty())
        {
            System.out.print("The list is empty.");
        }
        else if (firstElement().nextNode == null)
        {
            System.out.print(firstElement().data + "\n");
        }
        else 
        {
            Node currentNode = listHead;
            
            while (currentNode.nextNode != null)
            {
                if (currentNode.nextNode == null)
                {
                    System.out.print(currentNode.data + "\n");
                    break;
                }
                else 
                {
                    System.out.print(currentNode.data + "\n");
                    currentNode = currentNode.nextNode;
                }
            }
        }
    }
    
    /** will search for a given node, if located, will return the node, otherwise, will return a node with -1 value **/
    /** this method implements a linear search due to nodes not being ordered **/
    public Node search(Node searchingFor)
    {
        if (isEmpty())
        {
            return new Node(-1);
        }
        else if (firstElement().nextNode == null)
        {
            if (firstElement().data == searchingFor.data)
            {
                return firstElement();
            }
            else 
            {
                return new Node(-1);
            }
        }
        else 
        {
            Node currentNode = listHead;
            
            while (currentNode.nextNode != null)
            {
                if (currentNode.nextNode == null)
                {
                    if (currentNode.data == searchingFor.data)
                    {
                        return currentNode;
                    }
                    else 
                    {
                        return new Node(-1);
                    }
                }
                else 
                {
                    if (currentNode.data == searchingFor.data)
                    {
                        return currentNode;
                    }
                    else 
                    {
                        currentNode = currentNode.nextNode;
                    }
                }
            }
        }
        return new Node(-1);
    }
    
    /** will visit every node inside the list and sum their integer values **/
    public int sum()
    {
        if (isEmpty())
        {
            return 0;
        }
        else if (firstElement().nextNode == null)
        {
            return firstElement().data;
        }
        else 
        {
            int nodeSum = 0;
            Node currentNode = listHead;
            
            while (currentNode.nextNode != null)
            {
                if (currentNode.nextNode == null)
                {
                    nodeSum += currentNode.data;
                    break;
                }
                else 
                {
                    nodeSum += currentNode.data;
                    currentNode = currentNode.nextNode;
                }
            }
            
            return nodeSum;
        }
    }
}

/** Node to be stored inside linked list class **/
class Node
{
    /** integer data held within node **/
    int data;
    
    /** next node in list **/
    Node nextNode;
    
    /** constructor function for Node class **/
    public Node(int nodeData)
    {
        data = nodeData;
    }
}
