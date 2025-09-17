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
        //System.out.println(favFood+" is my favorite food");

        //To join or concatenate string we use the +
        //The plus only goes where two values are connected so we don't need a plus at the begging or end
        favFood = "sand";
        //System.out.println("My favorite food is "+favFood+"!");

        //You can have numbers stored in strings
        //Int holds numbers negitive and possitive it is a data type

        //An int is delcared the same way a string is, dataType varibleName


        // You can assign the number now or later
        int number = 5;
        // We use syestem.out.println to display our int
        // When we display an int varible the print statment treats it like a string
        System.out.println("My Number is "+number);

        //If we want to change the value of our varbile you don't need to put the data type again
        //You just need to varible name
        //This is wrong
        //int = number = 6;

        number = 6;

        //System.out.println("My Number is now "+number);

        //ints cannot hold decimal points
        //doubles are what we use to store decimals

        //Doubles is a datatype that stores decimal values

        double decimal = 4.5;

        //System.out.println("My Double "+decimal);

        //You don't have to put a decimal point in the double
        //It will add a .0 at the end though


        decimal = 4;

        //System.out.println("My Double is now "+decimal);


        //Common Errors

        //package syestem does not exist
        //system.out.println("Hello");
        //Usally wrong spelling

        //cannot find symbol error
        //system.ut.println("Hello");
        //Usally wrong spelling error
        // The carrot shows us where the error is

        //If you are missing a bracket you will get an error
        // That says reached end of line while parsing
        //This is why you label your bracket
        //Don't start adding random brackets
        //When you have a bracket issue it best to start at the top and work your way down bracket by bracket

        // You should figure out what brackets are lined upo

        //If you have an extra parenteces or bracket you will get an error that syas class, interfacem, enum, or record expected.
        //It usally won;t tell you where the problem is at

        //When this happens you want to look for any parenteces that aren't lining up
        //Otherwise look at the brackets

    }// Main End

}//Program End
