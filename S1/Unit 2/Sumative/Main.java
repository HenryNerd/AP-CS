/*
Name: Henry Veedahl
Assignment: Unit 2 Sumative
Purpose: Make a story book with pictures
 */

//Import Packages
import javax.swing.*;

public class Main { //Start of Main

    public static void main(String[] args) {//Start of Main

        //Import All Images
        ImageIcon FirstPage = new ImageIcon("page 1.png");
        ImageIcon SecondPage = new ImageIcon("page2.png");
        ImageIcon ThirdPage = new ImageIcon("page 3.png");
        ImageIcon ForthPage = new ImageIcon("page 4.png");

        //Title Page
        JOptionPane.showMessageDialog(null, "The London Bridge\nAdapted By: Henry Veedahl", "London Bridge", -1);

        //Story
        JOptionPane.showMessageDialog(null, "London Bridge is falling down", "Page 1", -1, FirstPage);
        JOptionPane.showMessageDialog(null, "Falling down Falling down", "Page 2", -1, SecondPage);
        JOptionPane.showMessageDialog(null, "London Bridge is falling down", "Page 3", -1, ThirdPage);
        JOptionPane.showMessageDialog(null, "My Fair Lady.", "Page 4", -1, ForthPage);

        //Goodbye
        JOptionPane.showMessageDialog(null, "Thanks For Reading", "Goodbye", -1);

    }//End of Main
}//End of main
