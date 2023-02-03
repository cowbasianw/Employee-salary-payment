package game;
import java.util.Scanner;
import DLL.DoublyLinkedList;
import linkedList.LinkListStack;
/**
* <This is the processor class that actually plays the game. It starts off with getting a deck of
cards, shuffling the deck, and dealing the cards to the players. The number of cards that the
players get is determined by the user of your game>
* @author <shawn tian> <Justin Nunez>
* @version 1.0
* Last Modified: <Oct 16> - <comments> <Shawn Tian>
*/
public class WarGame {
	
	Scanner sc= new Scanner(System.in);
	CardDeck <Card> Deck;
	/**
	* <This method starts up the program, User will select an option by providing a valid input (1, 2 or 3). An invalid input should print an
       error message and re-prompt for an acceptable response (This also applies to all user inputs as
       well). >
	*/
	public void menu() {
		Deck = new CardDeck<Card>();
        String option;
        
        boolean flag = true;
        while (flag) {
            
            System.out.println("Welcome to War Game! Please select a option");
            System.out.println();
            System.out.println("1. Play War Game\n"
                             + "2. Shuffle Cards\n"
                             + "3. Exit\n"
                             + "Enter your choice:\n"
                             + "");
             option = sc.nextLine();

             if(option.equals("1")) {
                 PlayWarGame();
                 System.out.println("Press 'Enter' to continue...");
                 sc.nextLine();
                 
                 CardDeck <Card> newDeck= new CardDeck<Card>();
         		 Deck.setDeck(newDeck.list);
             }
             else if (option.equals("2")) {
                 ShuffleCards();
                 System.out.println();
                 System.out.println("");
                 System.out.println("Successfully shuffled your cards.");
                 System.out.println();
             }
             else if(option.equals("3")) {
                 System.out.println("system shutting down");
                 break;
             }
             else {
                 System.out.println("Invalid option! Please try again.");
                 System.out.println("");
                 continue;
             }
        }}
	/**
	* <This is the processor class that actually plays the game. It starts off with getting a deck of
      cards, shuffling the deck, and dealing the cards to the players. The number of cards that the
      players get is determined by the user of your game.>
	*/
	public void PlayWarGame() {
		
		LinkListStack<Card> Player1 = new LinkListStack<Card>();
		LinkListStack<Card> Player2 = new LinkListStack<Card>();
		int NumOfCards ;
		int playerOneScore = 0;
		int playerTwoScore = 0;
		
		System.out.println("** Welcome to War Game! **");
		System.out.println();
		System.out.println("How many cards to deal:");
		NumOfCards = sc.nextInt();
		sc.nextLine();
		if(NumOfCards > 26) {
			System.out.println("The number of cards to deal is greater than the size of the deck.\n"
                    +"Exiting the program.");
		}
		else {
		System.out.println();
		System.out.println("Let the Games Begin!");
		System.out.println();
		for(int i=0; i< NumOfCards ; i ++) {
			
			Player1.addAt(i, Deck.list.pop());
			Player2.addAt(i, Deck.list.pop());
			System.out.println("Player 1 has card: " + Player1.get(i));
			System.out.println("Player 2 has card: " + Player2.get(i));
			System.out.println();
			if(Player1.get(i).isEqual(Player2.get(i)) == 1) {
				playerOneScore ++;
			}
			else {
				playerTwoScore ++;
			}	
		}
		System.out.println("Player 1 has a score of: " + playerOneScore);
		System.out.println("Player 2 has a score of: " + playerTwoScore);
		System.out.println();
		if(playerOneScore > playerTwoScore) {
			System.out.println("Player 1 wins!!!!");
		}
		else{
			System.out.println("Player 2 wins!!!!");
		}
		}
		
	}
	/**
	* <this method shuffle the deck and print the top five card of the deck.>
	*/
	public void ShuffleCards() {
		CardDeck <Card> newDeck= new CardDeck<Card>();
		Deck.setDeck(newDeck.list);
		System.out.println("The new Card Deck: ");
		
		for (int i = 0; i < 5 ; i ++){
			
			System.out.print(Deck.list.get(i) + ", ");
			
		}
		
	}
	
	

}
