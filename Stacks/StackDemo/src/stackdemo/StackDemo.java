package stackdemo;

public class StackDemo {

    /** Program to demonstrate implementation of a stack data structure **/
    public static void main(String[] args) {
        
        // Declare a stack.
        Stack myStack = new Stack();
        
        for (int i = 0; i < 50; i++)
        {
            myStack.push(new Element(i + 1));
        }
    }
    
}

/** simple representation of a stack (first in - last out) **/
class Stack
{
    /** index of the element at the top of the stack **/
    int top;
    
    /** single dimension array containing all elements currently inside the stack **/
    Element[] data = new Element[100];
    
    /** method to determine if the stack contains any elements **/
    public boolean isEmpty()
    {
        return data.length > 0;
    }
    
    /** method to add an element to the top of the stack **/
    public void push(Element element)
    {
        
    }
    
    /** method to remove the element currently on top of the stack **/
    public void pop()
    {
        
    }
    
    /** method to search the stack for an element with a specific value **/
    public Element search(Element elementToFind)
    {
        return new Element(-1);
    }
    
    /** method to return the number of elements currently inside the stack **/
    public int size()
    {
        return 0;
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

