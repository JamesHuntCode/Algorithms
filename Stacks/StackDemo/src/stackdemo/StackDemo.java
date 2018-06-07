package stackdemo;

public class StackDemo {

    /** Program to demonstrate implementation of a stack data structure **/
    public static void main(String[] args) {
        
        // Declare a stack.
        Stack myStack = new Stack();
        
        for (int i = 0; i < 10; i++)
        {
            myStack.push(new Element(i));
        }
        
        // Traverse stack and log all element data.
        System.out.print("\nElements currently in the stack:\n\n");
        myStack.traverse();
        
        // Check if stack empty.
        System.out.print("\n\nIs the stack empty? " + myStack.isEmpty() + ".\n\n");
        
        // Pop an element from the stack (then re-log stack data).
        myStack.pop();
        
        System.out.print("Top element has been popped from the stack.\n\n");
        
        myStack.traverse();
        
        // Search stack for a value.
        boolean valueLocated = (myStack.search(5).data != -1);
        System.out.print("\n\nIs there an element with value 5 in the stack? " + valueLocated + ".\n\n");
        
        // Get the number of items currently in the stack.
        System.out.print("How many elements are currently in the stack? " + myStack.size() + ".\n\n");
        
        // Get the data from the item currently on top of the stack.
        System.out.print("What is the value of the element currently at the top of the stack? " + myStack.topElement().data + ".\n\n");
        
    }
    
}

/** simple representation of a stack (first in - last out) **/
class Stack
{
    /** index of the element at the top of the stack **/
    int top = -1;
    
    /** single dimension array containing all elements currently inside the stack **/
    Element[] data = new Element[100];
    
    /** method to determine if the stack contains any elements **/
    public boolean isEmpty()
    {
        return (data.length == 0);
    }
    
    /** method to add an element to the top of the stack **/
    public void push(Element element)
    {
        if (top != 99)
        {
            top++;
            data[top] = element;
        }
        else 
        {
            System.out.print("No room left in the stack!");
        }
    }
    
    /** method to remove the element currently on top of the stack **/
    public void pop()
    {
        if (top != -1)
        {
            top--;
        }
        else 
        {
            System.out.print("No elements to pop from the stack.");
        }
    }
    
    /** method to search the stack for an element with a specific value **/
    public Element search(int valueToFind)
    {
        /** this methods implements a linear search (if data is sorted, binary search is advised **/
        for (int i = top; i >= 0; i--)
        {
            if (data[i].data == valueToFind)
            {
                return data[i];
            }
        }
        
        return new Element(-1);
    }
    
    /** method to traverse the stack and log all element data **/
    public void traverse()
    {
        for (int i = top; i >= 0; i--)
        {
            System.out.print(data[i].data + "\n");
        }
    }
    
    /** method to return the number of elements currently inside the stack **/
    public int size()
    {
        return top;
    }
    
    /** method to return the element currently on top of the stack **/
    public Element topElement()
    {
        return data[top];
    }
}

/** example data element used to hold data within a the above stack ADT **/
class Element
{
    /** data (of type integer) to be held within this element **/
    int data;
    
    /** constructor function **/
    public Element(int elementData)
    {
        data = elementData;
    }
}

