package types;

public class Code {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        String svalue = "ab" + 1;
        System.out.println(asString(numbers)); // 11
    }

    public static Integer sum(Integer[] numbers) {
        Integer sum1 = 0;
        for (Integer number : numbers) {
            sum1 += number;
        }
        return sum1;
    }


    public static Double average(Integer[] numbers) {
        Double sum1 = 0.0;
        for (Integer number : numbers) {
            sum1 += number;
        }
        return sum1 / numbers.length;
    }

    public static Integer minimumElement(Integer[] integers) {
        if (integers.length == 0) {
            return null;
        }

        Integer min = integers[0];

        for (Integer number : integers) {

            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static String asString(Integer[] elements) {
        String entry = "";
        for (Integer element : elements) {
            entry += element + ", ";

        }
        return entry.substring(0, entry.length() - 2);
    }

    public static String squareDigits(String svalue) {
        String sqroot = "";
        for (char chars : svalue.toCharArray()) {
            if (Character.isDigit(chars)) {
                String i = Character.toString(chars);
                int x = Integer.parseInt(i);
                sqroot += x * x;
            }
            else {
                sqroot += chars;
            }
        }
        return sqroot;
    }



}
