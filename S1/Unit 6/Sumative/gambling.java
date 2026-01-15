//Henry Veedahl
//Dice Games

import javax.swing.*;

public class gambling {//Start Class

    public static int rollDie() {//Start rollDie
        int roll = (int) (Math.random() * 6 + 1);
        return (roll);
    }//End rollDie

    public static void print(String message) {//Start Print
        JOptionPane.showMessageDialog(null, message);
    }//End Print

    public static String input(String message) {//Start input
        String userInput = JOptionPane.showInputDialog(null, message);
        return (userInput);
    }//End input

    public static void main(String[] andersmage) {//Start Main
        //Setup Varibles
        boolean active = true;
        Object[] bettingChoice = {"Even", "Odd"};
        Object[] Wouldcontinue = {"Yes", "No"};
        int score = 0;
        int die1;
        int die2;
        int sum;
        String betChoice;
        boolean betOutcome = false;
        String betOutcomeText = "null";

        //Into
        print("Welcome to my Casino. There will be 5 rounds where you can bet even or odd. Winning gives you 5 points while you lose 5 for betting wrong.");

        //Game Loop
        while (active) {//While Loop
            score = 0;
            for (int i = 1; i < 6; i = i + 1) {//For Loop
                int userChoice = JOptionPane.showOptionDialog(null, "How would you like to bet", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, bettingChoice, bettingChoice[0]);
                die1 = rollDie();
                die2 = rollDie();
                sum = die1 + die2;
                if (userChoice == 0) { //If User Chose Even
                    betChoice = "Even";
                    if (sum % 2 == 0) {//If Statment
                        betOutcome = true;
                        betOutcomeText = "Even";
                    }//If Statment 
                    else {//Else
                        betOutcome = false;
                        betOutcomeText = "Odd";
                    }//Else
                } //If User Chose Even
                else if (userChoice == 1) { //If User Chose Odd
                    betChoice = "Odd";
                    if (sum % 2 != 0) {
                        betOutcome = true;
                        betOutcomeText = "Odd";
                    } else {
                        betOutcome = false;
                        betOutcomeText = "Even";
                    }
                } //If User Chose Odd
                
                //Give Score
                if (betOutcome == true) {
                    score = score + 5;
                } else {
                    score = score - 5;
                }
                print("Turn: " + i + "\n \n Die 1: " + die1 + "\n Die 2: " + die2 + "\n Sum: " + sum + "\n \n You Bet: " + bettingChoice[userChoice] + "\n Outcome: " + betOutcomeText + "\n \n Your New Score: " + score);
            }//For Loop

            //Play Again?
            int toContiue = JOptionPane.showOptionDialog(null, "Your Final Score: " + score + "\n \n Would You Like To Play Again?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Wouldcontinue, Wouldcontinue[0]);
            
            if(toContiue == 0){
                System.out.println("Round 2 Start");
            }
            else{
                active = false;
            }
        }//While Loop
    }//End Main
}//End Class
