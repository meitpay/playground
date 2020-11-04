package exercises.objects.animal;

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


