//Henry Veedahl
//This program rolls dice until it gets 2 dice of the same value

import javax.swing.JOptionPane;

public class quiz {//Start Class
    public static void game() {
        String results = "Dice Game \n \n";
        int count = 1;
        boolean active = true;

        while (active == true) {//Start While Loop

            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;

            results += "Attempt: " + count + "\n Die 1: " + die1 + " \n Die 2: " + die2 + " \n";

            if (die1 == die2) {//Start If Statment
                active = false;
                results += "\n Total Guesses: "+count;
                JOptionPane.showMessageDialog(null, results);
            }//End If Statment

            count += 1;
        }//End While Loop
    }

    public static void main(String[] anders) {//Start Main
        game();
    }//End Main
}//End Class
