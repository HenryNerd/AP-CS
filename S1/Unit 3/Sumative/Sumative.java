import javax.swing.JOptionPane;

/*
Henry Veedahl

This a program that has a story with customisable parts
*/

public class Sumative { //Start of Class

    public static String[] ask() {//Start Ask
        String[] types = {"Noun", "Verb", "Adverb", "Adjective"};

        // Set up string for each type
        String noun = null;
        String verb = null;
        String adverb = null;
        String adjective = null;

        //For Each Loop
        for (String type : types ) { //For Loop STart
            System.out.println(type);
            System.out.println(types);
            if (type.equals("Noun")) { //Noun Check Start
                noun = JOptionPane.showInputDialog(null, "Please type a "+type, "Madlib", 1);
            } else if (type.equals("Verb")) { //Verb Check Start
                verb = JOptionPane.showInputDialog(null, "Please type a "+type, "Madlib", 1);
            } else if (type.equals("Adverb")) { //Adverbs Check Start
                adverb = JOptionPane.showInputDialog(null, "Please type a "+type, "Madlib", 1);
            } else if (type.equals("Adjective")) { //Adjective Check Start
                adjective = JOptionPane.showInputDialog(null, "Please type a "+type, "Madlib", 1);
            }
        }//For Loop End

        //Return Input
        String[] output = {noun, verb, adverb, adjective};
        return output;

    } //End ask

    public static void main(String[] args){ //Start of Main
        // Get Inputs
        String[] returns = ask();

        //Parse Inputs
        String noun = returns[0];
        String verb = returns[1];
        String adverb = returns[2];
        String adjective = returns[3];

        //Display Story
        JOptionPane.showConfirmDialog(null, "Are You Ready For Your Mad-Lib?");
        JOptionPane.showMessageDialog(null, "Once upon a time, there was a "+adjective + " wizard who owned a "+ noun + ".\n Every morning, they would "+ verb + " it "+ adverb + " until it started glowing and whispering secrets about taxes.");
    } // End of Main

} //End of Class