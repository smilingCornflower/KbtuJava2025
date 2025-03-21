package Lab7.Animal.com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        System.out.println("Spider testing:");
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        // Cat testing
        System.out.println("\nCat testing:");
        Pet p;
        Cat c = new Cat();
        c.eat();
        c.walk();
        c.play();
        a = new Cat();
        a.eat();
        a.walk();
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();

        // Fish testing
        System.out.println("\nFish testing:");
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();

        a = new Fish();
        a.eat();
        a.walk();

        // playWithAnimal test
        System.out.println("\nplayWithAnimal testing:");
        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);

    }

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        } else {
            System.out.println("Danger! Wild Animal!");
        }

    }

}