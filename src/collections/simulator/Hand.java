package collections.simulator;

import java.util.*;

public class Hand {

    private List<Card> listOfCards = new ArrayList<>();

    public void addCard(Card card) {

        listOfCards.add(card);

    }

    private Map<String, List<Card>> listToMap(List<Card> listOfCards) {
        Map<String, List<Card>> cardMap = new HashMap<>();
        for (Card c : listOfCards) {
            if (!cardMap.containsKey(c.getValue().toString())) {
                cardMap.put(c.getValue().toString(), new ArrayList<>(Arrays.asList(c)));
            }else{
                String currentCard = c.getValue().toString();
                List<Card> currentList = cardMap.get(currentCard);
                currentList.add(c);
                cardMap.put(currentCard, currentList);
            }
        }return  cardMap;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        for (Card c : listOfCards) {
            toString.append("Card {").append(c.getSuit()).append(", ").append(c.getValue()).append("}");
        }return toString.toString();
    }

    public boolean isOnePair() {
        if (!isFullHouse() && !isTwoPairs() && listOfCards.size() >= 2) {
            Map<String, List<Card>> map = listToMap(listOfCards);

            for (List<Card> c : map.values()) {
                if (c.size() == 2) return true;
            }

        }return false;
    }

    public boolean isTwoPairs() {
        int counter = 0;
        if (listOfCards.size() >= 4 && !isFullHouse()) {
            Map<String, List<Card>> map = listToMap(listOfCards);
            for (List<Card> c : map.values()) {
                if (c.size() == 2) {
                    counter++;
                }
            }
        }
        if (counter == 2) return true;
        return false;
    }

    public boolean isTrips() {
        int counter = 0;
        if (listOfCards.size() >= 4 && !isFullHouse()) {
            Map<String, List<Card>> map = listToMap(listOfCards);
            for (List<Card> c : map.values()) {
                if (c.size() == 3) {
                    counter++;
                }
            }
        }if (counter == 1) return true;
        return false;
    }

    public boolean isFullHouse() {
        boolean gateOne = false;
        boolean gateTwo = false;
        if (listOfCards.size() == 5) {
            Map<String, List<Card>> map = listToMap(listOfCards);
            for (List<Card> c : map.values()) {
                if (c.size() == 2) {
                    gateOne = true;
                }else if(c.size() == 3) {
                    gateTwo = true;

                }
            }
        }else {
            return false;
        }return gateOne && gateTwo;
    }

}
