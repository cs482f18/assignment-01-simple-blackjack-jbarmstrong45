/** The Table Class houses the Dealer Class but the Dealer works with the dealer's hand itself
 *  Many of the Table methods that work with the user's hand are seen here in a similar fashion
 *  dealing with the dealer hand
 * @author Jonny Armtrong
 */

package com.example.jonny.simpleblackjack;

public class Dealer {
    public static final int STOP_VALUE = 17;
    public static final int HAND_SIZE = 5;
    private int handTotal;
    private int hitsLeft;
    Card[] hand;

    public Dealer()
    {
        handTotal = 0;
        hitsLeft = 3;
        hand = new Card[HAND_SIZE];
    }

    /** Similar to the userHit method, but it pertains to the dealer's hand
     *
     */
    public void performTurn()
    {

    }

    /** sees if the dealer is allowed another hit
     * @return true if the dealer may hit, false if not
     */
    public boolean checkHitsLeft()
    {
        if(hitsLeft > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /** Add the values of every Card in the hand
     * @return the total of all values
     */
    public int computeHandTotal()
    {
        int total = 0;
        //for loop that adds the card value
        //of every card in the hand
        return total;
    }

    /** Method that determines whether to hit based on if the handTotal is less than 17 or
     * greater than or equal to 17
     * @param total is derived from computeHandTotal()
     */
    public void hitOrStop(int total)
    {
        if(total < STOP_VALUE)
        {
            // hit again
        }
        else if(total >= STOP_VALUE)
        {
            // stop
        }
        else
        {
            // throw exception
        }
    }
}
