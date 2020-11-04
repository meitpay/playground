package exercises.objects;

public class Animal {
    String sound = "Animals make sounds";

    public Animal() {

    }

    public Animal(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.getSound());
        a.setSound("mjaaaaaaaaaaaaau");
        System.out.println(a.getSound());
    }
}

class Cat extends Animal {
    private String sound = "Mjau";

    public Cat() {
    }

    public Cat(String sound) {
        this.sound = sound;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sound='" + sound + '\'' +
                '}';
    }
}


