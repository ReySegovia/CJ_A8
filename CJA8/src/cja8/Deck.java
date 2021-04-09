/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cja8;

/**
 *
 * @author reysegovia
 */

import java.util.*;

public class Deck {
    private Card[] deck;
    static ArrayList<String> deckCards = new ArrayList<>();
    ArrayList<String> hand = new ArrayList<>();

    public void deck() {
        deck = new Card[Card.cards];
        for (int i = 0; i < deck.length; i++) {
            deckCards.add(Card.Palo[i / 13] + Card.Color[i/26] + Card.Valor[i % 13]);
        }
    }
    
    public void shuffle() {
        Collections.shuffle(deckCards);
        System.out.println("Se mezcló el Deck \n");
    }

    public void head() {
        System.out.print(Card.dealCards());
        System.out.println("\nQuedan {" +Card.remainingCards+"}\n");
    }
    
    public void pick() {
        System.out.print(Card.dealCards() );
        System.out.println("\nQuedan {" +Card.remainingCards+"}\n");
    }
    
    public void hand () {
        hand.add(Card.dealCards());
        hand.add(Card.dealCards());
        hand.add(Card.dealCards());
        hand.add(Card.dealCards());
        hand.add(Card.dealCards());
        System.out.print(Arrays.toString(hand.toArray()));
        System.out.println("\nQuedan {" + Card.remainingCards + "}\n");
    }
}
