/** A controller class that creates a Table object and handles the pressing of the Hit, Stop, and
 *  New Game button through the various models
 * @author Jonny Armstrong
 * @version 1.5.0
 */

package com.example.jonny.simpleblackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.jonny.simpleblackjack.Dealer.HAND_SIZE;

public class MainActivity extends AppCompatActivity {
    private Table table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        table = new Table();
        setContentView(R.layout.activity_main);

        TextView textview = (TextView) findViewById(R.id.userCard1);
        textview.setText(table.userHand[0].name);

        textview = (TextView) findViewById(R.id.userCard2);
        textview.setText(table.userHand[1].name);

        textview = (TextView) findViewById(R.id.dealerCard1);
        textview.setText(table.dealer.hand[0].name);

        textview = (TextView) findViewById(R.id.dealerCard2);
        textview.setText(table.dealer.hand[1].name);
    }

    /**
     * Method that resets the game is new game button is pressed
     * @param v the view being worked on
     */
    public void resetGame(View v)
    {
        // the current game will be wiped and a new instance of SimpleBlackJack created
    }

    /**
     * Method that performs the dealer's turn
     * @param v the view being worked on
     */
    public void dealerTurn(View v)
    {

    }

    /**
     * Method that requests a user hit and places any result in the proper label
     * @param v the view being worked on
     */
    public void userPressedHit(View v)
    {
        int whichCardAndView = table.userHit();

        if(whichCardAndView == 2)
        {
            TextView textview = (TextView) findViewById(R.id.userCard3);
            textview.setText(table.userHand[2].name);
        }
        else if(whichCardAndView == 3)
        {
            TextView textview = (TextView) findViewById(R.id.userCard4);
            textview.setText(table.userHand[3].name);
        }
        else if(whichCardAndView == 4)
        {
            TextView textview = (TextView) findViewById(R.id.userCard5);
            textview.setText(table.userHand[4].name);
        }
        else
        {
            // dealer turn
        }

    }
}
