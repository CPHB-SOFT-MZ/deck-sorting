package org.ziemer;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();

//	    for (Card c : deck.getCards()) {
//            System.out.println("Suit: " + c.getSuit().name() + ", value: " + c.getValue());
//        }

        deck.shuffle();

        for (Card c : deck.getCards()) {
            System.out.println("Suit: " + c.getSuit().name() + ", value: " + c.getValue());
        }

        System.out.println("------- Sorted -----");
        deck.sort(new ShellSort());

        for (Card c : deck.getCards()) {
            System.out.println("Suit: " + c.getSuit().name() + ", value: " + c.getValue());
        }


    }
}
