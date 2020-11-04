package exercises.number.romanToArabic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Converter {
    Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );
    List<Character> validCharacters = new ArrayList<>(map.keySet());

    public int fromRomanToInt(String number) {

        if (number.length() == 0) {
            return Integer.MIN_VALUE;
        } else {
            number = removeInvalidCharacters(number);
        }

        int sum = 0;
        int i = 0;
        int iterations = number.length();

        if (iterations == 1) {
            return map.get(number.charAt(i));
        }
        while (i < iterations) {
            char firstChar = number.charAt(i);
            int firstInt = map.get(firstChar);
            int nextInt = 0;

            if (i + 1 < iterations) {
                char nextChar = number.charAt(i + 1);
                nextInt = map.get(nextChar);
            }

            if (firstInt == nextInt) {
                sum += firstInt + nextInt;
                i++;
            } else if (firstInt < nextInt) {
                sum += nextInt - firstInt;
                i++;
            } else {
                sum += firstInt;
            }
            i++;
        }
        return sum;
    }

    private String removeInvalidCharacters(String number) {
        number = toUpperCase(number);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            for (Character c : validCharacters) {
                if (c.equals(number.charAt(i))) {
                    builder.append(c);
                }
            }
        }
        return builder.toString();
    }

    private String toUpperCase(String number) {
        return number.toUpperCase();
    }
}
