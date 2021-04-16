/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cja8;
import java.util.Scanner;
/**
 *
 * @author reysegovia
 */

public class main{     
    public void showMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecciona una opción");
        System.out.println("1. Mezclar deck");
        System.out.println("2. Sacar una carta");
        System.out.println("3. Sacar carta al azar");
        System.out.println("4. Generar una mano de 5 cartas");
        System.out.println("0. Salir");
        Deck deck = new Deck();
        deck.deck();     
        int option = input.nextInt();
        
        while (option > 0) {
            if (option < 1 || option > 4){
                System.err.println("Opción no válida");
                System.err.println("Teclea un número del 0 al 4");
                if (input.hasNextInt())
                    option = input.nextInt();
            }
            
            else if (option == 1) {
                deck.shuffle();
                if (input.hasNextInt())
                    option = input.nextInt();

            }
            else if (option == 2) {
                deck.head();
                if (input.hasNextInt())
                    option = input.nextInt();

            }
            else if (option == 3) {
                deck.pick();
                if (input.hasNextInt())
                    option = input.nextInt();
            }
            else if (option == 4) {
                deck.hand();
                if (input.hasNextInt())
                    option = input.nextInt();
            }
            else if (option == 0) {
                break;
            }
        }
    }
    
    public static void main(String args[]) {  
        System.out.println("Bienvenido al Poker");
        main showMenu = new main();
        showMenu.showMenu();
    }
}
