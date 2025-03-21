package Lab7.PetComposition.example;


public class Fish extends Animal implements Pet {
    private Nameable nameable = new NameableImpl();

    public Fish() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
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
        System.out.println("Just keep swimming.");
    }
}