import java.util.ArrayList;

public class Test {
    private static ArrayList<Card> newDeck() {
        ArrayList<Card> fullDeck = new ArrayList<Card>();
        String currentSuit = "";

        for (int i = 0; i < 4; i++) {
            switch(i) {
                case 0: currentSuit = "S"; break;
                case 1: currentSuit = "C"; break;
                case 2: currentSuit = "D"; break;
                case 3: currentSuit = "H"; break;
            }
            for (int k = 1; k <= 13; k++) {
                switch (k) {
                    case 1: fullDeck.add(new Card("A", currentSuit)); break;
                    case 11: fullDeck.add(new Card("J", currentSuit)); break;
                    case 12: fullDeck.add(new Card("Q", currentSuit)); break;
                    case 13: fullDeck.add(new Card("K", currentSuit)); break;
                    default: fullDeck.add(new Card(k, currentSuit)); break;
                }
            }
        }
        return (fullDeck);
    }

    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 52) + 1);
    }
}
