/*
Henry Veedahl

Logicoperators and else-if
*/

import javax.swing.*;

public class logicOperators{//Start Class

    public static void nothing(){
                while(true == true){
            int age = getNum("Enter Your Age");
            int worth = getNum("Enter Your Current Net Worth");
            String ageElible;
            String worthElible;
            String worthTotal;
            
            if(age > 14){
                ageElible = "Eligible";
            }
            else{
                ageElible = "Not Eligible";
            }
            if(worth >= 40){
                worthElible = "Eligible";
            }
            else{
                worthElible = "Not Eligible";
            }
            if(age > 14 && worth >= 40) {
                worthTotal = "Eligible";
            }
            else{
                worthTotal = "Not Eligible";
            }
            JOptionPane.showMessageDialog(null, "Dog Purchase Eligblity \n Age: "+ageElible+"\n Money: "+worthElible+"\n \n Final Eligbility: "+worthTotal);
            
        }
    }

    public static int getNum(String prompt){//Start Get Num
        String unparsedInput = JOptionPane.showInputDialog(null, prompt);
        int parsedInput;
        try {
            parsedInput = Integer.parseInt(unparsedInput);
        } catch (Exception e) {
            parsedInput = 0;
            JOptionPane.showMessageDialog(null, "Error - Input Not Allowed");
        }
        return(parsedInput);
    } //End Get Num

    public static void main(String [] anders){//Start Main



        // || mean if one of the things is true (ex: 1=1 || 1=2)

    }//End Main

}//End Class