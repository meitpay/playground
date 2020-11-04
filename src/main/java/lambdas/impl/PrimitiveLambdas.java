package lambdas.impl;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> 10;
        int i = intSupplier.getAsInt();
        System.out.println(i);

        DoubleToIntFunction function = value -> (int) Math.floor(value);
        int pi = function.applyAsInt(3.14);
        System.out.println(pi);
    }
}
