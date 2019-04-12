package exceptions.numbers;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;


public class NumberConverter {

    private Properties properties;
    private String language;

    public NumberConverter(String lang) {

        String filePath = String.format(
                "src/exceptions/numbers/numbers_%s.properties", lang);
        language = lang;
        properties = new Properties();
        FileInputStream is = null;

        try {
            is = new FileInputStream(filePath);

            InputStreamReader reader = new InputStreamReader(
                    is, Charset.forName("UTF-8"));

            properties.load(reader);
        } catch (Exception e) {
            // handle exceptions
        } finally {
            // close input stream
        }


    }

    public String numberInWords(Integer number) {
        String returbable;
        if (language.equals("en")) {
            if (properties.containsKey(Integer.toString(number))) {
                returbable = properties.getProperty(Integer.toString(number));
                return returbable;
            } else {
                if (number > 100) {
                    if (number < 120 && number > 110) {
                        String afterTen = String.format("%s%s",(number/10)%10,number%10);
                        if (properties.containsKey(afterTen)) {
                            return String.format("%s %s %s",properties.getProperty("1"),
                                    properties.getProperty("hundred"),properties.getProperty(afterTen));
                        }else{
                            return String.format("%s %s %s%s",properties.getProperty("1"),
                                    properties.getProperty("hundred"), properties.getProperty(Integer.toString(number%10)),
                                    properties.getProperty("teen"));
                        }
                    }
                    String firstNumber = properties.getProperty(Integer.toString(number % 10));
                    int helper = number/10;
                    String secondNumber = properties.getProperty(Integer.toString(((helper % 10)*10)));
                    String dash = properties.getProperty("tens-after-delimiter");
                    if (firstNumber.equals("zero")) {
                        firstNumber = "";
                        dash = "";
                    }
                    if (secondNumber.equals("zero")) {
                        secondNumber ="";
                        dash = "";
                    }

                    returbable = String.format("%s %s %s%s%s", properties.getProperty("1"), properties.getProperty("hundred"),
                            secondNumber, dash, firstNumber);

                    return returbable;
                }
                if (number < 20) {
                    String secondNumber = properties.getProperty(Integer.toString(number % 10));
                    returbable = String.format("%s%s", secondNumber, properties.getProperty("teen"));
                    return returbable;
                } else {
                    String secondNumber = properties.getProperty(Integer.toString(number % 10));
                    number /= 10;
                    String firstNumber = properties.getProperty(Integer.toString(number * 10));
                    returbable = String.format("%s-%s", firstNumber, secondNumber);
                }

            }
            return returbable;

        }
        if (language.equals("et")) {
            if (properties.containsKey(Integer.toString(number))) {
                returbable = properties.getProperty(Integer.toString(number));
                return returbable;
            }else{
                if (number >= 100) {
                    String oneHundred = String.format("%s%s",properties.getProperty("1"),properties.getProperty("hundred"));
                    int ifZero = number / 10;
                    if (number == 100) return oneHundred;
                    if (number%10 == 0) return String.format("%s %s%s",
                            oneHundred,properties.getProperty(Integer.toString(ifZero%10)),properties.getProperty("tens-suffix"));
                    if (number < 110) return String.format("%s %s",oneHundred,properties.getProperty(Integer.toString(number%100)));
                    if (number > 110 && number < 120) return String.format("%s %s%s",
                            oneHundred,properties.getProperty(Integer.toString(number%10)),properties.getProperty("teen"));
                    return String.format("%s %s%s %s",
                            oneHundred,properties.getProperty(Integer.toString(ifZero%10)),properties.getProperty("tens-suffix"),
                            properties.getProperty(Integer.toString(number%10)));
                }
                if (number < 20) {
                    String firstNumber = properties.getProperty(Integer.toString(number%10));
                    returbable = String.format("%s%s", firstNumber, properties.getProperty("teen"));
                    return returbable;
                }else{
                    if (number%10 == 0) {
                        return String.format("%s%s",properties.getProperty(
                                Integer.toString(number/10)),properties.getProperty("tens-suffix"));
                    }
                    String firstNumber = properties.getProperty(Integer.toString(number%10));
                    number /= 10;
                    String secondNumber = properties.getProperty(Integer.toString(number));

                    returbable = String.format("%s%s %s",secondNumber,properties.getProperty("tens-suffix"),firstNumber);
                    return returbable;
                }
            }

        }return null;
    }

}
