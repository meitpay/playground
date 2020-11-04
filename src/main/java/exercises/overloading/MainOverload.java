package exercises.overloading;

public class MainOverload {
    public static void main(String[] args) {
        System.out.println(greeting());
        System.out.println(greeting("Hello boi"));
    }

    static String greeting(String greeting) {
        return greeting;
    }

    static String greeting() {
        return "Hello Friend!";
    }
}
