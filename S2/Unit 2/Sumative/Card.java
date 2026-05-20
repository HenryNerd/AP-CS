//Henry Veedahl
//This class creates a playing card object to store the attributes of the card

public class Card { //Start Class
    //Instance Varibles

    private String suit;
    private String face;
    private int value;

    //Contructors
    public Card() {
        suit = "";
        face = "";
        value = 0;
    }

    public Card(String s) {
        suit = s;
        face = "";
        value = 0;
    }

    public Card(String f, String s) {
        suit = s;
        face = f;
        if (f.equals("J") || f.equals("Q") || f.equals("K") || f.equals("A")) {//Set value of 11 for face cards
            value = 11;
        } else {//Else, set value to card's value
            int convertedFace = Integer.parseInt(f);
            value = convertedFace;
        }
    }

    public Card(int f, String s) {
        suit = s;
        face = String.valueOf(f);
        value = f;
    }

    public Card(String f, String s, int v) {
        suit = s;
        face = f;
        value = v;
    }

    //Seters
    public void setSuit(String s) {
        suit = s;
    }

    public void setFace(String f) {
        face = f;
        if (f.equals("J") || f.equals("Q") || f.equals("K") || f.equals("A")) {//Set value of 11 for face cards
            value = 11;
        } else {//Else, set value to card's value
            int convertedFace = Integer.parseInt(f);
            value = convertedFace;
        }
    }

    public void setValue(int v) {
        value = v;
    }

    //Getters
    public String getSuit() {
        return (suit);
    }

    public String getFace() {
        return (face);
    }

    public int getValue() {
        return (value);
    }

    //toString
    @Override
    public String toString() {
        return (face + " of " + suit);
    }

} //End Class
