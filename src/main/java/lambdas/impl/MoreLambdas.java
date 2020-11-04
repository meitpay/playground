package lambdas.impl;

import java.util.ArrayList;
import java.util.List;

public class MoreLambdas {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

//        Predicate<String> filter = s -> !s.startsWith("t");
        strings.removeIf(s -> !s.startsWith("t"));

//        Consumer<String> action = s -> System.out.println(s);
        strings.forEach(System.out::println);
    }
}
