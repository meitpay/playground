package exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class MainCollections {
    public static void main(String[] args) {
        hashSetStuff();
        hashMapStuff();
    }

    private static void hashMapStuff() {

    }

    private static void hashSetStuff() {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        HashSet<String> set2 = new HashSet<>();
        set2.add("a");
        set2.add("x");
        set2.add("y");

        //print set
        set.forEach(System.out::println);

        // convert
        ArrayList<String> list = new ArrayList<>(set);

        HashSet<String> combined = new HashSet<>();
        set.forEach(e -> set2.forEach(e2 -> {
            if (e.equals(e2)) {
                combined.add(e);
            }
        }));

        System.out.println(combined);

        //clear set
//        set.clear();
    }
}
