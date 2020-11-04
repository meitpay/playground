package lambdas.impl;

import lambdas.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {
    public static void main(String[] args) {
        User sarah = new User("sarah");
        User james = new User("james");
        User mary = new User("mary");
        User john = new User("john");

        List<User> users = List.of(sarah, james, mary, john);

        List<String> names = new ArrayList<>();

        Function<User, String> toName = (User user) -> user.getName();
        Function<User, String> toNameMethodReference = User::getName;

        for (User user : users) {
            String name = toName.apply(user);
            names.add(name);
        }


        users.forEach(u -> System.out.println(u));
        users.forEach(System.out::println);

        names.forEach(n -> System.out.println(n));
        names.forEach(System.out::println);

        users.forEach(user -> System.out.println(user.getName()));

    }
}
