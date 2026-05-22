//Henry Veedahl
//This class is a player for the black jack card game but could likley encompas other games as well.

import java.util.ArrayList;

public class Player{
    //Instance Varibles
    private String playerName;
    private int playerHandValue;
    private int playerBalance;
    private ArrayList<Card> playerHand = new ArrayList<Card>();

    public Player(String name){
        playerName = name;
        playerHandValue = 0;
        playerBalance = 100;
    }

    public String getName(){
        return(playerName);
    }

    public int getBalance(){
        return(playerBalance);
    }

    public ArrayList<Card> addCardtoHand(Card c){
        playerHand.add(c);
        return(playerHand);
    }

    public ArrayList<Card> getHand(){
        return(playerHand);
    }
}