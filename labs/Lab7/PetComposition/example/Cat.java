package Lab7.PetComposition.example;


public class Cat extends Animal implements Pet {

    private final Nameable nameable = new NameableImpl();
    private final Ambulatory ambulatory = new AmbulatoryImpl(4);


    public Cat() {
        this("Fluffy");
    }

    public Cat(String name) {
        super();
        nameable.setName(name);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    @Override
    public String getName() {
        return nameable.getName();
    }

    @Override
    public void setName(String name) {
        nameable.setName(name);
    }

    @Override
    public void play() {
        System.out.println(nameable.getName() + " likes to play with string.");
    }

    public void walk() {
        ambulatory.walk();
    }
}