package Lab7.PetComposition.example;

public class Spider extends Animal {
    private final Ambulatory ambulatory = new AmbulatoryImpl(8);

    public Spider() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }

    public void walk() {
        ambulatory.walk();
    }

}