/* 
Henry Veedahl

This Program will show you how to do math in java
*/

public class mathOperators{ //Start Class

    public static void main(String[] args) { //Start main
        int num1 = 5; //Stores Intagers
        int num2 = 3;
        double num3 = 7.5; //Stores a number with decimals or real numbers

        //To add two numbers together use the + operator
        System.out.println(num1+num2);

        System.out.println(num1+" + "+num2+" = "+ num1+num2); //Does not work need ()

        System.out.println(num1+" + "+num2+" = "+ (num1+num2)); //() mean do the math and don't treat as strings

        //You can add a int and double together
        // Int + Int = Int
        // Double + Double = Double
        // Int + Double = Double

        System.out.println(num1 + num3);

        //You can subtract by using the minus operator
        //All the rules that apply to adding apply to subracting

        System.out.println(num1+" - "+num2+" = "+ (num1-num2));

        System.out.println(10+" - "+35+" = "+ (10-35)); // You can also use normal numbers

        System.out.println(40+" - "+num1+" = "+ (40-num1)); //You can also mix numbers and varibles

        //Multiplacation uses the *

        System.out.println(num1+" x "+num2+" = "+ (num1*num2));


        //Devsion is also possible using /
         System.out.println(num1+" / "+num2+" = "+ (num1/num2));


         //Mod takes the remainer of 2 numbers and uses the percent operator to display the remainer

         System.out.println(37%5);

         //If a number%2 has a remained it is odd

         System.out.println("");

         //num++ is num + 1


    }
    
}