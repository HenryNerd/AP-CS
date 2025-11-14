/*
Henry Veedahl

This program will show you how to use casting the min and max values and the Math class
*/

public class castingMathClass {//Start Class

    public static void main(String[] args) {//Start Main
        //Int + Int = Int
        //Double + Double = Double
        //Int + Double = Double

        System.out.println("3/4");

        int num1 = 3,num2 =4;

        //You can;t add a .0 to the end of a varible

        //we use type casting
        //tells the computer to give us the awnser in a specific datatype

        System.out.println((double) (3 / 4));

        //You can also cast a int to a double
        //Castic will work on the next value
        //If you have 2 doubles and want a int

        System.out.println((int) 5.5 / 4.5);

        //Casts result
        System.out.println((int) (5.5 / 4.5));

        //To see the max value
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

        //Try to take the square root of a number using java
        System.out.println(Math.sqrt(20));


        //Take absolute value
        System.out.println(Math.abs(-20));

        //Exponents
        System.out.println(Math.pow(2,5));
        //System.out.println(Math.abs(exponent, number));

    }//End Main

}//End Class