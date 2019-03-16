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
        int x = 0;
        Arrays.sort(input);
        int counter = 0;
        int size = input.length;
        for (int i = 0; i < size - 1; i++) {
            if (input[i] != input[i + 1]) {
                returnMas[x++] = input[i];
            } else {
                counter++;
            }
        }

        returnMas[x++] = input[size - 1];
        for (int i = 0; i < x; i++) {
            input[i] = returnMas[i];
        }
        Integer[] returnable = new Integer[input.length - counter];
        int y = 0;
        for (int i = 0; i < returnable.length; i++) {
            if (returnMas[i] != null) {
                returnable[y++] = returnMas[i];
            }
        }
        return returnable;
    }


    public static Integer sumIgnoringDuplicates(Integer[] integers) {
        Integer[] sum = removeDuplicates(integers);
        int returnable = 0;
        for(int nr : sum) {
            returnable += nr;
        }
        return returnable;
    }

}
