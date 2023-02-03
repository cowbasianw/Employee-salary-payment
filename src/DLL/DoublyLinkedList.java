package DLL;
import java.util.EmptyStackException;
import linkedList.StackInterface;
/**
 * This is the class that will make our list to store our nodes or data in the list. 
 * We will use this class to store our deck of cards for it to be used in the game. 
 * Similar to a single linked list except we have a next and a previous field for us to go forward or backwards to access our nodes.
 * @author <Justin Nunez>, <Shawn Tian>
 * @version 1.0
 */
public class DoublyLinkedList<T> implements StackInterface<T>{
	
	DNode<T> head, tail = null;
	private int size;
    
	 /** 
		*<this method add a node to the list  >
		*<item> <the generic item that is added into the list.> 
		*< item>
		*/
    public void addNode(T item) {  
        //Create a new node  
        DNode<T> newNode = new DNode<T>(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;
            size++;
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;
            size++;
        }  
    }  
   
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        DNode<T> current = head;  
        if(head == null) {  
            System.out.println("This Deck of Cards is empty");  
            return;  
        }  
        System.out.println("This Deck of Cards: ");  
        System.out.print("[ "); 
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + ", ");  
            current = current.next;  
        }
        System.out.println("]");  
    }
    /**
     * This method searches for data identical to the object being passed as an argument/parameter and returns the object if found.
     * @param value is the object we are searching for inside the list.
     * @return the object of what we are searching.
     */
   
    public T searchNode(T value) {  
        int i = 1;  
        T card = null;
        boolean flag = false;  
        //Node current will point to head  
        DNode<T> current = head;  
  
        //Checks whether the list is empty  
        if(head == null) {  
            System.out.println("deck is empty");  
            return null;  
        }  
        while(current != null) {  
            //Compare value to be searched with each node in the list  
            if(current.item == value) {  
                flag = true;  
                card = current.item;
                break;  
                
            }  
            current = current.next;  
            i++;  
        }  
         return card;
    }
    /**
     * This method gets the Node of the numbered index inside of the list.
     * @param index is the parameter used to grab the node from our list.
     * @return the node of the index.
     */
    public T get(int index)
    {
        if(index < 0) 
        {
            throw new IndexOutOfBoundsException(); 
        }
        if(index > size)  
        {
            throw new IndexOutOfBoundsException();
        }
        DNode<T> current = head; 
        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }
        return (T) current.item; 
    }
    /**
     * This method overwrites the indicated index with another node.
     * @param index will be used to locate what index we are overwriting.
     * @param element will be used to replace the old node.
     * @return the node that was replaced.
     * @throws IndexOutOfBoundsException
     */
    public T set(int index, T element) throws IndexOutOfBoundsException {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        DNode<T> tempNode = head;

        while (i < index)
        {
            tempNode = tempNode.getNext();
            i++;
        }

        T previousElement = (T) tempNode.getNextItem();
        tempNode.setNextItem(element);

        return previousElement;
    }

	@Override
	public void push(T x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pop() {
		if (isEmpty())
			throw new	EmptyStackException();
		T x = head.item;
		head = head.next;
		size--;
		return x;	
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
    


}
