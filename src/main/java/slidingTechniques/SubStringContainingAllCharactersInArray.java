package slidingTechniques;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SubStringContainingAllCharactersInArray {
    static String input = "abdacfxficbxa";
    static List<Character> list = List.of('a', 'b', 'c', 'x');
    static int subStringLength = list.size();

    public static void main(String[] args) {
        /**
         * input: abdacf , a,b,c #string size = 6 | length = 5
         * output: bdac
         */

        checkIfSubStringContainsAllCharacters(getSubString(subStringLength));

    }

    private static boolean checkIfSubStringContainsAllCharacters(List<String> subStrings) {
        for (String subString : subStrings) {
            int matches = 0;
            for (Character c : list) {
                if (subString.contains(c.toString())) {
                    matches++;
                }
            }
            if (matches == list.size()) {
                System.out.println("Substring = " + subString);
                return true;
            }
        }

        subStringLength++;
        checkIfSubStringContainsAllCharacters(getSubString(subStringLength));
        return false;
    }

    private static List<String> getSubString(int subStringEndIndex) {
        List<String> result = new ArrayList<>();
        String subString;
        for (int i = 0; i < input.length(); i++) {
            int endIndex = subStringEndIndex + i;
            if (input.length() >= endIndex) {
                subString = input.substring(i, endIndex);
                result.add(subString);
            }
        }
        return result;
    }
}

