

/*
Henry Veedahl

This program will show you how to use if statments
*/

import javax.swing.*;

public class boolsAndIfs {

    public static void print(String thingToPrint){
        System.out.println(thingToPrint);
    }

    public static void main(String[] kevin){
        boolean isSleeping = true;

        System.out.println("Hello".equals("Hello"));


        if(5 > 4){
            //This code will run becuase 5 is grater than 4
            System.out.println("5>4");
        }
        if(5 > 6){
            //This code will run becuase 5 is grater than 4
            System.out.println("5>6");
        }

        String name = JOptionPane.showInputDialog(null, "What is your name");
        if(name.equals("Kevin")){
            print("Good");
        }
        else{
            print("Sad");
        }
    }
}