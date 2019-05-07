package collections.simulator;

import java.util.Objects;

public class Card implements Comparable<Card> {

    public enum CardValue {s2, s3, s4, s5, s6, s7, s8, s9, s10, J, Q, K, A}

    public enum CardSuit {C, D, H, S}

    private CardValue value;
    private CardSuit suit;

    public CardValue getValue() {
        return value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public Card(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Card card = (Card) obj;

        return value == card.value && suit == card.suit;
    }

    @Override
    public int compareTo(Card other) {
        int x = CardValue.valueOf(this.value.toString()).ordinal();
        int y = CardValue.valueOf(other.value.toString()).ordinal();

        return Integer.compare(x, y);
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", value, suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value,suit);
    }
}
