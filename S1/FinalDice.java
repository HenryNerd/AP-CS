//Henry Veedahl
//A fun gambling dice game

import javax.swing.*;

public class FinalDice {//Start Class FinalDice

    //Rolls a die and returns the value(1-6)
    public static int rollDie(){ //Start rollDie()
        int die = (int) (Math.random() * 6) + 1;
        return(die);
    } //End rollDie()

    public static void main(String[] anders){//Start Main
        boolean active = true;
        int die1;
        int die2;
        int balance = 100;
        String unparsedGuess;
        int guess;
        boolean goodGame = false;
        int result;
        boolean win;
        String exitText = "Critical Error";
        String unparsedBet;
        int bet = 0;

        //Game Loop
        while(active == true){ //Start Game Loop

            //Collect Game Input and Parse + Verify It
            unparsedGuess = JOptionPane.showInputDialog(null, "What do you think the sum of the two dice will be (1-12)?");

            //Check Die Guess
            try {
                guess = Integer.parseInt(unparsedGuess); //Parse Bet
                if(guess > 1 && guess < 13)goodGame = true;// Check if In Valid Range
                else{
                    goodGame = false;
                }
            } catch (Exception e) {
                guess = 0;
                goodGame = false;
                JOptionPane.showMessageDialog(null, "Not A Valid Guess, Please try again");
            }

            if(goodGame = true){//Start Good Check and Parse Bet
            unparsedBet = JOptionPane.showInputDialog(null, "How much would you like to bet? \n Your Current Balance: "+balance);
            try {
                bet = Integer.parseInt(unparsedBet); //Parse Bet
                if(bet > 1 && bet < 13)goodGame = true;// Check if In Valid Range
                else{
                    goodGame = false;
                }
            } catch (Exception e) {
                bet = 0;
                goodGame = false;
                JOptionPane.showMessageDialog(null, "Not A Valid Bet, Please try again");
            }

            if (bet > balance){
                goodGame = false;
                JOptionPane.showMessageDialog(null, "You do not have the funds to bet this much. Please chose a better bet.");
            }
        }//End Parse Bet and Good Check

            //Run Actual Game
            if(goodGame = true){//Start Game
                die1 = rollDie();
                die2 = rollDie();
                result = die1 + die2;

                if(result == guess){
                    win = true;
                    exitText = "Did Win!";
                    balance = balance + bet;
                } else if(result != guess){
                    win = false;
                    exitText = "You did not win :(";
                    balance = balance - bet;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Internal Critical Error"); 
                }

                JOptionPane.showMessageDialog(null, "You "+exitText+"\n \nDie 1: "+die1+"\n Die 2: "+die2+"\nTotal: "+result+"\nYour Guess: "+guess+"\n \nYour New Balance: "+balance);

                //Broke Check
                if(balance <= 0){//Start Broke Check
                    active = false;
                    JOptionPane.showMessageDialog(null, "Your Poor :(, Your Lost"); 
                }//End Broke Check
            }//End Game
        } //End Game Loop
    } //End Main
}//End Class FinalDice