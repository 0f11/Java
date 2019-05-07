package collections.set;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.*;


public class Birthday {

    @Test
    public void runCode() {
        List<Integer> list  = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(firstCollision());
        }
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum / list.size());

        // pick random day in a loop
        // find how many iterations till first collision (got the same number)



    }

    private int firstCollision() {
        Random r = new Random();


        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 365; i++) {

            int randomDayOfYear = r.nextInt(365);

            if (set.contains(randomDayOfYear)) {
                return i;
            }else{
                set.add(randomDayOfYear);
            }
        }throw new IllegalStateException("Should not be here");
    }

}
