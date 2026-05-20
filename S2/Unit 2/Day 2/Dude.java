public class Dude{//Start Dude Class

    //Create Instance Varibles
    private boolean isGambler;
    private boolean isFurry;
    private String hairColor;
    private String eyeColor;

    //Create Constructors
    public Dude(){//Start Default Value Constructor
        isGambler = true;
        isFurry = false;
        hairColor = "Black";
        eyeColor = "Green";
        
    }//End Default Value Constructor

    public Dude(boolean g, boolean f, String h, String e){//Start All Value Constructor
        isGambler = g;
        isFurry = f;
        hairColor = h;
        eyeColor = e;
    }//End All Value Constructor


    //Define Getters
    public boolean getGambler(){ //Start getGambler
        return(isGambler);
    } //End getGambler

    public boolean getFurry(){ //Start getFurry
        return(isFurry);
    } //End getFurry

    public String getHairColor(){ //Start getHairColor
        return(hairColor);
    }

    public String getEyeColor() { //Start getEyeColor
        return(eyeColor);
    } //End getEyeColor
}//End Dude Class