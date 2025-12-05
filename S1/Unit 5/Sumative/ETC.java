//Import Packages

import javax.swing.*;

/*
Henry Veedahl

This program will quiz users of the PACs lighitng system control board
 */
public class ETC {//Start Class

    //Asks the users a question then returns the users awnser
    public static String ask(String theQuestion) {//Start ask
        String theAwnser = JOptionPane.showInputDialog(null, theQuestion);
        return (theAwnser);
    }//End ask

    public static void print(String toPrint) {//Start print
        JOptionPane.showMessageDialog(null, toPrint);
    }//End print

    public static void question(int index, String theQuestion) {//Start 
    }

    public static void main(String[] anders) {//Start Main

        Boolean[] result = {false, false, false, false, false};

        print("This quiz will test yoy on the ETC lighting control sysestem in both the PAC \n and black box theather. You must get all questions correct to pass this test.");

        //Question 0
        String userAwnser = ask("Set All Lights 1-1000 at 100% intensity");
        if (userAwnser.equalsIgnoreCase("Chan 1-1000 at Full")) {
            result[0] = true;
        } else if (userAwnser.equalsIgnoreCase("Chan 1-1000 at 100")) {
            result[0] = true;
        } else {
            result[0] = false;
        }

        //Question 1
        userAwnser = ask("Set All Lights Back To Defaults");
        if (userAwnser.equalsIgnoreCase("Sneak")) {
            result[1] = true;
        } else if (userAwnser.equalsIgnoreCase("Chan 1-1000 Sneak")) {
            result[1] = true;
        } else {
            result[1] = false;
        }

        //Question 2
        userAwnser = ask("Set The Lights connected to chanels 78-82 to a raibow effect at 50% intesity");
        if (userAwnser.equalsIgnoreCase("Chan 78 Thru 82 at Full Effect 917")) {
            result[2] = true;
        } else {
            result[2] = false;
        }


        //Show Results
        String finalResult;

        if(result[0] == true && result[1] == true && result[2] == true){
            finalResult = "Pass";
        }
        else{
            finalResult = "Fail";
        }

        print("Results \n \n Question 1 Pass: "+result[0]+"\n Question 2 Pass: "+result[1]+"\n Question 3 Pass: "+result[2]+"\n \nFinal Result: "+finalResult);
    }//End Main
}//End Class
