package exercises.objects.animal;

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
