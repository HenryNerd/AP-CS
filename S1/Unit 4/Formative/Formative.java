/*
Henry Veedahl

This is my formative for unit 4
*/

import javax.swing.*;

public class Formative {//Start Class

    public static double tempConvert(double celsius) { //start tempConvert
        double fahrenheit;
        fahrenheit = celsius * 1.8 + 32;
        return(fahrenheit);
    } //end TempConvert

    public static double inchToFeet(double inch) { //start inchToFeet
        double feet;
        feet = inch / 12;
        return(feet);
    } //End inchtoFeet

    public static void main(String[] liverTheDog){//Start Main

        //Setup Varibles
        String inch, celsius;
        double feet, fahrenheit;
        int choice;
        
        String[] choiceOptions = {"Inch to Feet", "Celsius to Fahrenheit","Exit"};

        //Ask for conversion type
        choice = JOptionPane.showOptionDialog(null, "Pick an Option", "Converter 5000", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, choiceOptions, choiceOptions[0]);
        
        if (choice == 0) { //Inch to Feet
            inch = JOptionPane.showInputDialog(null, "The length in inches");
            double inchReal = Double.parseDouble(inch);
            feet = inchToFeet(inchReal);
            JOptionPane.showMessageDialog(null, "The length in feet is: "+feet, "Converted Length", -1);
        }  
        else if (choice == 1) { //Celsius to Fahrenheit
            celsius = JOptionPane.showInputDialog(null, "The temp in Celsius");
            double celsiusReal = Double.parseDouble(celsius);
            fahrenheit = tempConvert(celsiusReal);
            JOptionPane.showMessageDialog(null, "The temp in fahrenheit is: "+fahrenheit, "Converted Temp", -1);
        }
        else if (choice == 2) { //Exit
        System.out.println("Exiting Program");
        }
        else{ //Bad Things
            JOptionPane.showMessageDialog(null, "Critical Internal Error", "ERROR", 0);
        }
    }//End Of Main
}//End Class