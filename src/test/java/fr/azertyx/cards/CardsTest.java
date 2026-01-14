package fr.azertyx.cards;

import fr.azertyx.model.Card;
import fr.azertyx.model.Suit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardsTest
{
    @Test
    void ClubsCardIsCorrectlyMapToClubsTypeTest() {
        Card card = new ClubsCard(1);

        assertEquals(Suit.CLUBS, card.getSuit());
        assertEquals(1, card.getValue());
    }

    @Test
    void DiamondsCardIsCorrectlyMapToDiamondsTypeTest() {
        Card card = new DiamondsCard(1);

        assertEquals(Suit.DIAMONDS, card.getSuit());
        assertEquals(1, card.getValue());
    }

    @Test
    void HeartsCardIsCorrectlyMapToHeartsTypeTest() {
        Card card = new HeartsCard(1);

        assertEquals(Suit.HEARTS, card.getSuit());
        assertEquals(1, card.getValue());
    }

    @Test
    void SpadesCardIsCorrectlyMapToSpadesTypeTest() {
        Card card = new SpadesCard(1);

        assertEquals(Suit.SPADES, card.getSuit());
        assertEquals(1, card.getValue());
    }
}
