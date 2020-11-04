package lambdas.impl;

import lambdas.interfaces.Consumer;
import lambdas.interfaces.Supplier;

public class FirstLambdas {
    public static void main(String[] args) {

        //Supplier
        Supplier<String> supplier = () -> {
            System.out.println("I am inside the supplier");
            return "Hello World!";
        };
        String s = supplier.get();
        System.out.println("String = " + s);

        //consumer
        Consumer<String> consumer = (String string) -> {
            System.out.println("I am inside the consumer");
            System.out.println(string);
        };
        consumer.accept("Hello consumer");
    }
}
