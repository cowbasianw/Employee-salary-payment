package linkedList;

/**
 * This class is used to structure our linked list stack. Similarly used to how DNode class was made,
 * except that we are using a single linked list to work with this StackNode class.
 * @author <Shawn Tian> <Justin Nunez>
 * @version 1.0
 */

public class StackNode<type> {
	
	private type data;
    private StackNode<type> next = null;
    
    public StackNode() { }
    /**
     * This constructor sets the parameter/argument to the data field in this class.
     * @param data is our parameter for the data field being set to.
     */
    public StackNode(type data) { this.data=data; }
    
    /**
     * This constructor sets the both data field and next field to their corresponding parameters/arguments.
     * @param x is our parameter for the data field being set to.
     * @param n is our parameter for the next field being set to.
     */
    public StackNode(type x, StackNode <type> n) {data = x; next = n;}
    	
    
    /**
     * This getter method returns the data field variable when called.
     * @return data field variable.
     */
    public type getData() { return data; }
    /**
     * This setter method will set the data field variable to the parameter/argument passed.
     * @param value is what will be initializing our data field.
     */
    public void setData(type value) { data = value; }
    /**
     * This setter method will set the next field variale to the parameter/argument passed.
     * @param other is what will be initializing our next field.
     */    
    public void setNext(StackNode<type> other){ next = other; }
    /**
     * This getter method returns the next field variable when called.
     * @return next field variable
     */
    public StackNode<type> getNext() { return next; }

}
