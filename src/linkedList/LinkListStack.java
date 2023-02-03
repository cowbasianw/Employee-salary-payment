package linkedList;

import java.util.EmptyStackException;
/**
 * This class will store stackNode into a Singly LinkedList,
 *  that can be used for the STACK.
 * @author <Shawn Tian> <Justin Nunez>
 * @version 1.0
 */
public class LinkListStack<type> implements StackInterface<type>
{
    private StackNode<type> start;
    private int length;
    public LinkListStack() { start = null; }
    
    public boolean isEmpty(){ return (start == null); }

   /**
    * Adding at a specific index 
    * @param index
    * @param data
    */
    public void addAt (int index, type data){        	
    	int length = size();        
    	if (length == 0 || index <= 0)
    		addToStart(data);
    	else if (length <= index)
    		addToEnd (data);
    	else {
    		StackNode<type> nodeToAdd = new StackNode<>(data);
    		StackNode<type> curr = start;                
    		for (int count = 0; count < index - 1; count++)                			
    			curr = curr.getNext();            
    		nodeToAdd.setNext (curr.getNext());            				
    		curr.setNext(nodeToAdd);
    	}
    }

    /**
     * This method removing a stackNode from front of the list.
     * @return
     */

    public type removeFromStart()
    {
        type data = null;

        if(start != null)
        {
            if(start.getNext() == null)
            {
                data = start.getData();
                start = null;
            }
            else
            {
            	StackNode<type> tmp = start;
                data = start.getData();
                start = start.getNext();

                tmp.setNext(null);
            }

        }
        return data;
    }
    /**
     * remove from end
     * @return
     */
    public type removeFromEnd()
    {
        if (start == null) {
        	return null;
        }
        
    	type data = null;
    	
    	if (size() == 1) {
    		data = start.getData();
        	start = null;
        	return data;
        }

    	StackNode<type> curr = start;
    	StackNode<type> prev = start;
       
        while (curr.getNext() != null) 
        {
        	prev = curr;
        	curr = curr.getNext();
        }
        data = curr.getData();
        prev.setNext(null);
        return data;
    }
    /**
     * get data from an index
     * @param index
     * @return
     */
    public type get(int index){
        type data = null;
        int length = size();
        StackNode<type> curr = start;
        
        if (index <= length && index >=0){
            curr = start;
            for (int count = 0; count < index; count++)
                curr = curr.getNext();
            data = curr.getData();    
        }
        return data;
    }
    

   /**
    * size of the list 
    * @return length
    */
    
    public int size(){
    	StackNode<type> curr = start;
        length = 0;

        while(curr != null)
        {
            length++;
            curr = curr.getNext();
        }

        return length;
    }
    /**
     * Add to end of the list
     * @param data
     */
    public void addToEnd(type data) {
        //without the if and else you will get a null pointer 
        //expection when adding the first element.
        
    	StackNode<type> nodeToAdd = new StackNode<>(data); 
        if(start != null){
        	StackNode<type> curr = start;

            while(curr.getNext() != null){
               curr = curr.getNext();
            }
            curr.setNext(nodeToAdd);
        }
        else
            start = nodeToAdd;
    }
    
    /**
     * Add to the front of the list
     * @param data
     */
    public void addToStart(type data) 
    { 
    	StackNode<type> nodeToAdd = new StackNode<>(data); 
        if(isEmpty())
            start = nodeToAdd;
        else
        {
          nodeToAdd.setNext(start);
          start = nodeToAdd;
        }
    }
    /**
     * Print the list
     */
    public void print()
    {
    	StackNode<type> curr = start;

        System.out.print("Start->");

        while(curr != null)
        {
            System.out.print("["+curr.getData()+"]->");
            curr = curr.getNext();
        }

        System.out.println("null");
    }

	@Override
	public void push(type x) {
	    length++;
		start = new StackNode<type> (x, start);

		
	}

	@Override
	public type pop() {
		if (isEmpty())
			throw new	EmptyStackException();
		type x = start.getData();
		start = start.getNext();
		length--;
		return x;
	}

	@Override
	public type peek() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
