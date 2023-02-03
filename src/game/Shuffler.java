package game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import DLL.DoublyLinkedList;
/**
 * This class shuffles the deck.
 * @author <Shawn Tian>, <Justin Nunez>
 * @version 1.0
 */
public class Shuffler {
	
	private ArrayList<Card> deck;
	
	/**
	 * This constructor set a ArrayList and a DoublyLinked List so that once the deck is shuffled,
	 * the DoublyLinked List will up the arraylist up.
	 * @param deck
	 * @param list
	 */
	public Shuffler(ArrayList<Card> deck,DoublyLinkedList<Card> list) {
		int totalDeck = 52;
		this.deck = deck;
		
		shuffleDeck(list);	
		}
	
	/**
	 * this method shuffle the deck after creating a new deck
	 * @param list
	 */
	private void shuffleDeck(DoublyLinkedList<Card> list) {
		
		int totalElements = deck.size();
		Random random = new Random();
	    random.nextInt();
	    
	    for (int i = 0; i < totalElements; i++) {
	        int change = i + random.nextInt(totalElements - i);
	        swap(i, change, list);
	        
	      }
	}
	/**
	 * this method swaps the cards from the Doubly Linked List in order to make randomized. 
	 * @param i
	 * @param change
	 * @param list
	 */
	private  void swap( int i, int change, DoublyLinkedList<Card> list) {
	    Card helper = deck.get(i);
	    Card helper2 = list.get(i);
	    deck.set(i, deck.get(change));
	    deck.set(change, helper);
	    
	    list.set(i, list.get(change));
	    list.set(change, helper2);
	  }
	
	 
}
