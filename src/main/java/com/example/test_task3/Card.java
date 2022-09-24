package com.example.test_task3;

public class Card {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static boolean equalsCard (Card card1, Card card2) {
        return card1.getSuit() == card2.getSuit() && card1.getRank() == card2.getRank();
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
