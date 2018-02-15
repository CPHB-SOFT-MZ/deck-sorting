package org.ziemer;

public class Card implements Comparable<Card> {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public int compareTo(Card other) {

        if (this.suit.getValue() < other.suit.getValue()) {
            return -1;
        } else if (this.suit.getValue() > other.suit.getValue()) {
            return 1;
        } else {
            return Integer.compare(this.value, other.value);
        }
    }
}
