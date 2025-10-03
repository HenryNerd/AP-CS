
import java.util.Scanner;

/*
Henry Veedahl

Learning About Functions
*/

public class functions{//Start of Class
    public static void main(String[] args) {//Start Main
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Ask User For Name
        System.out.print("What is your name: ");
        
        //Scan In A Store Data
        String name = input.nextLine();

        System.out.println("-------------------------");
        System.out.println("-Thank You For Your Data-");
        System.out.println("--You House is Now Mine--");
        System.out.println("-------------------------");

        //Ask for favorite color
        System.out.print("What is your favorite color: ");
        String ssn = input.next();

        //Instead of typing this out everytime I will make a function and call it instead

    }//End Main
}//End Of Class