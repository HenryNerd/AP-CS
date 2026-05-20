//Henry Veedahl
//Unit 1 Sumative
//This project provides a suite of tools for creating usernames out of emails.

public class fun{ //Start Class

    public static String username1(String email){ //Start Username 1
        //Setup Varibles and Parse Using Function
        String name[] = emailParser(email);
        String firstName = name[0];
        String lastName = name[1];
        String username = "";

        //Combine First and Last Name
        username = username + firstName;
        username = username + "_";
        username = username + lastName;

        //Return Username
        return(username);
    } //End Username 1

    public static String username2(String email){ //Start Username 2
        //Setup Varibles and Parse Using Function
        String name[] = emailParser(email);
        String firstName = name[0];
        String lastName = name[1];
        String username = "";

        //Combine First Charcter of First Name and Last Name
        username = username + firstName.charAt(0);
        username = username + "_";
        username = username + lastName;

        //Return Username
        return(username);
    } //End Username 2

    public static String username3(String email){ //Start Username 3
        //Setup Varibles and Parse Using Function
        String name[] = emailParser(email);
        String firstName = name[0];
        String lastName = name[1];
        String username = "";
        String lastNameParsed = "";
        char current;

        int firstNameNum = (int)(Math.random() * firstName.length());

        username = username + firstName.charAt(firstNameNum);
        
        int lastNameNum = (int)(Math.random() * (lastName.length() - 3));
        int lastNameNumLimit = lastNameNum + 3;

        for(int i = lastNameNum; i < lastNameNumLimit; i++){ //Start Last Name Parse For Loop
            current = lastName.charAt(i);
            lastNameParsed = lastNameParsed + current;
        } //End Last Name Parse For Loop

        //Combine Last Name
        username = username + "_";
        username = username + lastNameParsed;

        //Return Username
        return(username);
    } //End Username 3

    public static String[] emailParser(String email){ //Start emailParser
        String firstName = "";
        String lastName = "";
        char current;
        String currentString;
        int firsti;
        int secondi;
        String [] returnName = {"firstName", "lastName"};

        for(firsti = 0; firsti < email.length(); firsti++){ //Start for loop
            current = email.charAt(firsti);
            currentString = String.valueOf(current);
            if(currentString.equals(".")){ //Start if Break
                break;
            } //End if Break    

            firstName = firstName + current;
        } //End for loop

        returnName[0] = firstName;
        firsti ++;

        for(secondi = firsti; secondi < email.length(); secondi++){
            current = email.charAt(secondi);
            currentString = String.valueOf(current);
            if(currentString.equals("@")){ //Start if Break
                break;
            } //End if Break

            lastName = lastName + current;
        }

        returnName[1] = lastName;

        
        return(returnName);
    } //End emailParser

    public static void main(String[] liverTheDog){ //Start Main
        //Test Case 1
        System.out.println(username1("joseph.martin@school.org"));
        System.out.println(username2("joseph.martin@school.org"));
        System.out.println(username3("joseph.martin@school.org"));
        System.out.println();

        //Test Case 2
        System.out.println(username1("virginia.farmingham@school.net"));
        System.out.println(username2("virginia.farmingham@school.net"));
        System.out.println(username3("virginia.farmingham@school.net"));

    } //End Main
} // End Class