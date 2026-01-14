package fr.azertyx.model;

public abstract class Card
{
    protected int value;
    protected Suit suit;

    public Card(int value, Suit suit)
    {
        this.value = value;
        this.suit = suit;
    }
}
