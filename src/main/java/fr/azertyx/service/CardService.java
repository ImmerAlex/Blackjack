package fr.azertyx.service;

import fr.azertyx.model.Card;

import java.util.Random;

public class CardService
{
    Card[] deck = new Card[52];
    private int index = 0;

    public void shuffle() {
        Random r = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card draw() {
        if (index == deck.length) {
            System.out.println("Deck is empty, shuffle...");
            index = 0;
            shuffle();
        }
        return deck[index++];
    }

    public void reset() {
        index = 0;
        shuffle();
    }
}
