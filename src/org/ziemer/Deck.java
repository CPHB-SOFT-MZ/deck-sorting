package org.ziemer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    private Card[] cards;

    public Deck() {
        cards = new Card[52];
        int index = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cards[index] = new Card(j, Suit.getFromValue(i));
                index++;
            }
        }
    }

    public Card[] getCards() {
        return this.cards;
    }

    public void shuffle() {
        for (int i = 1; i < this.cards.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, i);
            Card toChange = cards[randomNum];
            cards[randomNum] = cards[i];
            cards[i] = toChange;
        }
    }

    public void sort(Sort sort) {
        sort.sort(this.cards);
    }

    public boolean isSorted() {
        return false;
    }
}
