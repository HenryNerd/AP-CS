import javax.swing.*;
import java.util.ArrayList;

public class Main{
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static ArrayList<Card> deck = new ArrayList<Card>();

    public static void showPlayerList(){
        String playerOutput = "Players \n \n";
        for(int i = 0; i < players.size(); i++){
            playerOutput = playerOutput + players.get(i).getName() + " | $" + players.get(i).getBalance() + "\n";
        }
        JOptionPane.showMessageDialog(null, playerOutput, "Black Jack - Players", -1);
    }

    private static ArrayList<Card> newDeck() {//returns a shuffled deck arrayList
        ArrayList<Card> fullDeck = new ArrayList<Card>();
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();
        String currentSuit = "";
        int cardShuffleIndex;
        
        //Builds Deck
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

        //Shuffles Cards
        for(int j = 52; j > 0; j--){
            cardShuffleIndex = (int)(Math.random() * j);
            shuffledDeck.add(fullDeck.get(cardShuffleIndex));
            fullDeck.remove(cardShuffleIndex);
        }

        return(shuffledDeck);
    }
    public static void main(String[] args){
        boolean active = true; 
        
        
        //Welcome & Game Setup
        JOptionPane.showMessageDialog(null, "Welcome to Black Jack. Lets jump stright into a game.", "Black Jack - Welcome", -1);
        while(active){
            players.add(new Player(JOptionPane.showInputDialog(null, "Player's Name:", "Black Jack - Add Player", -1)));
            if(JOptionPane.showConfirmDialog(null, "Would you like to add another player?", "Black Jack", JOptionPane.YES_NO_OPTION, -1) == 1){active = false;}
        }
        players.add(new Player("Dealer"));
        showPlayerList();

        //Game Loop
        active = true;
        while(active){
            deck = newDeck();

            //Deal Cards
            for(int a = 0; a < players.size(); a++){
                players.get(a).addCardtoHand(deck.get(deck.size()-1));
                deck.remove(deck.size()-1);
                players.get(a).addCardtoHand(deck.get(deck.size()-1));
                deck.remove(deck.size()-1);
            }

            //Turns Round 1
            for(int b = 0; b < players.size(); b++){
                JOptionPane.showMessageDialog(null, "Hi, "+players.get(b).getName()+"\n "+players.get(b).getHand());
            }

            active = false;
        }
    }
}