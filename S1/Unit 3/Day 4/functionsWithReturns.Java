/*
Henry Veedahl

This program will show you how to add paramerters and returns to your functions
*/

public class functionsWithReturns { // Start of class

    //Displays Story About Anders
    public static void story () {//Start of story
        System.out.println("Once upoun a time there was a student named Anders.");
        System.out.println("Anders favorite class was Higap B");
        System.out.println("Ander was a cool dude");
        System.out.println("Anders was also gay");
    }//End of story

    //You can use parameters to customise a function
    //They are values given to the function
    //Declared in the function head
    //Delcrared with datatype

    public static void newStory (String name, String favClasss) { //Start of newStory
        System.out.println("Once upoun a time there was a student named "+name+".");
        System.out.println(name+"\'s favorite class was "+favClasss+'.');
        System.out.println(name+" was a cool dude");
        System.out.println(name+" was also gay");
    }//End of newStory

    //Mixes Inputs
    public static String inputMixer (String inputOne, String inputTwo) {//Start inputMixer
        String outputOne;
        String outputTwo;

        inputOne = outputTwo;
        inputTwo = outputOne;

        String[] output = {outputOne, outputTwo};

        return output;
    }//End inputMixer

    public static void main(String[] args){//End Of Main
        //story();

        //With Argument
        newStory("Anders","Hi Gap B"));
    }//Start Of Main
}//End of Class