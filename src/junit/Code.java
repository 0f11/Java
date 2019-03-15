package junit;

import java.util.Arrays;

public class Code {

    public static boolean isSpecial(Integer number) {
        return false;
    }

    public static Integer longestStreak(String input) {
        if (input.length() == 0) {
            return 0;
        }
        String[] chars = input.split("");
        String lastSym = chars[0];
        System.out.println(lastSym);
        int streakLength = 0;
        int longestStreak = 0;
        for(String c : chars) {
            if (c.equals(lastSym)) {
                streakLength++;
            }else{
                streakLength = 1;
            }
            if (longestStreak < streakLength) {
                longestStreak=streakLength;
            }
            lastSym = c;
        }

        return longestStreak;
    }

    public static Integer[] removeDuplicates(Integer[] input) {
        Integer[] returnMas = new Integer[input.length];
        int index = 0;
        int dupCount = 0;
        for(int i = 0; i < input.length - 1; i++) {
            Integer currentEl = input[i];
            if (currentEl != input[i+1]) {
                returnMas[index++] = currentEl;
            }else{
                dupCount++;
            }
        }
        System.out.println(dupCount);
        returnMas[index++] = input[input.length - 1];

        Integer[] correctReturn = new Integer[input.length - dupCount];
        int indexTwo = 0;
        for(int i = 0; i < returnMas.length; i++) {
            if(returnMas[i] != null) {
                correctReturn[indexTwo++] = returnMas[i];

            }
        }
        return correctReturn;
    }

    public static Integer sumIgnoringDuplicates(Integer[] integers) {
        return null;
    }

}
