/** The atom of the SimpleBlackJack project, Card objects make up the Deck, and the Deck is
 *  accessed by the Table and the dealer
 * @author Jonny Armstrong
 */

package com.example.jonny.simpleblackjack;

public class Card {
    private int value;
    private String suit;
    public String name;
    private boolean drawn;

    public Card(int value, String suit, String name)
    {
        this.value = value;
        this.suit = suit;
        this.name = name;
        drawn = false;
    }

    /** A basic method that checks to see if the Card has been drawn
     * @return 0 if card has not been drawn, 1 if card has been drawn
     */
    public int isDrawn()
    {
        if(drawn == false)
        {
            return 0;
        }
        else if(drawn == true)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    /**
     * Similar to a set method, but drawn always starts false
     */
    public void draw()
    {
        drawn = true;
    }

    /** Simple get method for the Card value
     * @return the integer value of the Card
     */
    public int getValue()
    {
        return value;
    }

    /** Simple set method for Card value
     * @param val is the value being assigned to the Card
     */
    public void setValue(int val)
    {
        value = val;
    }

    /** Simple get method for Card suit
     * @return the suit of the card (clubs, diamonds, hearts, or spades)
     */
    public String getSuit()
    {
        return suit;
    }

    /** Simple set method for Card suit
     * @param suit is the suit being assigned to the Card
     */
    public void setSuit(String suit)
    {
        this.suit = suit;
    }
}
