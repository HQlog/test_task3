package com.example.test_task3;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private final ArrayList<Card> cardList;

    public Deck(){
        this.cardList = new ArrayList<>();
        createDeck();
    }
    private void createDeck() {
        for (int i = 6; i <= 15; i++) {
            for (Suit suit : Suit.values()){
                Card card = new Card(i, suit);
                cardList.add(card);
            }
        }
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }
    public Card getRandomCard() {
        Random random = new Random();
        int n = random.nextInt(36);

        return cardList.get(n);
    }





}
