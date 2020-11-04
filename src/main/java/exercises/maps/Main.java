package exercises.maps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        hashMapGet();
        byteThingy();


    }

    private static void byteThingy() {
        byte a=10;
        byte b=20;
        a+=b;
        a= (byte) (a+b);
        System.out.println(a);
    }

    private static void hashMapGet() {
        Person p = new Person("mats", 29);
        HashMap<Person, String> map = new HashMap<>();
        map.put(p, "good boy");
        System.out.println(map.get(p));
    }

}
