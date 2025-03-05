import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
public class Stack{
    // This Stack class is designed for integer values >= 0
  
    // Instance variables here
    private Node head;
    private int size;
    private LinkedList<Node> arr;
  
   // Constructor
    public Stack(){
        arr = new LinkedList<Node>();
        head = new Node();
        arr.add(head);
        size = 0;
    }   
  
    // Add element to stack
    public void push(int value){
        Node temp = new Node(value);
        arr.getLast().setNext(temp);
        arr.add(temp);
        size++;
    }
  
    // Remove element from stack  
    public int pop() throws EmptyStackException{
        if(size<1){
            throw new EmptyStackException();
        }
        int ret = arr.getLast().getData();
        arr.removeLast();
        if(size>=2){
            arr.getLast().setNext(null);
        }
        size--;
        return ret;
    }
  
    // Get top element
    public int peek(){
        return arr.getLast().getData();
    }
  
    // Check is stack empty
    public boolean isEmpty(){
        return size==0;
    }
  
    // Return size stack
    public int size(){
        return size;
    }
  
    // Print stack
    public String toString(){
        String ret = "[";
        for (Node element:arr){
            ret += element.getData()+", ";
        }
        return ret.substring(0, ret.length()-2)+"]";
    }
  
  
}
  