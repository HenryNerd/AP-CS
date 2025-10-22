
import java.util.*;
import javax.swing.*;

public class labStarter { //Start Class

    public static void main(String[] args) {//Start Main
        //Declare variables
        String firstName = "", lastName = "", username = "";

        firstName = JOptionPane.showInputDialog(null, "Please enter your first name", "User Creation", -1);

        //2. Ask the user for their last name
        lastName = JOptionPane.showInputDialog(null, "Please enter your last name", "User Creation", -1);

        // 3. Call a method to generate the username
        username = generateUsername(firstName, lastName);

        //4. Edit these dialog boxes to display the users first and last name in the first box
        //and in the second box display the username
        JOptionPane.showMessageDialog(null, "Hello, " + firstName + " " + lastName);
        JOptionPane.showMessageDialog(null, "Your username is " + username);

        String fullName;
        int grade;
        String funFact;
        //5. Set up the scanner
        Scanner input = new Scanner(System.in);

        //6. Ask the user their full name
        System.out.print("Full Name: ");
        fullName = input.nextLine();
        input = new Scanner(System.in);

        //7. Ask the user their grade
        System.out.print("Current Grade: ");
        grade = input.nextInt();
        input = new Scanner(System.in);

        //8. Ask the user for a fun fact
        System.out.print("Fun Fact: ");
        funFact = input.nextLine();
        input = new Scanner(System.in);

        //10. Call your introduction function
        introdcution(fullName, grade, funFact);

    } //End Main

    // Create a method that returns a username
    public static String generateUsername(String first, String last) { //Start generateUsername
        // Example: first 2 letters of first + full last + number
        return first.substring(0, 2).toLowerCase() + last.toLowerCase() + ((int) Math.random() * 100);
    } //End generateUsername

    //9. Add your introduction function
    public static void introdcution(String name, int grade, String funFact) {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Fun Fact: " + funFact);
    }

}//End of class
