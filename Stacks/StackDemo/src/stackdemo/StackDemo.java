package stackdemo;

public class StackDemo {

    /** Program to demonstrate implementation of a stack data structure **/
    public static void main(String[] args) {
        
    }
    
}

/** simple representation of a stack (first in - last out) **/
class Stack
{
    /** single dimension array containing all elements currently inside the stack **/
    Element[] data = new Element[100];
    
    /** method to determine if the stack contains any elements **/
    public boolean isEmpty()
    {
        return true;
    }
    
    /** method to add an element to the top of the stack **/
    public void push(int element)
    {
        
    }
    
    /** method to remove the element currently on top of the stack **/
    public void pop()
    {
        
    }
    
    /** method to return the number of elements currently inside the stack **/
    public int size()
    {
        return 0;
    }
    
    /** method to return the element currently on top of the stack **/
    public Element top()
    {
        return new Element(-1);
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

