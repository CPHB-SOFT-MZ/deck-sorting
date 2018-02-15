package org.ziemer;

public enum Suit {
    SPADES(1),
    HEARTS(2),
    CLUBS(3),
    DIAMONDS(4);

    private int value;

    Suit(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public static Suit getFromValue(int i) {
        for (Suit l : Suit.values()) {
            if (l.value == i) return l;
        }

        throw new IllegalArgumentException("Suit not found");
    }
}
