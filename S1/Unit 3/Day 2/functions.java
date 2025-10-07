
import java.util.Scanner;

/*
Henry Veedahl

Learning About Functions
*/

public class functions{//Start of Class

    //Functions are written outside of main but outside of class
    //Techincialy main is a function that java calls everytime
    //You need function header and definition
    //A function header is where you name a function and add parameters
    //The function deffiniton is the code that is inside of the function
    //All functions that we will write in this class will start with public static
    //The name of the function bellow is scanyboi

    public static void thankYouBoi() {//Start thankYouBoi
    //You can write whatever you want in here
    //FUnctions are used for runing a task multiple times
        System.out.println("-------------------------");
        System.out.println("-Thank You For Your Data-");
        System.out.println("--You House is Now Mine--");
        System.out.println("-------------------------");
        
    }//End thankYouBoi

    //This function dipslays an assci image
    public static void drawBoi() {
        System.out.println("      _____");
        System.out.println("     /     \\");
        System.out.println("    |  o o  |");
        System.out.println("    |   ^   |");
        System.out.println("    |  '-'  |");
        System.out.println("     \\_____/ ");
        System.out.println("      / | \\");
        System.out.println("     /  |  \\");
    }


    public static void main(String[] args) {//Start Main
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Ask User For Name
        System.out.print("What is your name: ");
        
        //Scan In A Store Data
        String name = input.nextLine();

        thankYouBoi();

        //Ask for favorite color
        System.out.print("What is your favorite color: ");
        String color = input.nextLine();

        thankYouBoi();

        //To run the code you write the name and then ();

        //Instead of typing this out everytime I will make a function and call it instead

        System.out.print("What is your favorite food: ");
        String food = input.nextLine();
        thankYouBoi();

        drawBoi();
        System.out.println("Want to see this cool picture 5 more times: ");
        drawBoi();
        drawBoi();
        drawBoi();
        drawBoi();
        drawBoi();

    }//End Main
}//End Of Class