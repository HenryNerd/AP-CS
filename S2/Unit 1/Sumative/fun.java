public class fun{ //Start Class

    public static String username1(String email){ //Start Username 1
        String username = "";

        return(username);
    } //End Username 1

    public static String username2(String email){ //Start Username 2
        String username = "";

        return(username);
    } //End Username 2

    public static String username3(String email){ //Start Username 3
        String username = "";

        return(username);
    } //End Username 3

    public static String emailParser(String email){ //Start emailParser
        String firstName = "";
        String lastName = "";
        char current;
        String currentString;
        int firsti;
        int secondi;

        for(firsti = 0; firsti < email.length(); firsti++){ //Start for loop
            current = email.charAt(firsti);
            currentString = String.valueOf(current);
            if(currentString.equals(".")){ //Start if Break
                break;
            } //End if Break

            firstName = firstName + current;
        } //End for loop

        firsti ++;

        for(secondi = firsti; secondi < email.length(); secondi++){
            current = email.charAt(secondi);
            currentString = String.valueOf(current);
            if(currentString.equals("@")){ //Start if Break
                break;
            } //End if Break

            lastName = lastName + current;
        }

        return(firstName+" "+lastName);

    } //End emailParser

    public static void main(String[] biggie){ //Start Main
        System.out.println(emailParser("henry.veedahl@outlook.com"));
    } //End Main
} // End Class