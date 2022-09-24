package com.example.test_task3;

import javafx.util.Pair;

import java.util.ArrayList;


import static com.example.test_task3.Card.equalsCard;

public class Player {
    private ArrayList<Card> fan;

    public Player() {
        this.fan = new ArrayList<>();
        makeFan();
    }

    private void makeFan() {

        Deck deck = new Deck();

        while (fan.size() < 8) {
            boolean trigger = true;
            Card possibleCard = deck.getRandomCard();
            for (Card card : fan) {
                if (equalsCard(card, possibleCard)) {
                    trigger = false;
                }
            }
            if (trigger) {
                fan.add(possibleCard);
            }

        }
    }

    public ArrayList<Pair<Integer, Suit>> getFan() {
        ArrayList<Pair<Integer, Suit>> playerFan = new ArrayList<>();

        for (Card card : fan) {
            Pair<Integer, Suit> pair = new Pair<>(card.getRank(), card.getSuit());
            playerFan.add(pair);
        }
        return playerFan;
    }
}
