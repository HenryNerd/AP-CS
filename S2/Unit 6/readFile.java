/*
Natalie Dykhuis

This program will show you how to read text from a file and
order of operations and casting variables

*/

import java.io.*;//For the File
import java.util.*;//For the scanner

public class readFile{
   //throws FileNotFoundException just makes sure that the file we try to use
   //exists or it throws an error/exception
   //Java requires us to handle FileNotFoundExceptions
   public static void main(String[] args) throws FileNotFoundException{
      //The File class stores a File object 
      //which allows us to read or write to a file
      //Create a File object for the file we want to read from
      File file = new File("example.txt");
      
      //Create the scanner to read from our file for us
      //The set up for the scanner is the same as usual except for the System.in
      //Scanner(fileObject)
      Scanner input = new Scanner(file);
      
      //To read in from a file, we should check that the file isn't empty
      //.hasNext() checks if there is a next item in the file
      if(input.hasNext()){
         System.out.println("There is a next line in my file");
      }
      
      //Reminders of our nexts
      //.next() gets up to the next space
      //.nextLine() gets up to the next enter
      //.nextInt() gets the next int
      //.nextDouble() gets the next double
      //.nextBoolean() gets the next boolean
      
      //To read in just the first name from our text file, we use .next()
      //NOTE: The scanner is like a placeholder, so it moves through the file
      //when we use a next, the scanner moves forward
      int totalScore = 0;
      int count = 0;
      
      //while I have things left in my file
      while(input.hasNext()){
      
         String name = input.next();
      
      //Get the score after the name
         int score = input.nextInt();
         
         //Add the score to total
         totalScore += score;
         
         //Add one to the count
         count++;
      
         System.out.println(name+" scored "+score);
      }//end of while
      
      //The proper thing to do after using a scanner
      //is to close it
      input.close();
      
      
      //The average should be 85.5
      //Gives 85.0 because it converts to a double after doing the math with two ints
      double average = totalScore/count;       
      System.out.println("The average score was "+average);
      
      //Two ints give an int (chops off the decimal place)
      //Two doubles give a double
      //An int and a double gives a double
      
      //To fix the problem with losing the .5 we can use type casting
      //We can cast one data type into another
      //Changes totalScore to a double then does the calculation
      average = (double)totalScore/count; 
      System.out.println("The average of the scores was actually "+average);
      
      //Order of operations for Java goes left to right
      //1.()
      //2. ++, --
      //3. *, /, %
      //4. +, -
      
      int a = 10;
      int b = 3;
      double c = 2.0;
      double result = (double)(a/b)+a/c;
      System.out.println("(10/3)+10/2.0="+result);
      
            
   }//End of main
   
}//End of program