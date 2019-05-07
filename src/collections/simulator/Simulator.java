package collections.simulator;

import java.util.*;

public class Simulator {

    private final double totalFrequency = 2598960d;
    private final double onePairFrequency = 1098240d;
    private final double twoPairsFrequency = 123552d;
    private final double threeOfaKindFrequency = 54912d;
    private final double fullHouseFrequency = 3744d;

    public Map<HandType, Double> calculateProbabilities() {
        Map<HandType, Double> map = new HashMap<>();
        map.put(HandType.PAIR, (onePairFrequency * 100) / totalFrequency);
        map.put(HandType.TWO_PAIRS, (twoPairsFrequency * 100) / totalFrequency);
        map.put(HandType.THREE_OF_A_KIND, (threeOfaKindFrequency * 100) / totalFrequency);
        map.put(HandType.FULL_HOUSE, (fullHouseFrequency * 100) / totalFrequency);


        return map;
    }
}
