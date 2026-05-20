//Henry Veedahl
//This program tests my previously made Card Class

public class CardTest{
    public static void main(String[] uriel){
        Card c1 = new Card();
        Card c2 = new Card(5, "hearts");
        Card c3 = new Card(13, "diamonds");
        Card c4 = new Card("A", "spades");
        c2.setFace("J");
        c2.setValue(10); 
        System.out.println(c3.getValue());
        System.out.println(c3.getFace());
    }
}