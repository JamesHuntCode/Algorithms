package queuedemo;

public class QueueDemo {

    /** program to demonstrate the implementation of a queue data structure. **/
    public static void main(String[] args) {
        
        // create instance of queue.
        Queue myQueue = new Queue();
        
        // Add some test elements to the queue.
        for (int i = 0; i < 10; i++)
        {
            myQueue.push(new Element(i + 1));
        }
        
        // Log all contents of the queue.
        System.out.print("Elements currently in the queue: \n\n");
        myQueue.traverse();
        
        // Pop an element from the front of the queue and re-log traverse results.
        myQueue.pop();
        
        System.out.print("\nElement popped from the front of the queue: \n\n");
        
        myQueue.traverse();
        
        // Search the queue for a specific value.
        boolean valueLocated = ((myQueue.search(5).data) != -1);
        System.out.print("\nDoes the queue contain a 5? " + valueLocated + ".\n\n");
        
        // Get the size of the queue (number of elements inside the queue).
        System.out.print("The queue contains " + myQueue.size() + " elements.\n\n");
        
        // Log the data held within the first and last element of the queue.
        System.out.print("The element at the front of the queue contains value: " + myQueue.frontElement().data + ".\n\n");
        System.out.print("The element at the back of the queue contains value: " + myQueue.backElement().data + ".\n\n");
    }
    
}

/** Queue data structure - first in, first out **/
class Queue
{
    /** index of element at the front of the queue **/
    int front = 0;
    
    /** index of element at the back of the queue **/
    int back = -1;
    
    /** data held within the queue (in this case, limited to 10 elements) **/
    Element[] data = new Element[10];
    
    /** method to determine if queue contains any elements **/
    public boolean isEmpty()
    {
        return ((data.length == 0) || (front == back));
    }
    
    /** method to add new element to the back of the queue **/
    public void push(Element newElement)
    {
        if (data.length == 9)
        {
            System.out.print("No room left to add elements to the queue.");
        }
        else 
        {
            back++;
            data[back] = newElement;
        }
    }
    
    /** method to remove the element from the front of the queue **/
    public void pop()
    {
        if (isEmpty())
        {
            System.out.print("No elements to pop from queue.");
        }
        else 
        {
            front++;
        }
    }
    
    /** method to traverse the queue and log all element data **/
    public void traverse()
    {
        for (int i = front ; i < (back + 1); i++)
        {
            System.out.print(data[i].data + "\n");
        }
    }
    
    /** method to search the queue for a specific integer value **/
    public Element search(int searchingFor)
    {
        for (int i = front; i < (back + 1); i++)
        {
            if (data[i].data == searchingFor) return data[i];
        }
        
        return new Element(-1);
    }
    
    /** method to determine the amount of elements in the queue **/
    public int size()
    {
        return (back - front);
    }
    
    /** method to return the element currently at the front of the queue **/
    public Element frontElement()
    {
        return data[front];
    }
    
    /** method to return the element currently at the back of the queue **/
    public Element backElement()
    {
        return data[back];
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
