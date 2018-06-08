package queuedemo;

public class QueueDemo {

    /** program to demonstrate the implementation of a queue data structure. **/
    public static void main(String[] args) {
        
        // create instance of queue.
        Queue myQueue = new Queue();
        
        // Add some test elements to the queue.
        for (int i = 0; i < 10; i++)
        {
            myQueue.push(new Element(i));
        }
        
        // Log all contents of the queue.
        
        
        // Pop and element from the queue and re-log traverse results.
        
        
        // Search the queue for a specific value.
        
        
        // Get the size of the queue (number of elements inside the queue).
        
        
        // Log the data held within the first and last element of the queue.
        
    }
    
}

/** Queue data structure - first in, first out **/
class Queue
{
    /** index of element at the front of the queue **/
    int front = -1;
    
    /** index of element at the back of the queue **/
    int back = -1;
    
    /** data held within the queue (in this case, limited to 10) **/
    int[] data = new int[10];
    
    /** method to determine if queue contains any elements **/
    public boolean isEmpty()
    {
        return (data.length == 0);
    }
    
    /** method to add new element to the back of the queue **/
    public void push(Element newElement)
    {
        
    }
    
    /** method to remove the element at the back of the queue **/
    public void pop()
    {
        
    }
    
    /** method to traverse the queue and log all element data **/
    public void traverse()
    {
        
    }
    
    /** method to search the queue for a specific integer value **/
    public void search(int searchingFor)
    {
        
    }
    
    /** method to determine the amount of elements in the queue **/
    public int size()
    {
        return data.length;
    }
    
    /** method to return the element currently at the front of the queue **/
    public Element frontElement()
    {
        return new Element(-1);
    }
    
    /** method to return the element currently at the back of the queue **/
    public Element backElement()
    {
        return new Element(-1);
    }
}

/** Data elements to be placed into the queue for testing **/
class Element
{
    /** data held within the element **/
    int data;
    
    /** constructor function **/
    public Element(int elemData)
    {
        data = elemData;
    }
}
