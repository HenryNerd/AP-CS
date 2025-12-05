
import javax.swing.*;

public class whileLoop {//Start Classs

    public static void main(String[] andermage) {//Start Main
        double badNum = (Math.random() * 100);
        int realNum = (int) badNum;
        int guess = 1;
        int userGuess;
        boolean playing = true;

        System.out.println("DEBUG - " + realNum);

        while (guess < 4 && playing == true) {
            userGuess = getInt("Guesss: " + guess + "\nGive me a number boi");
            if (userGuess == realNum) {
                playing = false;
                JOptionPane.showMessageDialog(null, "You win. Good Job");
            } else {
                guess = guess + 1;
                if (guess == 3) {
                    JOptionPane.showMessageDialog(null, "Your Bad the Number was " + realNum);
                } else {
                    JOptionPane.showMessageDialog(null, "Not Correct Try Again. You have " + (4 - guess) + " guesses left");
                }
            }
        }

    }//End Main

    public static int getInt(String prompt) {

        String input = JOptionPane.showInputDialog(null, prompt);

        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                number = Integer.parseInt(input);
                isValid = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Input Not Allowed \n \n Make a better choice next time");
                input = JOptionPane.showInputDialog(null, prompt);  // Re-prompt
            }
        }

        return number;

    }//End of getInt
}//End Class
