package collections.streaks;

import java.util.*;

public class Code {

    public static List<List<String>> getStreakList(String input) {
        LinkedList<List<String>> streaks = new LinkedList<>();
        for (char c : input.toCharArray()) {
            String s = String.valueOf(c);
            if (streaks.size() == 0) {
                streaks.add(new LinkedList<>(Arrays.asList(s)));
            }else if (streaks.getLast().contains(s)) {
                streaks.getLast().add(s);
            }else{
                streaks.add(new LinkedList<>(Arrays.asList(s)));
            }
        }return streaks;
    }
//        List<List<String>> streaks = new ArrayList<>();
//        List<String> currentStreak = new ArrayList<>();
//        for (String s : input.split("")) {
//            if (currentStreak.size() == 0 || currentStreak.contains(s)) {
//                currentStreak.add(s);
//            }else{
//                streaks.add(currentStreak);
//                currentStreak = new ArrayList<>();
//                currentStreak.add(s);
//            }
//            streaks.add(currentStreak);
//        }return streaks;
//    }


}
