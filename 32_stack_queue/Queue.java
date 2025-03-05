import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue{
    // This Queue class is designed for integer values >= 0
    
    // Place private instance variables here 
    private Node head;
    private int size;
    private LinkedList<Node> arr;
  
    // Place constructors here
    public Queue(){
        arr = new LinkedList<Node>();
        head = new Node();
        arr.add(head);
        size = 0;
    }
  
    
    // Enqueue a new value to the queue
    public void enqueue(int value){
        Node temp = new Node(value);
        arr.getLast().setNext(temp);
        arr.add(temp);
        size++;
    }
  
     
    // Dequeue a value from the queue
    public int dequeue() throws NoSuchElementException{
        if(size<1){
            throw new NoSuchElementException();
        }
        int ret = arr.getFirst().getData();
        if(size>2){
            arr.get(1).setNext(arr.get(2));
        }
        arr.removeFirst();
        size--;
        return ret;
    }
  
    // Return the front/top
    public int peek(){
        return arr.getFirst().getData();
    }
  
  
    // Check is queue is empty
    public boolean isEmpty(){
        return size==0;  
    }
  
    // Return queue size
    public int size(){
        return size;
    }
  
    
    // Print queue
    public String toString(){
        String ret = "[";
        for (Node element:arr){
            ret += element.getData()+", ";
        }
        return ret.substring(0, ret.length()-2)+"]";
    }
  
}