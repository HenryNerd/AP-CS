
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/*
Henry Veedahl

This program goes over joptionpane output boxes
*/

//In order to use JoptionPane dialog boxes we have to imporrt java.swing

public class dialogBoxes{// Start Of Program
    public static void main(String[] args){//Start of Main

        //System.out.println prints to the consle
        //System.out.println("Hello World");

        //Plain dialog box with 2 arguments
        //General Description
        //JOptionPane.showMessageDialog(null, "TextToDisplay");
        //JOptionPane.showConfirmDialog(null, "Whats Up");
        //JOptionPane.showMessageDialog(null, "This is my dialog box \nHello World");


        //Arguments are something we give a function. They are seperated by commas
        //Dialog box with a title and icon and 4 arguments


        //General Description
        //JOptionPane.showMessageDialog(null, "TextToDisplay", "Title", Icon Number);
        /*
        No Icon: -1
        Error Icon: 0
        Info Icon: 1
        //Warning Icon: 2
        //Question Icon: 3
        */
        //JOptionPane.showMessageDialog(null, "This is an error message", "ERROR", 0);

        //JOptionPane.showMessageDialog(null, "You are Gay", "ERROR", 3);

        //A Message Box with a title image and 5 arguments

        //JOptionPane.showMessageDialog(null, "Display Text, "Title", icon number, imageIcon);
        ImageIcon logo = new ImageIcon("Logo.png");
        JOptionPane.showMessageDialog(null, "The Middleton Tech Club", "The Middleton Tech Club Is a Programing Club \nat The Middleton Public Libbary", JOptionPane.PLAIN_MESSAGE, logo);
        //To reduce of resize an image open the image with pain and save and resize


    }//End of Main
}//End of Program