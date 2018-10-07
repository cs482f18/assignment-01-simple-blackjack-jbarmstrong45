/** The Deck Class houses the 52 Cards being used to play the game. Cards are drawn from the deck
 *  to be put in the user's hand(Table) and the dealer's hand(Dealer)
 * @author Jonny Armstrong
 */

package com.example.jonny.simpleblackjack;

import java.util.Random;

public class Deck {
    public static final int NUMBER_OF_SUITS = 4;
    public static final int UNIQUE_CARDS = 13;
    public static final int CARDS_IN_A_DECK = 52;
    Card[] deckOfCards;
    int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
    String[] suits = {"clubs", "diamonds", "hearts", "spades"};
    String[] names = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

    public Deck()
    {
        deckOfCards = new Card[CARDS_IN_A_DECK];
        fillDeck();
    }

    /** Method that uses a nested for loop to create a standard 52 card deck. Each of the for suits
     *  has each of the thirteen unique card values. This method fills deckOfCards and should only
     *  happen once per game
     */
    public void fillDeck()
    {
        // clubs, diamonds, hearts, spades
        // 2,3,4,5,6,7,8,9,10,Jack,Queen,King,Ace
        // use a double (nested) for loop that creates card objects and assigns them the values
        // in suits[] and names[] based on index
        int deckCounter = 0;
        for(int i = 0; i < NUMBER_OF_SUITS; i++)
        {
            for(int j = 0; j < UNIQUE_CARDS; j++)
            {
                Card card = new Card(values[j], suits[i], names[j]);
                deckOfCards[deckCounter] = card;
                deckCounter++;
            }
        }
    }

    /** Method that uses Java's random function to pick a random number from 0 to 51. The result
     *  is used to draw a card from the deckOfCards at that index. If that particular Card is drawn,
     *  repeat until an undrawn Card is found
     * @return the first successful Card Object
     */
    public Card drawACard()
    {
        Random rand = new Random();
        int index = rand.nextInt(CARDS_IN_A_DECK - 1);

        while(deckOfCards[index].isDrawn() != 0 )
        {
            index = rand.nextInt(CARDS_IN_A_DECK - 1);
        }
        deckOfCards[index].draw();

        return deckOfCards[index];

    }
}
