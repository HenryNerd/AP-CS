//Class
//Java uses classes to create objects and hold methods for that object.
//

public class stringTraversal{
    //In order for our program to run we have to put in a main method
    //Some classes are writeen without a main
    //String class does not have a main method

    public static void main(String[] uriel){
        //A string is an object
        //Objects work a little like data types but are called reffrence data
        //A string object is made from a class, the text does not change color
        
        String myWord = "Hello";
        String yourWord = "World";

        //Methods can be static or not static
        //A static method belongs to the class meaning that it does not need an object to be called or Stays with the class

        System.out.println(Math.pow(2,3));

        //Static methods can olny be called withen other static methods


        //Non static methods belong to the object
        //For example most of the string class methods are non staitc

        System.out.println(myWord.length());

        //Substring has two diffrent methods
        //These two methods are called overload because you have two methods with the same name but diffrent parameters

        //When you call substring with just one index it returns every after that index including that index

        System.out.println(yourWord.indexOf("r"));

        //To check the alpabaetical order of strings we can use compare to
        //compare to returns 0 if the strings are the same
        //Returns an number <0 if they are not the same
        //Returns number greator than 0 if the second string is after the first in the alpabet or ASCII table

    }
}