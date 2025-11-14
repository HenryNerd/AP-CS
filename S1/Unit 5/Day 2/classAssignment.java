/*
Henry Veedahl

This program determines weather a number is even or odd
*/

import javax.swing.*;

public class classAssignment {//Start of Class

    public static void main(String[] andersonMusket){//Start Main

        String input = JOptionPane.showInputDialog(null, "Enter a number");
        int num;
        
        try{ //Start try
            num = Integer.parseInt(input);
        } //End Try
        catch(Exception e) { //Start Catch
            JOptionPane.showMessageDialog(null, "Invalid input");
            num = 0;
        } //End Catch

        int real = num % 2;

        if(real == 0) {// Start If
            JOptionPane.showMessageDialog(null, input+" is a even number");
        }//End If
        else {//Start Else
            JOptionPane.showMessageDialog(null, input+" is a odd number");
        }//End Else

    }//End Main

}//End of Class