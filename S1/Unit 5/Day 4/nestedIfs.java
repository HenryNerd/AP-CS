
import javax.swing.*;

public class nestedIfs {

    public static int getNum(String prompt) {//Start Get Num
        String unparsedInput = JOptionPane.showInputDialog(null, prompt);
        int parsedInput;
        try {
            parsedInput = Integer.parseInt(unparsedInput);
        } catch (Exception e) {
            parsedInput = 0;
            JOptionPane.showMessageDialog(null, "Error - Input Not Allowed");
        }
        return (parsedInput);
    } //End Get Num

    public static void print(String toPrint){
        JOptionPane.showMessageDialog(null, toPrint);
    }

    public static void maicNumber() {
        int time = 1;
        int realNum = (int) (Math.random() * 100 + 1);
        System.out.println("The Number is" + realNum);
        while (time != 4) {
            int userGuess = getNum("Enter a number(1-10)");
            if (userGuess > realNum) {
                JOptionPane.showMessageDialog(null, "Too High");
            } else if (userGuess < realNum) {
                JOptionPane.showMessageDialog(null, "A Little Low");
            } else {
                JOptionPane.showMessageDialog(null, "You Win. It took you " + time + " guesses");
            }
            time = time + 1;
        }
        if (time == 4) {
            JOptionPane.showMessageDialog(null, "You Lost. The Number Was " + realNum);
        }
    }

    public static void guessAnimal() {
        String awnser = JOptionPane.showInputDialog(null, "Is your animal a mamal?");
        if (awnser.equalsIgnoreCase("Yes")) {
            String newawnser = JOptionPane.showInputDialog(null, "Is your animal a furry?");
            if (newawnser.equalsIgnoreCase("Yes")){
                print("Liver the Dog");
            }
            else{
                print("");
            }
            
        }
    }

    public static void main(String[] andersonMusket) {
        //maicNumber();
        guessAnimal();
    }
}