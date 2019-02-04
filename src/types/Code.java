package types;

public class Code {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{-2};
        String svalue = "abs" + 1;
        System.out.println(asString(numbers)); // 11
    }

    public static Integer sum(Integer[] numbers) {
        Integer sum11 = 0;
        for (Integer number : numbers) {
            sum11 += number;
        }
        return sum11;
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
        if (elements.length == 0) {
            return "";
        }

        String entry = "";

        for (Integer element : elements) {
            entry += element + ", ";

        }
        return entry.substring(0, entry.length() - 2);
    }

    public static String squareDigits(String svalue) {
        String sqroot = "";
        for (int i = 0, n = svalue.length() ; i < n ; i++) {
            char c = svalue.charAt(i);
            if (Character.isDigit(c)) {
                String y = Character.toString(c);
                int x = Integer.parseInt(y);
                sqroot += x * x;
            }
            else {
                sqroot += c;
            }
        }
        return sqroot;
    }



}
