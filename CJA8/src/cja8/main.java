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

public class main{     
    public static void main(String args[]) {         
        Deck deck = new Deck();
        deck.deck();     
        deck.shuffle();  
        deck.head();     
        deck.pick();
        deck.hand();
    }
}