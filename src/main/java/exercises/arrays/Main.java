package exercises.arrays;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        sortInt(getIntArray());
//        sortArray(getStringArray());
//        sumOfIntArray(getIntArray());
//        printGrid();
//        getAverageValue();
//        containsValue(getIntArray(), 3);
//        containsValue(getStringArray(), "aa ");
//        getIndexValue(getStringArray(), 10);
//        getIndexValue(getIntArray(), 1);
//        removeValueByIndex(getIntArray(), 2);
//        removeValueByIndex(getStringArray(), 3);
//        replaceValueAtIndex(getIntArray(), 2, 10);
//        replaceValueAtIndex(getStringArray(), 1, "hello world!");
//        getMinAndMaxValue(getIntArray());
//        reverse(getStringArray());
//        reverse(getIntArray());
//        findDuplicateValuesInArray(getStringArray());
//        findDuplicateValuesInArray(getIntArray());
//        findCommonElementsWithinTwoArrays(getStringArray(), getStringArrayTwo());
//        findCommonElementsWithinTwoArrays(getIntArray(), getIntArrayTwo());
//        removeDuplicateValuesFromElement(getStringArray());
//        removeDuplicateValuesFromElement(getIntArray());
//        findSecondLargestInteger(getIntArray());
//        arrayToArrayList();
//        addTwoMatrices();
//        sumOfTwoElementsGivenTarget(10);
//        uniqueTriplets(2);
//        antiDiagonals(matrixList());
    }

    private static void antiDiagonals(List<List<Integer>> list) {

        int size = list.size();
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        tmp.add(list.get(0).get(0));
        result.add(new ArrayList<>(tmp));

        int i = 0;
        int j = i + 1;

        while (j < size) {
            int k = i;
            int l = j;
            tmp.clear();

            while (k < size && l >= 0) {
                tmp.add(list.get(k).get(l));
                k++;
                l--;
            }
            result.add(new ArrayList<>(tmp));
            j++;
        }

        i = 1;
        j = size - 1;

        while (i < size) {
            int k = i;
            int l = j;

            tmp.clear();

            while (k < size && l >= 0) {
                tmp.add(list.get(k).get(l));
                k++;
                l--;
            }
            result.add(new ArrayList<>(tmp));
            i++;
        }

        System.out.println(result);
    }

    private static List<List<Integer>> matrixList() {
        return List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
    }

    /**
     * 1 2
     * 3 4
     *
     * 1
     * 2 3
     * 4
     *
     * 1 2 3
     * 4 5 6
     * 7 8 9
     *
     * 1
     * 2 3
     * 4 5 6
     * 7 8
     * 9
     *
     *  1  2  3  4
     *  5  6  7  8
     *  9 10 11 12
     * 13 14 15 16
     *
     * 01
     * 02 03
     * 04 05 06
     * 07 08 09 10
     * 11 12 13
     * 14 15
     * 16
     *
     */

    private static boolean uniqueTriplets(int target) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(0);
        list.add(5);
        list.add(-1);
        list.add(-4);

        List<List<Integer>> result = new ArrayList<>();

        int numIterations = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                for (int k = j; k < list.size(); k++) {
                    if (i != j && j != k && list.get(i) + list.get(j) + list.get(k) == target) {
                        result.add(List.of(list.get(i), list.get(j), list.get(k)));
                    } else {
                        System.out.println("next iteration = " + numIterations);
                        numIterations++;
                    }
                }
            }
        }
        System.out.println(result);
        return result.isEmpty();
    }

    private static boolean sumOfTwoElementsGivenTarget(int target) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i + j == target) {
                    System.out.println("i = " + i + " j = " + j + " sum = " + (i + j));
                    return true;
                }
            }
        }
        return false;
    }

    private static void addTwoMatrices() {
        int[][] matrixOne = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixTwo = {{7, 8, 9}, {10, 11, 12}};
        int[][] sum = new int[2][3];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j <= sum.length; j++) {
                int m1 = matrixOne[i][j];
                int m2 = matrixTwo[i][j];
                int rs = m1 + m2;
                sum[i][j] = rs;
                System.out.println(
                        "sum of matrixOne(index = " + i + " value = " + m1 + ") and matrixTwo(index = " + j + " value = " + m2 + ") total sum  = " + rs);
            }
        }
    }

    private static void arrayToArrayList() {
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : arr) {
            result.add(i);
        }
        System.out.println(result);
    }

    private static void findSecondLargestInteger(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        List<Integer> integerList = set.stream().sorted().collect(Collectors.toList());
        System.out.println("second largest value = " + integerList.get(integerList.size() - 2));
    }

    private static <E> void removeDuplicateValuesFromElement(ArrayList<E> list) {
        Set<E> result = new HashSet<>(list);
        System.out.println(result);
    }

    private static <E> void findCommonElementsWithinTwoArrays(ArrayList<E> listOne, ArrayList<E> listTwo) {
        Set<E> result = listOne.stream().filter(listOneElement -> {
            for (E listTwoElement : listTwo) {
                if (listTwoElement.equals(listOneElement)) {
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toSet());
        System.out.println("Common elements in the two arrays = ");
        System.out.println(result);
    }


    private static <E> void findDuplicateValuesInArray(ArrayList<E> list) {
        HashMap<E, Integer> map = new HashMap();
        for (E element : list) {
            map.computeIfPresent(element, (k, v) -> v + 1);
            map.putIfAbsent(element, 1);
        }
        map.values().removeIf(v -> v == 1);
        System.out.println(map);
    }

    private static <E> void reverse(ArrayList<E> list) {
        System.out.println("before:");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("after:");
        System.out.println(list);
    }

    private static Map<String, Integer> getMinAndMaxValue(ArrayList<Integer> list) {
        Map<String, Integer> minMaxValues = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer integer : list) {
            if (min > integer) {
                min = integer;
            }
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println("min value = " + min);
        System.out.println("max value = " + max);
        minMaxValues.put("min", min);
        minMaxValues.put("max", max);
        return minMaxValues;
    }


    private static <E> List<E> replaceValueAtIndex(ArrayList<E> list, int index, E newValue) {
        list.remove(index);
        list.add(index, newValue);
        System.out.println(list);
        return list;
    }

    private static <E> ArrayList<E> removeValueByIndex(ArrayList<E> list, int index) {
        if (index < list.size()) {
            System.out.println("before:");
            System.out.println(list);
            list.remove(index);
            System.out.println("after:");
            System.out.println(list);
        } else {
            System.out.println("index out of bounce!");
        }
        return list;
    }

    private static <E> void getIndexValue(ArrayList<E> list, int index) {
        if (index < list.size()) {
            System.out.println(list.get(index));
        } else {
            System.out.println("Index out of bounce!");
        }
    }

    private static <E> boolean containsValue(ArrayList<E> list, E value) {
        boolean containsValue = list.stream().anyMatch(e -> e.hashCode() == value.hashCode());
        System.out.println(containsValue);
        return containsValue;
    }

    private static ArrayList<Integer> getIntArray() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(15);
        list.add(15);
        list.add(11);
        list.add(8);
        list.add(9);
        list.add(17);
        return list;
    }

    private static ArrayList<Integer> getIntArrayTwo() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(20);
        list.add(50);
        list.add(5);
        list.add(100);
        list.add(200);
        list.add(150);
        list.add(111);
        list.add(80);
        list.add(90);
        list.add(170);
        return list;
    }

    private static ArrayList<String> getStringArray() {
        ArrayList<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("world");
        return list;
    }

    private static ArrayList<String> getStringArrayTwo() {
        ArrayList<String> list = new ArrayList<>();
        list.add("xx");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("general");
        list.add("dåse");
        list.add("løs");
        list.add("hello");
        list.add("world");
        list.add("world");
        return list;
    }

    private static int getAverageValue() {
        ArrayList<Integer> list = getIntArray();
        int sum = sumOfIntArray(list);
        int numElements = list.size();

        int averageValue = sum / numElements;
        System.out.println("average value = " + averageValue);
        return averageValue;
    }

    private static void printGrid() {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }
    }

    private static int sumOfIntArray(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("sum of integers = " + sum);
        return sum;
    }

    private static void sortInt(ArrayList<Integer> list) {
        System.out.println("before:");
        System.out.println(list);

        sort(list, Integer::compareTo);

        System.out.println("after:");
        System.out.println(list);
    }

    private static void sortArray(ArrayList<String> list) {
        System.out.println("before:");
        System.out.println(list);

        sort(list, String::compareTo);

        System.out.println("after:");
        System.out.println(list);
    }

    private static <E> ArrayList<E> sort(ArrayList<E> list, Comparator<E> comparator) {
        list.sort(comparator);
        return list;
    }
}
