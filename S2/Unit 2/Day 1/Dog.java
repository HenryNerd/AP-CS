//Henry Veedahl

public class Dog{
    //You start every class by defining an instance varibles
    //Intance Varibles are attributes of the class
    //Instance varibles are what belong to every object of the class

    //private means that classes outside of this class can't directly acess this varible
    //private means we need to write a method to get or change that varible

    //public means other classes can acess this class, method, or varibles

    //protected means subclasses have acess but nothing else

    private int tails;
    private int kidneys;
    private String breed;
    private boolean isFurry;
    private boolean hasSkin;

    //Constructors
    //Contructors create an instacnce of my object
    //Constructors are called when we create an object

    //You should always start with a default constructor with no prameters

    public Dog(){//Start Dog Constructor
        tails = 1;
        kidneys = 2;
        breed = "";
        isFurry = false;
        hasSkin = true;

        System.out.print("In default constructor");
    }//End Dog Constructor 

    //You can create multiple constructors as long as they have diffrent prameters

    public Dog(String b){
        //Since I have a pramter that is going to get the value of my breed 
        //Instead of setting breed to nothing I can set it to my pramter

        tails = 1;
        kidneys = 2;
        breed = b;
        isFurry = false;
        hasSkin = true;

        System.out.print("In my 1 paramter constructor");

    }

    //As long as they have difrent parmaters you can have as many constructors as you want
    //Data type matters
    //this is called overloading

    public Dog(int t, int k,String b, boolean f, boolean s){
        tails = t;
        kidneys = k;
        breed = b;
        isFurry = f;
        hasSkin = s;

        System.out.print("In my all paramter constructor");
    }

    //Create a method that reutrns the value of our instance varibles
    //These methods are called getters or acessers.
    //Methods are just functions in a class

    public String getBreed(){
        //Return the varible you wish to acess
        return(breed);
    }

}