/*
Henry Veedahl

This program will show you how to use varibles for string, int and double data types.


*/

public class variblesAndErrors { // Program Start

    public static void main(String[] args) { // Main Start
        //A Varible is a placeholder
        //A varible allows us to give a name to a value

        //String is a varible and data type
        //A Data type tells us what kind of information is stored
        //Strings hold a list of charcters
        //To Declare a varible you write the dataType followed by the name of your varible

        String favFood;
        //The line above creates a space in memomory for for a string called favFood

        //To store a value in a varible we use the assignment operator
        //The assignment operator is a single =

        favFood = "pizza";

        //We can use a print statment to see what is in a varible

        //System.out.print("Henry's favorite food is ");
        System.out.println(favFood+" is my favorite food");

        //To join or concatenate string we use the +
        //The plus only goes where two values are connected so we don't need a plus at the begging or end
        favFood = "sand";
        System.out.println("My favorite food is "+favFood+"!");

    }// Main End

}//Program End