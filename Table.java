/** 
 * This highest level in the hierarchy of model classes in the project. The Table class houses
 * everything from the user's hand to the Deck to the Dealer
 * @author Jonny Armstrong
 * ADD VERSION AND DATA INFO -- @version 1.0 09/30/2018
 */

package com.example.jonny.simpleblackjack;

import static com.example.jonny.simpleblackjack.Dealer.HAND_SIZE;

public class Table {
    private int userHandTotal;
    private int userHitsLeft;
    Deck deck;
    Dealer dealer;
    Card[] userHand;

    public Table()
    {
        userHandTotal = 0;
        userHitsLeft = 3;
        deck = new Deck();
        dealer = new Dealer();
        userHand = new Card[HAND_SIZE];
        setTable();
    }

    /** Method called when building the constructor that gives both the user and the dealer their
     *  first two Cards
     */
    public void setTable()
    {
        userHand[0] = deck.drawACard();
        userHand[1] = deck.drawACard();
        dealer.hand[0] = deck.drawACard();
        dealer.hand[1] = deck.drawACard();
    }

    /** helper method that checks how many hits the user is allowed left
     * @return true if the user may hit, false if the user has no hits left
     */
    public boolean checkHitsLeft()
    {
        if(userHitsLeft > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /** Method to perform a hit by the user. Provided the user is allowed, a card is drawn
     * @return the index that puts the Card in the correct slot in the user's hand
     */
    public int userHit()
    {
        if(checkHitsLeft() == true)
        {
            userHand[HAND_SIZE - userHitsLeft] = deck.drawACard();
            userHitsLeft--;
        }
        else
        {
            userHitsLeft = -1;
        }
        return (HAND_SIZE - (userHitsLeft + 1));
    }
}
