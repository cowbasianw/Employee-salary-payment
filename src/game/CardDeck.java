package game;

import java.util.ArrayList;
import java.util.Collections;

import DLL.DNode;
import DLL.DoublyLinkedList;

/**
 * This class represents a card deck. The CardDeck class contains the standard deck of 52 cards 
 * (4 suits with each suit containing 13 different ranks of cards)
 * @author <Shawn Tian>, <Justin Nunez>
 * @version 1.0
 */
public class CardDeck <T> {

	
	
	/**
	 * deck holds all of the cards that currently are in the current deck
	 */
	private ArrayList<Card> deck;
	private CardDeck <Card> Deck;
	DoublyLinkedList<Card> list;
	private DNode<Card> Card;
	private Shuffler shuffleDeck;

	/**
	 * This constructor initiate the arraylist and calls the respective methods to
	 * create a new deck
	 */
	public CardDeck() {
		
		list = new DoublyLinkedList<Card>();
		deck = new ArrayList<Card>();
		createDeck();
		
		shuffleDeck = new Shuffler(deck, list); 
	}
	/**
	 * This method creates the deck
	 */
	private void createDeck() {
		// suits holds the name of the suits
		String[] suits = { "Spades", "Diamond", "Clubs", "Hearts" };
 
		
		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				list.addNode((new Card(j, suits[i])));
				deck.add((new Card(j, suits[i])));
				
			}

		}

	}
	/**
	 * The Deck setter method.
	 * @param list
	 */
	public void setDeck(DoublyLinkedList<Card> list) {
		this.list = list;
	}
	/**
	 * The deck getter method
	 * 
	 * @return the deck
	 */
	public CardDeck<Card> getDeck() {
		return Deck;
	}
	/**
	 * The Card getter method.
	 * @param object
	 * @return object
	 */
	public Card getCard( Card object ) {
		
		return object;
	}

	/**
	 * This method overrides the toString method and shows the list in the format we
	 * want
	 */
	public String toString() {
		
		return list.toString();
	}
	
	
	
	}


	




	


