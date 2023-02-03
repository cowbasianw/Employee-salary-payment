package DLL;
import game.Card;
import game.CardDeck;
/**
 * This class will be used to store our data into nodes and then storing them into each index of the linked list.
 * The linked list represents all the nodes stored inside of each index.
 * @author <Justin Nunez>, <shawn Tian> 
 * @version 1.0
 */
public class DNode<T> {
	 T item;  
     DNode<T> previous;  
     DNode<T> next;  
     
     /** 
      * This constructor sets the object/generic to the object/generic field. It was initially null
      * so we are initializing it.
      * @param item
      */
	public DNode( T item) {
		this.item = item;
	}
	/**
     * This method checks if the Node is empty by checking the previous.
     * @return a boolean true or false depending on the condition.
     */

	public boolean isEmpty() {
		
		return(previous == null);
	}
	/**
     * This method returns the generic/object when called.
     * @return the "item" field.
     */
    public T getItem() { return item; }
    /**
     * This method sets the parameter/argument to the generic/object field.
     * @param setting the value to the item field.
     */
	public void setItem(T value) { item = value; }
	/**
     * This method sets the next Node for the generic item field.
     * @param setting the other to the next.
     */
	public void setNext( DNode<T> other){ next = other; }
	/**
     * This method sets the previous Node for the generic item field.
     * @param setting the other to the previous.
     */
	public void setprevious(DNode<T> other) { previous = other;}
	/**
     * This method returns the "next" Node for the generic item field.
     * @return the "next" field.
     */
	public DNode<T> getNext() { return next; }
	/**
	 *  The get Item method.
	 * @return
	 */
	public T getNextItem() {
		return item;
	}
	/**
	 * The item setter method.
	 * @param item
	 */
	public void setNextItem(T item) {
		this.item = item;
		
	}
	

}
