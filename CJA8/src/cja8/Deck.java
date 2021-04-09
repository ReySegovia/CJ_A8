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
    ArrayList<String> deckCards = new ArrayList<>();
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
        System.out.print(dealCards());
        System.out.println("\nQuedan {" +Card.remainingCards+"}\n");
    }
    
    public void pick() {
        System.out.print(dealCards() );
        System.out.println("\nQuedan {" +Card.remainingCards+"}\n");
    }
    
    public void hand () {
        hand.add(dealCards());
        hand.add(dealCards());
        hand.add(dealCards());
        hand.add(dealCards());
        hand.add(dealCards());
        System.out.print(Arrays.toString(hand.toArray()));
        System.out.println("\nQuedan {" + Card.remainingCards + "}\n");
    }
    
    public String dealCards() {
        if (Card.selectedCard < deckCards.size()) {
            Card.subtract++;
            Card.remainingCards = Card.cards - Card.subtract;
            return deckCards.remove(Card.selectedCard);
        } else {
            System.out.println("\nQuedan {0}\n");
        }
        return null;
    }
}