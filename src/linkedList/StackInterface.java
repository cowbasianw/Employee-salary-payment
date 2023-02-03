package linkedList;
/**
 * This class will act as the interface of the Singly LinkedList stack, 
 * which will be  into the WarGame class to extract card from cardDeck. 
 * @author <Shawn Tian> <Justin Nunez>
 * @version 1.0
 */
public interface StackInterface <T>{
	/**
     * This method will push a generic object into a Singly LinkedList stack.
     * @param x is what is going to be pushed into the stack.
     */
	public void push (T x);
	/**
     * This method will pop a generic object from a Singly LinkedList stack.
     */
	public T pop ();
	/**
	 * returns first generic object from a Singly LinkedList stack..
	 * @return T
	 */
	public T peek(); // also known as “top”
	/**
     * This method will check if the  Singly LinkedList stack is empty.
     */
	public boolean isEmpty();
	/**
     * This method will return the size of the Singly LinkedList stack as an integer.
     * @return size variable.
     */
	public int size();
	
}
