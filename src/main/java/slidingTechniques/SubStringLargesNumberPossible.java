package slidingTechniques;

import java.util.List;

public class SubStringLargesNumberPossible {
    static List<Integer> numbers = List.of(1, 5, 10, 3, 2, 15, 5, 0, 12, 3, 6, 20, 11, 0, 0, 20);
    static int subStringLength = 4;

    public static void main(String[] args) {
        int maxSum = 0;
        int tempSum;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i <= numbers.size() - subStringLength; i++) {
            tempSum = 0;
            List<Integer> subList = numbers.subList(i, subStringLength + i);

            for (Integer integer : subList) {
                System.out.println("subList integer = " + integer);
                tempSum += integer;
            }

            System.out.println("tempSum = " + tempSum + " Iteration = " + i);
            System.out.println("------");

            if (tempSum > maxSum) {
                maxSum = tempSum;
                startIndex = i;
                endIndex = subStringLength + i;
            }
        }
        System.out.println("maxSum = " + maxSum + " found between " + startIndex + " and " +  endIndex);
    }
}
