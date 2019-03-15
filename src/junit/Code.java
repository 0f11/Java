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
        for(int i = 0; i < input.length; i++) {
            for(int x = i + 1; x < input.length; x++) {
                if(input[i].equals(input[x])) {
                    ;
                }else{
                    returnMas[i] = input[i];
                }
            }
        }
        System.out.println(Arrays.toString(returnMas));
        return returnMas;
    }

    public static Integer sumIgnoringDuplicates(Integer[] integers) {
        return null;
    }

}
