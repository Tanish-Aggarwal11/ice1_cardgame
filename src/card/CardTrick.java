/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Tanish-Aggarwal11
 * studentId - 991760172
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a card Value (1-13): ");
        int value = in.nextInt();
        System.out.println("Please enter a suit: ");
        int suit = in.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);
        
        // and search magicHand here
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("YAY! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        // add one luckcard hard code 2,clubs
    }
    
}
