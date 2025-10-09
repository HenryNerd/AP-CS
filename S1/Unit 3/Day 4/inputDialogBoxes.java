/*
Henry Veedahl

This program will show you how to do string input in the dialog box
*/

import javax.swing.*;

public class inputDialogBoxes{//start of class

    public static void main(String[] args) {//Start of main
        //Declare Varibles
        String name, food, ss, phone, vacation, state;

        //Reminder when we get input we need to store the input somewhere ethier right away or store in a varible

        //Two argument input box
        //varible = JOptionPane.showInputDialog(null, "Message");
        name = JOptionPane.showInputDialog(null, "What is your goverment name");

        //Three Argument Box (With Default Value)
        //varible = JOptionPane.showInputDialog(null, "Message For User", "Default Text");
        food = JOptionPane.showInputDialog(null, "Hi "+name+", What do you like to eat", "Pizza");


        // 4 Argument Box (Title & Icon)
        //Varibles = JOptionPane.showInputDialog(null, "Message", "Titile", Icon Number);
        ss = JOptionPane.showInputDialog(null, "Hello, "+name+"\n you owe $100,000,000 in taxes to the us goverment \n please enter you social security number bellow", "Tax Debt Owed", 2);

        //7 Argument Dialog Box
        phone = (String) JOptionPane.showInputDialog(null, "Hey, "+name+" 😏\n Whats your number?", "Phone Number", 3, null , null,"(***) *** - ****");

        //
        //Make sure your image in the 
        ImageIcon techClub = new ImageIcon("favcon.png");
/*
            // Corrected 7-argument input dialog with icon
            // varible = (String) JOptionPane.showInputDialog(null, "",
                "Vacation",
                -1,
                techClub,
                null,
                "Ex. Hell"
            );
            vacation = (String) JOptionPane.showInputDialog(
                null,
                "Where do you want to go on vacation, ",
                "Vacation",
                -1,
                techClub,
                null,
                "Ex. Hell"
            );
*/
            ImageIcon mapPic = new ImageIcon("map.png");

            //Arrays hold informtion of the same datattype and are symbolised with []
            String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

            state = (String) JOptionPane.showInputDialog(null, "Pick Your Choice", "U.S States", -1, mapPic, states, states[0]);

            String [] buttons = {"Beat Feet", "Beat Meat", "Beat Tyrique"};

            //Creste Int Varible for index of button pressed

            int choice;

            choice = JOptionPane.showOptionDialog(
                null,
                "You encountered Chose Wisely",
                "Choose Wisely",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                buttons,
                buttons[0]
            );

    }//End of main

}//End of class