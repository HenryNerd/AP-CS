/*
Henry Veedahl
This program show us how to use the scanner to get data
*/

//Must import because it belongs to another file
import java.util.*;

public class scannerInput{//Start Of Class
    public static void main(String[] args) {//Start Main
        //Normally You Delcare Varibles At The Start of Your Program
        String name;
        String hobby = "Programing"; //When you declare a varible you can optionaly add a value
        int age;
        double gpa;

        //To get input from the user we have to use the scanner
        //The scanner is the object that will read in the user's the input

        //In order to use the scanner we have to set it up
        //This line creates a scanner varible called input

        Scanner input = new Scanner(System.in);

        //The first step to prompt the user for the input
        //We should tell the user what information we want
        System.out.print("Name: ");
        name = input.next();

        //System.out.print("Hello, "+name);

        String fullName;

        //input.next gets everything to the first space

        //Reset The Scanner Everytime to stop the bad things from happening

        //Clearing the scannener looks almost the same as creating it. BUt you don't have to say scanner

        input = new Scanner(System.in);

        //Ask The User

        System.out.print("Enter the goverment name: ");

        //Scan in the data entered by the user
        fullName = input.nextLine();

        System.out.println(fullName+" Has Multiple Goverment Warrents Out For His Arrest");
        
        //.nextLine scans up until the next enter

        System.out.print("What is your favorite hobby: ");
        hobby = input.nextLine();

        System.out.println(hobby+" Is Very Gay");

        //next() and nextLine only work for age
        //You can store numbers in a string but it works for charcters but not calculations

        System.out.print("What is your age: ");
        age = input.nextInt();

        System.out.println("Wow " + age + " is very old");
        
        //To store a double
        System.out.print("What is the GPA: ");
        gpa = input.nextDouble();
        double ajustedGPA;
        ajustedGPA = gpa + 0.3;
        System.out.println("Only a "+gpa+"I have a "+ajustedGPA);

        //Display sentence(s) in a single print statment that uses all varibles

        System.out.println(fullName+" Commonly known as "+name+" Enjoys doing "+hobby+" whitch he sucks at. They are "+age+" whitch means they are very old and ugly. They currently have a "+gpa+" GPA whitch pails in comparision to my "+ajustedGPA+". By my judgemnt they are very bad at life.");
    }//End Main
}//End Of Class