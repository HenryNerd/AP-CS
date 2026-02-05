//Henry Veedahl
//Into Review
public class WelcomeBack{ //Start Class
    //Also Unit 2
    //Functions allow us to run code mutliple times over again.
    //Must be writen inside of the class but outside of the 

    public static void coolFunction(){//Start coolFunction
        System.out.println("-----------------------");
        System.out.println("A really cool function");
        System.out.println("-----------------------");
    }//End coolFunction

    //Function with Paramtwers
    public static void functionsWithParamters(String name){ //Start functionsWithParamters
        if(name.length() >= 7){
            System.out.println("Wow thats a long name there buddy");
        }
        else{
            System.out.println("Short Name");
        }
    }//End functionsWithParamters

    public static int functionWithParmatersandReturns(int max){//Start functionWithParmatersandReturns
        return(9);
    }//End functionWithParmatersandReturns
    // This function returns an int and acepts an int

    //Void means the function dosen't return anything
    //Empty inside the () mean it dosen't acept any kind of arguments

    public static void main(String[] uriel){ //Start Main

        // Unit 1

       //Varibles are placeholders for values
       //Varibles are defined using a data type
       //We create varibles with dataType varibleName;
       int wholeNumber = 20; //Whole Number
       double decimalNumber = 3.14159262355; //Decimal Number
       boolean trueOrFalse = false; //True or False
       char singleLetter = 'd'; //Single Charcter
       String senstence = "hello world"; //Sentence (List of chars)
       
        //You can print to the consle with System.out.println();
        //You can concatanate strings (Join Tetx) using the +
        //You can also use \ to allow use of special charcters for exaple to type \ you would put \\
        //You can also use \n for new line
       System.out.println("A really cool number is "+wholeNumber+". Another cool number is "+decimalNumber+"\n These numbers are equal to eachother is "+trueOrFalse+". A really cool letter is "+singleLetter+". A really cool sentence is "+senstence);

       //Unit 2
       coolFunction();
       //Must call function to use code inside of it
       functionsWithParamters("Henry"); //Henry is the argument
       functionsWithParamters("Natalie"); //Natalie is the argument
       functionsWithParamters("Bob"); //Bob is the argument
        


    } //End Main
} //End Class